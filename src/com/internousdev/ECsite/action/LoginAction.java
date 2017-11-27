package com.internousdev.ECsite.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.CartActionDAO;
import com.internousdev.ECsite.dao.ItemDetailDAO;
import com.internousdev.ECsite.dao.LoginDAO;
import com.internousdev.ECsite.dto.ItemDTO;
import com.internousdev.ECsite.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
    private int id;

    private String user_id="";

    private String password="";

	private String family_name_kana;

	private String family_name;

	private String first_name_kana;

	private String first_name;

	private int sex;

	private String email;

	private boolean hozon;

	public Map<String, Object> session;

	private String errorMessage="";

   private LoginDAO loginDAO = new LoginDAO();

	private UserDTO userDTO = new UserDTO();

	private String save_user ="";



	public String execute() {

		// GET HttpServletRequest
		HttpServletRequest request = ServletActionContext.getRequest();

		// GET HttpServletResponse
		HttpServletResponse response = ServletActionContext.getResponse();

		String result = SUCCESS;
		int log = 0;
		String login_id="";
		boolean LoginResult = false;


		userDTO =loginDAO.userSearch(user_id);

		if(userDTO.getUser_id()==null) {//ID存在チェック
			setErrorMessage("IDが正しくありません。<br>");
			log++;
		}else if(!(userDTO.getUser_id().equals(user_id))){//大文字小文字問題解決用
			setErrorMessage("IDが正しくありません。<br>");
			log++;
		}
		if(userDTO.getPassword()==null){
			setErrorMessage(errorMessage+"入力されたパスワードが異なります。<br>");
			log++;
		}else if(!(userDTO.getPassword().equals(password))){
			setErrorMessage(errorMessage+"入力されたパスワードが異なります。<br>");
			log++;
		}

		if(user_id.equals("")){
			setErrorMessage(errorMessage+"IDを入力してください。<br>");
			log++;
		}
		if(password.equals("")){
			setErrorMessage(errorMessage+"パスワードを入力してください。<br>");
			log++;
		}

		if(user_id.length() < 1){
			setErrorMessage(errorMessage+"IDは1文字以上8文字以下で入力してください。<br>");
			log++;
		}
		if(password.length() < 1){
			setErrorMessage(errorMessage+"パスワードは1文字以上16文字以下で入力してください。<br>");
			log++;
		}

		if(user_id.length() >8){
			setErrorMessage(errorMessage+"IDは1文字以上8文字以下で入力してください。<br>");
			log++;
		}
		if(password.length() > 16){
			setErrorMessage(errorMessage+"パスワードは1文字以上16文字以下で入力してください。<br>");
			log++;
		}

		if (!(user_id.matches("^[a-zA-Z0-9]+$"))) {
			setErrorMessage(errorMessage+"IDは半角英数字で入力してください。<br>");
			log++;
		}

		if (!(password.matches("^[a-zA-Z0-9]+$"))) {
			setErrorMessage(errorMessage+"パスワード半角英数字で入力してください。<br>");
			log++;
		}

		if(log>0){//エラーチェック1以上ならエラー
			result=ERROR;

		}else{
              userDTO = loginDAO.getLoginUserInfo(user_id, password);//ログイン認証

              if(user_id.equals(userDTO.getUser_id())){//ログイン認証：ID
            	  if(password.equals(userDTO.getPassword())){//ログイン認証：パス

                      login_id = userDTO.getUser_id();
                      LoginResult = true;

            	  }
              }
		}

        if(login_id.length()>0) {//DTO内容確認

			session.put("user_id", userDTO.getUser_id());//様々な場面で使うため、user_idをセッションに
			session.put("user_name", userDTO.getFamily_name()+" "+userDTO.getFirst_name());//Home画面で使用するために名前生成

			loginDAO.loginFlg(user_id, 1);//ログインフラグ更新
			result=SUCCESS;

         }

        if(LoginResult){//ログイン成功後、カート更新処理
			if(session.get("tmpID")!=null){//仮ID保存されているか確認

				String tmpID = session.get("tmpID").toString();
				LoginCartUpdate(login_id,tmpID);//カート更新メソッド
			}
        }

		if(hozon){//ID保存にチェックしていたら、クッキー生成。
			Cookie cookie = new Cookie("save_user", user_id);
			cookie.setMaxAge(36000);

	        //httpsで稼働している環境であればCookieが暗号化されるようSecure属性をつける
	        if ("https".equals(request.getScheme())) {
	            cookie.setSecure(true);
	        }
	        response.addCookie(cookie);

		}
		LoginPage();

	return result;
	}

	public String LoginPage() {
		// GET HttpServletRequest
		HttpServletRequest request = ServletActionContext.getRequest();

		Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("save_user".equals(cookie.getName())) {
                	save_user = cookie.getValue();
                    break;
                }
            }
        }

		return SUCCESS;
	}

	public String Logout(){
		if(session.get("user_id")!=null){
			String now_user = session.get("user_id").toString();
			LoginDAO loginDAO = new LoginDAO();
			loginDAO.loginFlg(now_user, 0);
		}

		session.clear();

		return SUCCESS;
	}


	public void LoginCartUpdate(String user_id,String tmpID){

		CartActionDAO CADAO = new CartActionDAO();
		ItemDetailDAO ItemDAO = new ItemDetailDAO();


		int tmpIDCartcount = CADAO.CartCount(tmpID);//仮IDカート投入種類数検索
		int userIDCartcount =CADAO.CartCount(user_id);//本IDカート投入種類数検索

		if(tmpIDCartcount>0){//仮IDカート投入数無ければ無視
			if(userIDCartcount>0){//本IDカート投入数無ければID変換のみ

				ArrayList<ItemDTO> tmpIDCartList = new ArrayList<ItemDTO>();
				ArrayList<ItemDTO> userIDCartList = new ArrayList<ItemDTO>();
				tmpIDCartList = CADAO.CartShow(tmpID);
				userIDCartList = CADAO.CartShow(user_id);

				Iterator<ItemDTO> tmpIDArray = tmpIDCartList.iterator();
				Iterator<ItemDTO> userIDArray = userIDCartList.iterator();
				int CheckCount = 0;
				int[][] CheckList;

				if(tmpIDCartcount>userIDCartcount){
					CheckList = new int[tmpIDCartcount][2];
				}else{
					CheckList = new int[userIDCartcount][2];
				}

				while(tmpIDArray.hasNext()){//仮IDListの回転軸
					ItemDTO tmpDTO = tmpIDArray.next();
					userIDArray = userIDCartList.iterator();

					while(userIDArray.hasNext()){//本IDListの回転軸
						ItemDTO userDTO = userIDArray.next();

						if(tmpDTO.getProduct_id()==userDTO.getProduct_id()){//仮IDと本IDの商品IDが一致したら記録
							CheckList[CheckCount][0] = tmpDTO.getProduct_id();
							CheckList[CheckCount][1] = tmpDTO.getId();
							CheckCount++;
						}

					}
				}

				if(CheckCount>0){
					for(int i=0;i<CheckCount;i++){
						int Pid = CheckList[i][0];
						int total_item_count = CADAO.CartSearch_PId_ItemCount(user_id, Pid)+CADAO.CartSearch_PId_ItemCount(tmpID, Pid);
						ItemDTO Item = new ItemDTO();
						Item = ItemDAO.detail(Pid);

						if(total_item_count>Item.getStock()){//重複合計値、在庫以下ならそのまま、在庫より多ければ在庫上限
							total_item_count = Item.getStock();
						}

						CADAO.CartUpdate(user_id, Pid, total_item_count);//重複部分の合計値更新
						CADAO.CartDell(tmpID, CheckList[i][1]);//仮IDの重複部分削除
					}

				}
			}//本IDカート投入数無ければID変換のみ

			CADAO.CartLoginUpdate(tmpID, user_id);//仮IDでカートに入れたものを本IDに更新
		}//仮IDカート投入数無ければ無視

	}


	/**
	 * @return errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}



	/**
	 * @param errorMessage セットする errorMessage
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}



	/**
	 * idを取得します。
	 * @return id
	 */
	public int getId() {
	    return id;
	}



	/**
	 * idを設定します。
	 * @param id id
	 */
	public void setId(int id) {
	    this.id = id;
	}



	/**
	 * user_idを取得します。
	 * @return user_id
	 */
	public String getUser_id() {
	    return user_id;
	}



	/**
	 * user_idを設定します。
	 * @param user_id user_id
	 */
	public void setUser_id(String user_id) {
	    this.user_id = user_id;
	}



	/**
	 * passwordを取得します。
	 * @return password
	 */
	public String getPassword() {
	    return password;
	}



	/**
	 * passwordを設定します。
	 * @param password password
	 */
	public void setPassword(String password) {
	    this.password = password;
	}



	/**
	 * family_name_kanaを取得します。
	 * @return family_name_kana
	 */
	public String getFamily_name_kana() {
	    return family_name_kana;
	}



	/**
	 * family_name_kanaを設定します。
	 * @param family_name_kana family_name_kana
	 */
	public void setFamily_name_kana(String family_name_kana) {
	    this.family_name_kana = family_name_kana;
	}



	/**
	 * family_nameを取得します。
	 * @return family_name
	 */
	public String getFamily_name() {
	    return family_name;
	}



	/**
	 * family_nameを設定します。
	 * @param family_name family_name
	 */
	public void setFamily_name(String family_name) {
	    this.family_name = family_name;
	}



	/**
	 * first_name_kanaを取得します。
	 * @return first_name_kana
	 */
	public String getFirst_name_kana() {
	    return first_name_kana;
	}



	/**
	 * first_name_kanaを設定します。
	 * @param first_name_kana first_name_kana
	 */
	public void setFirst_name_kana(String first_name_kana) {
	    this.first_name_kana = first_name_kana;
	}



	/**
	 * first_nameを取得します。
	 * @return first_name
	 */
	public String getFirst_name() {
	    return first_name;
	}



	/**
	 * first_nameを設定します。
	 * @param first_name first_name
	 */
	public void setFirst_name(String first_name) {
	    this.first_name = first_name;
	}



	/**
	 * sexを取得します。
	 * @return sex
	 */
	public int getSex() {
	    return sex;
	}



	/**
	 * sexを設定します。
	 * @param sex sex
	 */
	public void setSex(int sex) {
	    this.sex = sex;
	}



	/**
	 * emailを取得します。
	 * @return email
	 */
	public String getEmail() {
	    return email;
	}



	/**
	 * emailを設定します。
	 * @param email email
	 */
	public void setEmail(String email) {
	    this.email = email;
	}





	/**
	 * hozonを取得します。
	 * @return hozon
	 */
	public boolean isHozon() {
	    return hozon;
	}



	/**
	 * hozonを設定します。
	 * @param hozon hozon
	 */
	public void setHozon(boolean hozon) {
	    this.hozon = hozon;
	}



	/**
	 * sessionを取得します。
	 * @return session
	 */
	public Map<String,Object> getSession() {
	    return session;
	}



	public String getSave_user() {
		return save_user;
	}

	public void setSave_user(String save_user) {
		this.save_user = save_user;
	}

	/**
	 * sessionを設定します。
	 * @param session session
	 */
	public void setSession(Map<String,Object> session) {
	    this.session = session;
	}}






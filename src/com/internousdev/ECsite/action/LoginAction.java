package com.internousdev.ECsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.LoginDAO;
import com.internousdev.ECsite.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
    private int id;

    private String user_id;

    private String password;

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



	public String execute() {
		String result = SUCCESS;
		int log = 0;

		userDTO =loginDAO.userSearch(user_id);



		if(userDTO.getUser_id()==null) {
			setErrorMessage("IDが正しくありません。<br>");
			log++;
		}

		if(!(userDTO.getPassword().equals(password))){
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

		if(log>0){
			result=ERROR;
		}else{

              userDTO = loginDAO.getLoginUserInfo(user_id, password);
              if(user_id.equals(userDTO.getUser_id())){
            	  if(password.equals(userDTO.getPassword())){
                      session.put("user_id", userDTO.getUser_id());
        			String login_id = userDTO.getUser_id();
        		if(login_id!=null) {
        				boolean flgresult = loginDAO.loginFlg(user_id, 1);

        				if(flgresult){
        					result=SUCCESS;
        					}
            	  }
              }

	}
		}
	return result;
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



	/**
	 * sessionを設定します。
	 * @param session session
	 */
	public void setSession(Map<String,Object> session) {
	    this.session = session;
	}}






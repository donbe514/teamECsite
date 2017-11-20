package com.internousdev.ECsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.LoginDAO;
import com.internousdev.ECsite.dao.SaipassDAO;
import com.internousdev.ECsite.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SaipassComplateAction extends ActionSupport implements SessionAware{
	private String user_id;

	private String saipassword;

	private String resaipassword;

	public Map<String, Object> session;

	private String errorMessage="";

	private SaipassDAO saipassDAO = new SaipassDAO();

	public String execute() throws SQLException{

	 String result = SUCCESS;
	 int count =0;

	 LoginDAO loginDAO = new LoginDAO();
	 UserDTO userDTO = new UserDTO();
	 userDTO = loginDAO.userSearch(user_id);

		if(userDTO.getUser_id() == null) {
			setErrorMessage("IDが正しくありません。<br>");
			count++;
		}



		if(!(saipassword.equals(resaipassword))) {

			setErrorMessage(errorMessage+"入力されたパスワードが異なります。<br>");
			count++;
		}

		if(user_id.equals("")){
			setErrorMessage(errorMessage+"IDを入力してください。<br>");
			count++;
		}

		if(saipassword.equals("")){
			setErrorMessage(errorMessage+"新しいパスワードを入力してください。<br>");
			count++;
		}

		if(resaipassword.equals("")){
			setErrorMessage(errorMessage+"確認用のパスワードを入力してください。<br>");
			count++;
		}

		if(saipassword.length() > 16 ){
			setErrorMessage(errorMessage+"新しいパスワードは「1文字以上16文字以下」で入力してください。<br>");
	        count++;
		}

		if(resaipassword.length() > 16){
			setErrorMessage(errorMessage+"確認用のパスワードは「1文字以上16文字以下」で入力してください。<br>");
			count++;
		}

		if(saipassword.length() < 1){
			setErrorMessage(errorMessage+"新しいパスワードは「1文字以上16文字以下」で入力してください。<br>");
			count++;
		}

		if(resaipassword.length() <1){
			setErrorMessage(errorMessage+"確認用のパスワードは「1文字以上16文字以下」で入力してください<br>");
			count++;
		}

		if (!(saipassword.matches("^[a-zA-Z0-9]+$"))) {
			setErrorMessage(errorMessage+"パスワードは「半角英数字」で入力してください。<br>");
		    count++;
		}

		if (!(resaipassword.matches("^[a-zA-Z0-9]+$"))) {
			setErrorMessage(errorMessage+"パスワードは「半角英数字」で入力してください。<br>");
		    count++;
		}


        if(count>0){
			result=ERROR;
		}else{
			saipassDAO.createSaipass((saipassword),(user_id));
		}





/*


	 if(!(saipassword.equals("")) && !(resaipassword.equals(""))) {
		 session.put("saipassword", saipassword);
		 session.put("resaipassword", resaipassword);
	 } else{

		 setErrorMessage("パスワードが合致してません");
		 result = ERROR;
	 }
*/

    		 return result;
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
	 * saipasswordを取得します。
	 * @return saipassword
	 */
	public String getSaipassword() {
	    return saipassword;
	}

	/**
	 * saipasswordを設定します。
	 * @param saipassword saipassword
	 */
	public void setSaipassword(String saipassword) {
	    this.saipassword = saipassword;
	}

	/**
	 * resaipasswordを取得します。
	 * @return resaipassword
	 */
	public String getResaipassword() {
	    return resaipassword;
	}

	/**
	 * resaipasswordを設定します。
	 * @param resaipassword resaipassword
	 */
	public void setResaipassword(String resaipassword) {
	    this.resaipassword = resaipassword;
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
	}

	/**
	 * errorMessageを取得します。
	 * @return errorMessage
	 */
	public String getErrorMessage() {
	    return errorMessage;
	}

	/**
	 * errorMessageを設定します。
	 * @param errorMessage errorMessage
	 */
	public void setErrorMessage(String errorMessage) {
	    this.errorMessage = errorMessage;
	}







}



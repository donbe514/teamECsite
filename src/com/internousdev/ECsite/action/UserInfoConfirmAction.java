package com.internousdev.ECsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.UserIdDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoConfirmAction extends ActionSupport implements SessionAware {


	public String family_name_kana;

	public String family_name;

	public String first_name_kana;

	public String first_name;

	public int sex;

	public String email;

	public String user_id;

	public Map<String, Object> session;

	public List<String> errorMessage = new ArrayList<>();

	public UserIdDAO userIdDAO = new UserIdDAO();

	public String password;

	public String result;



	public String execute() throws SQLException {

		String result = SUCCESS;

		if(!(user_id.equals("")) && !(password.equals("")) && !(family_name_kana.equals("")) && !(family_name.equals("")) && !(first_name_kana.equals("")) && !(first_name.equals(""))  && !(email.equals(""))) {
			session.put("user_id" , user_id);
			session.put("password", password);
			session.put("family_name_kana" , family_name_kana);
			session.put("family_name" , family_name);
			session.put("first_name_kana" , first_name_kana);
			session.put("first_name" , first_name);
			session.put("sex", sex);
			session.put("email" , email);

		}


		if((userIdDAO.user_count(user_id)==1)){
			errorMessage.add("ユーザーIDがすでに登録されています。");
			result = ERROR;
		}

		if(user_id.equals("")){
			errorMessage.add("ユーザーIDを入力してください。");
			result = ERROR;
		}

		if(password.equals("")){
			errorMessage.add("パスワードを入力してください。");
			result = ERROR;
		}
		if(family_name.equals("")){
			errorMessage.add("姓を入力してください。");
			result = ERROR;
		}
		if(first_name.equals("")){
			errorMessage.add("名を入力してください。");
			result = ERROR;
		}
		if(family_name_kana.equals("")){
			errorMessage.add("姓ふりがなを入力してください。");
			result = ERROR;
		}
		if(first_name_kana.equals("")){
			errorMessage.add("名ふりがなを入力してください。");
			result = ERROR;
		}

		if(email.equals("")){
			errorMessage.add("メールアドレスを入力してください。");
			result = ERROR;
		}


		if(family_name.length()<1 || family_name.length()>16){
			errorMessage.add("姓は1文字以上16文字以下で入力してください。");
			result = ERROR;
		}
		if(first_name.length()<1 || first_name.length()>16){
			errorMessage.add("名は1文字以上16文字以下で入力してください。");
			result = ERROR;
		}
		if(family_name_kana.length()<1 || family_name_kana.length()>16){
			errorMessage.add("姓ふりがなは1文字以上16文字以下で入力してください。");
			result = ERROR;
		}
		if(first_name_kana.length()<1 || first_name_kana.length()>16){
			errorMessage.add("名ふりがなは1文字以上16文字以下で入力してください。");
			result = ERROR;
		}

		if(email.length()<18 || email.length()>32){
			errorMessage.add("メールアドレスは18文字以上32文字以下で入力してください。");
			result = ERROR;
		}
		if (!(family_name_kana.matches("^[\\u3040-\\u309F]+$"))) {
			errorMessage.add("姓ふりがなはひらがなで入力してください。");
			result = ERROR;
		}
		if (!(first_name_kana.matches("^[\\u3040-\\u309F]+$"))) {
			errorMessage.add("名ふりがなはひらがなで入力してください。");
			result = ERROR;
		}


		if (password.matches("/^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")) {
			errorMessage.add("パスワードは半角英数字、半角記号で入力してください。");
			result = ERROR;
		}



		return result;

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

	public String getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id セットする user_id
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return userIdDAO
	 */
	public UserIdDAO getUserIdDAO() {
		return userIdDAO;
	}
	/**
	 * @param userIdDAO セットする userIdDAO
	 */
	public void setUserIdDAO(UserIdDAO userIdDAO) {
		this.userIdDAO = userIdDAO;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}



}

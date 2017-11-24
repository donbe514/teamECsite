package com.internousdev.ECsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.UserIdDAO;
import com.internousdev.ECsite.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoConfirmAction extends ActionSupport implements SessionAware {


	public String family_name_kana;

	public String family_name;

	public String first_name_kana;

	public String first_name;

	public String sex;

	public String email;

	public String user_id;

	public Map<String, Object> session;

	public List<String> errorMessage = new ArrayList<>();

	public UserIdDAO userIdDAO = new UserIdDAO();

	public String password;

	public String result;



	public String execute() throws SQLException {

		String result = ERROR;
		int ErrorCount = 0;
		int intsex = 0;

		session.put("user_id", null);

/*　　　　ユーザーID　　　　*/
		if((userIdDAO.user_count(user_id)>0)){
			errorMessage.add("ユーザーIDがすでに登録されています。");
			ErrorCount++;
		}
		if(user_id.length()<1||user_id.length()>8){
			errorMessage.add("ユーザーIDは1文字以上8文字以内で入力してください。");
			ErrorCount++;
		}
		if(user_id.equals("")||user_id.matches("^[ 　]+$")){
			errorMessage.add("ユーザーIDを入力してください。");
			ErrorCount++;
		}
		if (!user_id.matches("^[a-zA-Z0-9]+$")) {
			errorMessage.add("ユーザーIDは半角英数字で入力してください。");
			ErrorCount++;
		}

/*　　　　パスワード　　　　*/
		if(password.length()<1||password.length()>16){
			errorMessage.add("パスワードは1文字以上16文字以内で入力してください。");
			ErrorCount++;
		}
		if(password.equals("")||password.matches("^[ 　]+$")){
			errorMessage.add("パスワードを入力してください。");
			ErrorCount++;
		}
		if (!password.matches("^[a-zA-Z0-9]+$")) {
			errorMessage.add("パスワードは半角英数字で入力してください。");
			ErrorCount++;
		}

/*　　　　姓　　　　*/
		if(family_name.equals("")||family_name.matches("^[ 　]+$")){
			errorMessage.add("姓を入力してください。");
			ErrorCount++;
		}
		if(family_name.length()<1 || family_name.length()>16){
			errorMessage.add("姓は1文字以上16文字以下で入力してください。");
			ErrorCount++;
		}
		if(!family_name.matches("^[a-zA-Zぁ-ゞ一-龠]+$") ){
			errorMessage.add("姓は半角英語･ひらがな･漢字で入力してください。");
			ErrorCount++;
		}

/*　　　　名　　　　*/
		if(first_name.equals("")||first_name.matches("^[ 　]+$")){
			errorMessage.add("名を入力してください。");
			ErrorCount++;
		}
		if(first_name.length()<1 || first_name.length()>16){
			errorMessage.add("名は1文字以上16文字以下で入力してください。");
			ErrorCount++;
		}
		if(!first_name.matches("^[a-zA-Zぁ-ゞ一-龠]+$")){
			errorMessage.add("名は半角英語･ひらがな･漢字で入力してください。");
			ErrorCount++;
		}

/*　　　　姓ふりがな　　　　*/
		if(family_name_kana.equals("")||family_name_kana.matches("^[ 　]+$")){
			errorMessage.add("姓ふりがなを入力してください。");
			ErrorCount++;
		}
		if(family_name_kana.length()<1 || family_name_kana.length()>16){
			errorMessage.add("姓ふりがなは1文字以上16文字以下で入力してください。");
			ErrorCount++;
		}
		if (!(family_name_kana.matches("^[\\u3040-\\u309F]+$"))) {
			errorMessage.add("姓ふりがなはひらがなで入力してください。");
			ErrorCount++;
		}

/*　　　　名ふりがな　　　　*/
		if(first_name_kana.equals("")||first_name_kana.matches("^[ 　]+$")){
			errorMessage.add("名ふりがなを入力してください。");
			ErrorCount++;
		}
		if(first_name_kana.length()<1 || first_name_kana.length()>16){
			errorMessage.add("名ふりがなは1文字以上16文字以下で入力してください。");
			ErrorCount++;
		}
		if (!(first_name_kana.matches("^[\\u3040-\\u309F]+$"))) {
			errorMessage.add("名ふりがなはひらがなで入力してください。");
			ErrorCount++;
		}

/*　　　　メールアドレス　　　　*/
		if(email.equals("")||email.matches("^[ 　]+$")){
			errorMessage.add("メールアドレスを入力してください。");
			ErrorCount++;
		}
		if(email.length()<18 || email.length()>32){
			errorMessage.add("メールアドレスは18文字以上32文字以下で入力してください。");
			ErrorCount++;
		}
		if (!email.matches("^[a-zA-Z0-9#$%&'_`/=~\\*\\+\\-\\?\\^\\{\\|\\}]+(\\.[a-zA-Z0-9!#$%&'_`/=~\\*\\+\\-\\?\\^\\{\\|\\}]+)*+(.*)@[a-zA-Z0-9][a-zA-Z0-9\\-]*(\\.[a-zA-Z0-9\\-]+)+$")) {
			errorMessage.add("正しいメールアドレスの形式で入力してください。");
			ErrorCount++;
		}

/*　　　　性別　　　　*/

		if (!(sex.matches("^[0-9]+$"))) {
			errorMessage.add("性別の値が不正です。");
			ErrorCount++;
		}else{
			intsex = Integer.parseInt(sex);
		}

		if(ErrorCount>0) {
			result = ERROR;
		}else{
			UserDTO user = new UserDTO();
			user.setUser_id(user_id);
			user.setPassword(password);
			user.setFamily_name(family_name);
			user.setFirst_name(first_name);
			user.setFamily_name_kana(family_name_kana);
			user.setFirst_name_kana(first_name_kana);
			user.setSex(intsex);
			user.setEmail(email);
			session.put("new_userdata", user);
			result = SUCCESS;
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
	public String getSex() {
	    return sex;
	}

	/**
	 * sexを設定します。
	 * @param sex sex
	 */
	public void setSex(String sex) {
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

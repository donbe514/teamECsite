package com.internousdev.ECsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.UserInfoComplateDAO;
import com.internousdev.ECsite.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoComplateAction extends ActionSupport implements SessionAware {

	public String family_name_kana;

	public String family_name;

	public String first_name_kana;

	public String first_name;

	public int sex;

	public String email;

	public String user_id;

	public String password;

	public Map<String,Object> session;

	public UserInfoComplateDAO userInfoComplateDAO = new UserInfoComplateDAO();



	public String execute() throws SQLException {
		UserDTO user = new UserDTO();
		session.put("user_id", null);
		user = (UserDTO)session.get("new_userdata");


		userInfoComplateDAO.createUser(user.getUser_id(),user.getPassword(),
				user.getFirst_name(),user.getFamily_name(),user.getFirst_name_kana(),user.getFamily_name_kana(),
				user.getSex(),user.getEmail());

		return SUCCESS ;
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
	 * @return sex
	 */
	public int getSex() {
		return sex;
	}

	/**
	 * @param sex セットする sex
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

	/**
	 * @return user_id
	 */
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



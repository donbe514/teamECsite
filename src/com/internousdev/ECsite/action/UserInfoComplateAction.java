package com.internousdev.ECsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.UserInfoComplateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoComplateAction extends ActionSupport implements SessionAware {

	private String family_name_kana;

	private String family_name;

	private String first_name_kana;

	private String first_name;

	private String sex;

	private String email;

	public Map<String,Object> session;

	private UserInfoComplateDAO userInfoComplateDAO = new UserInfoComplateDAO();

	public String execute() throws SQLException {

		userInfoComplateDAO.createUser(session.get("family_name_kana").toString(),
			session.get("family_name").toString(),
			session.get("first_name_kana").toString(),
			session.get("first_name").toString(),
			Integer.parseInt(session.get("sex").toString()),
			session.get("email").toString());

		String result = SUCCESS;

		return result ;
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
	}}



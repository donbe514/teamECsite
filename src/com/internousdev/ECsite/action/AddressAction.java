package com.internousdev.ECsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.AddressDAO;
import com.internousdev.ECsite.dto.AddressDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AddressAction extends ActionSupport implements SessionAware {

	public String putFamily_name;
	public String putFirst_name;
	public String putFamily_name_kana;
	public String putFirst_name_kana;
	/*public String sex;*/
	public String putUser_address;
	public String putTel_number;
	public String putEmail;

	public Map<String,Object> session;

	public AddressDAO addressDAO = new AddressDAO();

	public List<AddressDTO> addressDTOList = new ArrayList<AddressDTO>();



	public String execute() throws SQLException{
	//session.put("user_id", "taro");		//後で消す テスト用
		String result = ERROR;

		if(session.get("user_id")!=null){//ユーザーログインしていなかったら、ログイン画面に飛ばす用　*駒村
			String user_id = session.get("user_id").toString();
			addressDTOList = addressDAO.getAddressInfo(user_id);

			result = SUCCESS;

		}

		return result;

	}






	/**
	 * @return addressDAO
	 */
	public AddressDAO getAddressDAO() {
		return addressDAO;
	}






	/**
	 * @param addressDAO セットする addressDAO
	 */
	public void setAddressDAO(AddressDAO addressDAO) {
		this.addressDAO = addressDAO;
	}






	/**
	 * @return addressDTOList
	 */
	public List<AddressDTO> getAddressDTOList() {
		return addressDTOList;
	}






	/**
	 * @param addressDTOList セットする addressDTOList
	 */
	public void setAddressDTOList(List<AddressDTO> addressDTOList) {
		this.addressDTOList = addressDTOList;
	}






	/**
	 * @return putFamily_name
	 */
	public String getPutFamily_name() {
		return putFamily_name;
	}

	/**
	 * @param putFamily_name セットする putFamily_name
	 */
	public void setPutFamily_name(String putFamily_name) {
		this.putFamily_name = putFamily_name;
	}

	/**
	 * @return putFirst_name
	 */
	public String getPutFirst_name() {
		return putFirst_name;
	}

	/**
	 * @param putFirst_name セットする putFirst_name
	 */
	public void setPutFirst_name(String putFirst_name) {
		this.putFirst_name = putFirst_name;
	}

	/**
	 * @return putFamily_name_kana
	 */
	public String getPutFamily_name_kana() {
		return putFamily_name_kana;
	}

	/**
	 * @param putFamily_name_kana セットする putFamily_name_kana
	 */
	public void setPutFamily_name_kana(String putFamily_name_kana) {
		this.putFamily_name_kana = putFamily_name_kana;
	}

	/**
	 * @return putFirst_name_kana
	 */
	public String getPutFirst_name_kana() {
		return putFirst_name_kana;
	}

	/**
	 * @param putFirst_name_kana セットする putFirst_name_kana
	 */
	public void setPutFirst_name_kana(String putFirst_name_kana) {
		this.putFirst_name_kana = putFirst_name_kana;
	}

	/**
	 * @return putUser_address
	 */
	public String getPutUser_address() {
		return putUser_address;
	}

	/**
	 * @param putUser_address セットする putUser_address
	 */
	public void setPutUser_address(String putUser_address) {
		this.putUser_address = putUser_address;
	}

	/**
	 * @return putTel_number
	 */
	public String getPutTel_number() {
		return putTel_number;
	}

	/**
	 * @param putTel_number セットする putTel_number
	 */
	public void setPutTel_number(String putTel_number) {
		this.putTel_number = putTel_number;
	}

	/**
	 * @return putEmail
	 */
	public String getPutEmail() {
		return putEmail;
	}

	/**
	 * @param putEmail セットする putEmail
	 */
	public void setPutEmail(String putEmail) {
		this.putEmail = putEmail;
	}

	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}





}

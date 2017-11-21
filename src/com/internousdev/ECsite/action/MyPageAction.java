package com.internousdev.ECsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.MyPageDAO;
import com.internousdev.ECsite.dto.UserDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{


	//ログイン情報を格納
	public Map<String,Object> Session;


	//ユーザー情報
	public String first_name;

	public String family_name;

	public String first_name_kana;

	public String family_name_kana;

	public int sex;

	public String email;

	public int logined;


	//マイページ情報取得DAO
	public MyPageDAO mypageDAO = new MyPageDAO();


	//マイページ情報格納DTO
	public UserDTO userDTO = new UserDTO();


	//処理結果
	public String result;




	public String execute(){
		result=ERROR;
		if(Session.get("user_id")!=null){
			userDTO = mypageDAO.getUserInfo((String) Session.get("user_id"));

			logined = userDTO.getLogined();
			//logined =1;


			if(logined == 0){
				result = ERROR;
			}

			else{
				first_name = userDTO.getFirst_name();
				family_name = userDTO.getFamily_name();
				first_name_kana = userDTO.getFirst_name_kana();
				family_name_kana = userDTO.getFamily_name_kana();
				sex = userDTO.getSex();
				email = userDTO.getEmail();


				result =SUCCESS;
			}
		}
	return result;
	}





	public void setSession(Map<String, Object> session) {
		Session = session;
	}





	public String getFirst_name() {
		return first_name;
	}





	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}





	public String getFamily_name() {
		return family_name;
	}





	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}





	public String getFirst_name_kana() {
		return first_name_kana;
	}





	public void setFirst_name_kana(String first_name_kana) {
		this.first_name_kana = first_name_kana;
	}





	public String getFamily_name_kana() {
		return family_name_kana;
	}





	public void setFamily_name_kana(String family_name_kana) {
		this.family_name_kana = family_name_kana;
	}





	public int getSex() {
		return sex;
	}





	public void setSex(int sex) {
		this.sex = sex;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public int getLogined() {
		return logined;
	}





	public void setLogined(int logined) {
		this.logined = logined;
	}





}

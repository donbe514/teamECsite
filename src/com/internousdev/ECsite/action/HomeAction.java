package com.internousdev.ECsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.util.RandomForm;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;


	public String execute(){

		RandomForm rf = new RandomForm();
		session.put("tmpID", rf.RandomStr(16));//16桁の仮IDの発行
		//System.out.print(session.get("tmpID"));
		//session.put("user_id","taro");

		return SUCCESS;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



}

package com.internousdev.ECsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.ItemDAO;
import com.internousdev.ECsite.dto.ItemDTO;
import com.internousdev.ECsite.util.RandomForm;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	public ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();


	public String execute(){

		RandomForm rf = new RandomForm();
		session.put("tmpID", rf.RandomStr(16));//16桁の仮IDの発行
		ItemDAO itemDAO = new ItemDAO();
		itemList = itemDAO.select(0, "",1,1);

		return SUCCESS;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public ArrayList<ItemDTO> getItemList() {
		return itemList;
	}


	public void setItemList(ArrayList<ItemDTO> itemList) {
		this.itemList = itemList;
	}



}

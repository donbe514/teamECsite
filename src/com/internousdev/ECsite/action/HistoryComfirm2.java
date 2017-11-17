package com.internousdev.ECsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.HistoryActionDAO;
import com.internousdev.ECsite.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HistoryComfirm2 extends ActionSupport implements SessionAware{

	String del_id;

	String result;

	public Map<String, Object> session;

	public ArrayList<ItemDTO> historyList = new ArrayList<ItemDTO>();


	public String execute() throws SQLException{

		if(del_id == null){
			result = ERROR;

			HistoryActionDAO historyAction = new HistoryActionDAO();
			String user_id = session.get("user_id").toString();
			historyList = historyAction.getMyPageUserInfo(user_id);
		}
		else{
		session.put("del_id",del_id);
		result = SUCCESS;
		}


		return result;


	}

	public String getDel_id() {
		return del_id;
	}

	public void setDel_id(String del_id) {
		this.del_id = del_id;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}





}

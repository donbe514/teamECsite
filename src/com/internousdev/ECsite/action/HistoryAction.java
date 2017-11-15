package com.internousdev.ECsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.HistoryActionDAO;
import com.internousdev.ECsite.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HistoryAction extends ActionSupport implements SessionAware {


    public Map<String, Object> session;

    public ArrayList<ItemDTO> historyList = new ArrayList<ItemDTO>();
    private boolean HistryFlag = false;

    public String historyshow() throws SQLException{

        HistoryActionDAO historyAction = new HistoryActionDAO();

        String result = SUCCESS;

        String user_id = session.get("user_id").toString();


    historyList = historyAction.getMyPageUserInfo(user_id);
    if(historyList.isEmpty()){
    	HistryFlag = true;
    }

    return result;
    }


    public String delete() throws SQLException{

        String result = SUCCESS;

        String user_id = session.get("user_id").toString();

        HistoryActionDAO historyAction = new HistoryActionDAO();

        historyAction.Delete(user_id);

        HistryFlag = true;

        return result;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public ArrayList<ItemDTO> getHistoryList() {
        return historyList;
    }

    public void setHistoryList(ArrayList<ItemDTO> historyList) {
        this.historyList = historyList;
    }


	public boolean isHistryFlag() {
		return HistryFlag;
	}


	public void setHistryFlag(boolean histryFlag) {
		HistryFlag = histryFlag;
	}


}
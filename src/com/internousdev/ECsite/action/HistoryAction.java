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

    //全削除
    public String delete() throws SQLException{

        String result = SUCCESS;

        String user_id = session.get("user_id").toString();

        HistoryActionDAO historyAction = new HistoryActionDAO();

        historyAction.Delete(user_id);

        HistryFlag = true;

        return result;
    }

    //選択削除
    public String partDelete() throws SQLException{

    	String result;

    	String user_id = session.get("user_id").toString();

    	String del_id = session.get("del_id").toString();


    	//１つの文字列をカンマ区切りにして配列化
		String[] del = del_id.split(",");

		//配列数を変数に代入
		int delcount = del.length;



		for(int i=0;i<delcount;i++){

			//配列の中の文字列の先頭にある空白を削除
			String new_del_id = del[i].trim();

			//文字列を数字に変換
			int delitem = Integer.parseInt(new_del_id);


			HistoryActionDAO historyAction = new HistoryActionDAO();
			historyAction.partDel(user_id, delitem);
		}

    	result=historyshow();

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
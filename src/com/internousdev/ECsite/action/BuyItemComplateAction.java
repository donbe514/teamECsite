package com.internousdev.ECsite.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemComplateAction extends ActionSupport implements SessionAware {

	public Map<String,Object> purchase_history_infoSession = new HashMap<String,Object>();

	public String result;

	 //商品購入情報登録完了メソッド
	public String execute() {

		result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> purchase_history_infoSession ) {
		this.purchase_history_infoSession = purchase_history_infoSession;
	}




}

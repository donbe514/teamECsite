package com.internousdev.ECsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.ManagementComplateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ManagementConfilmAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	public String result;
	public ManagementComplateDAO dao = new ManagementComplateDAO();

	public String execute() {

		if(session.get("stock")!=null){
			//商品在庫数更新
			dao.updateStock(
				Integer.parseInt(session.get("stock").toString()),
				session.get("product_name").toString());
		}

		result = SUCCESS;
		return result;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
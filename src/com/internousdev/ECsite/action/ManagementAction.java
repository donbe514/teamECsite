package com.internousdev.ECsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.ManagementDAO;
import com.internousdev.ECsite.dto.ManagementDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ManagementAction  extends ActionSupport implements SessionAware{

	public int product_id;//商品ID
	public String product_name;//商品名
	public int stock;//商品在庫数
	public Map<String,Object> session;
	public String result;

	public ManagementDAO dao = new ManagementDAO();
	public ArrayList<ManagementDTO> ManagementList = new ArrayList<ManagementDTO>();

	public String execute() {
		result = ERROR;

		if(session.get("user_id")!=null){
			String user_id = session.get("user_id").toString();

			if(user_id.equals("taro")){
				ManagementList = dao.getInfo();
				result = SUCCESS;
			}
		}
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}

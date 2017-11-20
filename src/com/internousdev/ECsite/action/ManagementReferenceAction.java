package com.internousdev.ECsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.ManagementDAO;
import com.internousdev.ECsite.dto.ManagementDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ManagementReferenceAction extends ActionSupport implements SessionAware{

	public ManagementDAO dao = new ManagementDAO();
	public ManagementDTO dto = new ManagementDTO();
	public Map<String,Object> session;
	public String result;
	public String product_name;//商品名
	public int stock;// 商品在庫追加数
	public int beforeStock;//追加前商品在庫数（現在値）

	public String execute() {

			//商品情報参照
			dto = dao.referenceInfo(product_name);
			session.put("product_name",dto.getProduct_name());
			session.put("beforeStock",dto.getStocks());
			session.put("stock", dto.getStocks() + stock);

			result = SUCCESS;
			return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
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

	public int getBeforeStock() {
		return beforeStock;
	}

	public void setBeforeStocks(int beforeStock) {
		this.beforeStock = beforeStock;
	}
}

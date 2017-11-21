package com.internousdev.ECsite.action;

import java.util.ArrayList;
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
	public String message= "";
	public int ErrorCount = 0;
	public ArrayList<ManagementDTO> ManagementList = new ArrayList<ManagementDTO>();

	public String execute() {
		int SumStock = dao.StockCount();
		result = ERROR;

		if(stock>1000){
			message=message+"1000を越える入荷数が入力されました。<br>";
			ErrorCount++;
		}

		if(stock<0){
			message=message+"0未満の値が入力されました。<br>";
			ErrorCount++;
		}

		if((SumStock+stock)>10000){
			message=message+"全商品合計1万を超える値になります。<br>";
			ErrorCount++;
		}

		if(ErrorCount<1){

			//商品情報参照
			dto = dao.referenceInfo(product_name);
			session.put("product_name",dto.getProduct_name());
			session.put("beforeStock",dto.getStocks());
			session.put("stock", dto.getStocks() + stock);

			result = SUCCESS;

		}else{
		ManagementList = dao.getInfo();
		}
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

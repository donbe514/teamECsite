package com.internousdev.ECsite.dto;

public class ManagementDTO {

	private int product_id; //商品ID

	private String product_name; // 商品名

	private int stocks; // 在庫

	private boolean ManagementFlg;

	/**
	 * @return stocks
	 */
	public int getStocks() {
		return stocks;
	}

	/**
	 * @param stocks
	 *            セットする stocks
	 */
	public void setStocks(int stocks) {
		this.stocks = stocks;
	}

	/**
	 * @return product_name
	 */
	public String getProduct_name() {
		return product_name;
	}

	/**
	 * @param product_name
	 *            セットする product_name
	 */
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public boolean getManagementFlg() {
		return ManagementFlg;
	}

	public void setManagementFlg(boolean managementFlg) {
		ManagementFlg = managementFlg;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
}
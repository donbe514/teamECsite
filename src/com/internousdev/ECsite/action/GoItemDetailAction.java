package com.internousdev.ECsite.action;

import java.util.ArrayList;

import com.internousdev.ECsite.dao.ItemDetailDAO;
import com.internousdev.ECsite.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoItemDetailAction extends ActionSupport {

	private ArrayList<ItemDTO> itemList;

	private int product_id;
	private String product_name;
	private String product_name_kana;
	private int price;
	private String product_description;
	private String release_company;
	private String release_date;
	private String image_file_path;
	private String stock;

	public String execute() {
		ItemDetailDAO itemdao = new ItemDetailDAO();
		itemList = itemdao.detail(product_id);

		return SUCCESS;
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

	/**
	 * @return product_name_kana
	 */
	public String getProduct_name_kana() {
		return product_name_kana;
	}

	/**
	 * @param product_name_kana
	 *            セットする product_name_kana
	 */
	public void setProduct_name_kana(String product_name_kana) {
		this.product_name_kana = product_name_kana;
	}

	/**
	 * @return price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            セットする price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return product_description
	 */
	public String getProduct_description() {
		return product_description;
	}

	/**
	 * @param product_description
	 *            セットする product_description
	 */
	public void setProduct_description(String product_description) {
		this.product_description = product_description;
	}

	/**
	 * @return release_company
	 */
	public String getRelease_company() {
		return release_company;
	}

	/**
	 * @param release_company
	 *            セットする release_company
	 */
	public void setRelease_company(String release_company) {
		this.release_company = release_company;
	}

	/**
	 * @return release_date
	 */
	public String getRelease_date() {
		return release_date;
	}

	/**
	 * @param release_date
	 *            セットする release_date
	 */
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}

	/**
	 * @return image_file_path
	 */
	public String getImage_file_path() {
		return image_file_path;
	}

	/**
	 * @param image_file_path
	 *            セットする image_file_path
	 */
	public void setImage_file_path(String image_file_path) {
		this.image_file_path = image_file_path;
	}

	/**
	 * @return itemList
	 */
	public ArrayList<ItemDTO> getItemList() {
		return itemList;
	}

	/**
	 * @param itemList
	 *            セットする itemList
	 */
	public void setItemList(ArrayList<ItemDTO> itemList) {
		this.itemList = itemList;
	}

	/**
	 * @return product_id
	 */
	public int getProduct_id() {
		return product_id;
	}

	/**
	 * @param product_id
	 *            セットする product_id
	 */
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	/**
	 * @return stock
	 */
	public String getStock() {
		return stock;
	}

	/**
	 * @param stock
	 *            セットする stock
	 */
	public void setStock(String stock) {
		this.stock = stock;
	}

}

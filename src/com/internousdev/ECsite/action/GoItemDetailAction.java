package com.internousdev.ECsite.action;

import java.util.ArrayList;

import com.internousdev.ECsite.dao.ItemDAO;
import com.internousdev.ECsite.dao.ItemDetailDAO;
import com.internousdev.ECsite.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class GoItemDetailAction extends ActionSupport {

	private ArrayList<ItemDTO> itemList;
	private ArrayList<ItemDTO> stockList = new ArrayList<ItemDTO>();

	private int product_id;
	private String product_name;
	private String product_name_kana;
	private int price;
	private String product_description;
	private String release_company;
	private String release_date;
	private String image_file_path;
	private int stock;
	private int[] buyitemcount={0};
	private int category_id;


	public String execute() {
		ItemDTO itemDTO = new ItemDTO();
		ItemDetailDAO itemdao = new ItemDetailDAO();
		itemDTO = itemdao.detail(product_id);
		ItemDAO searchdao = new ItemDAO();
		if(itemDTO!=null){
			product_id = itemDTO.getProduct_id();
			product_name = itemDTO.getProduct_name();
			product_name_kana = itemDTO.getProduct_name_kana();
			price = itemDTO.getPrice();
			product_description = itemDTO.getProduct_description();
			release_company = itemDTO.getRelease_company();
			release_date = itemDTO.getRelease_date();
			image_file_path = itemDTO.getImage_file_path();
			stock = itemDTO.getStock();

		}

		if(stock>0){
		buyitemcount = new int[stock];

		for(int i=0;i<stock;i++){
		buyitemcount[i]=i+1;
		}
		}

		itemList = searchdao.select(category_id, "", 1, 0);

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
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock
	 *            セットする stock
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}



	public int[] getBuyitemcount() {
		return buyitemcount;
	}



	public void setBuyitemcount(int[] buyitemcount) {
		this.buyitemcount = buyitemcount;
	}



	/**
	 * @return category_id
	 */
	public int getCategory_id() {
		return category_id;
	}



	/**
	 * @param category_id セットする category_id
	 */
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

}

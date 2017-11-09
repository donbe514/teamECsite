package com.internousdev.ECsite.action;

import java.util.ArrayList;

import com.internousdev.ECsite.dao.ItemDAO;
import com.internousdev.ECsite.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemIntroduce extends ActionSupport {

	private ArrayList<ItemDTO> itemList;
	private int category_id;
	private String message = "";
	private String SearchText;

	public String execute() {
		ItemDAO itemdao = new ItemDAO();
		itemList = itemdao.select(category_id,SearchText);

		if (itemList.isEmpty()) {
			message = "『検索結果がありません』";
		}

		return SUCCESS;

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
	 * @return category_id
	 */
	public int getCategory_id() {
		return category_id;
	}

	/**
	 * @param category_id
	 *            セットする category_id
	 */
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	/**
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            セットする message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public String getSearchText() {
		return SearchText;
	}

	public void setSearchText(String searchText) {
		SearchText = searchText;
	}

}

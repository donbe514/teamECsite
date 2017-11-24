package com.internousdev.ECsite.action;

import java.util.ArrayList;
import java.util.regex.Pattern;

import com.internousdev.ECsite.dao.ItemDAO;
import com.internousdev.ECsite.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;


public class ItemIntroduce extends ActionSupport {

	private ArrayList<ItemDTO> itemList;
	private int category_id=0;
	private String message = "";
	private String SearchText="";
	private int count = 1;
//	private int[] pages;
	private int page=1;
	private int LimitFlag = 0;
	private ArrayList<ItemDTO> pages = new ArrayList<ItemDTO>();

	public String execute() {
		int tmppage = 1;
		ItemDAO itemdao = new ItemDAO();

		String[] RepTxt ={".","!","#","$","%","&","\'","*","+","/","=","?","^","_","\"","{","|","}","~","-","\\",",",")","(","<",">","[","]",":",";"};

		int RepCount =RepTxt.length;

		for(int i=0;i<RepCount;i++){
			SearchText= SearchText.replaceAll(Pattern.quote(RepTxt[i]), "");
		}

		count =itemdao.SearchCount(category_id,SearchText);
		tmppage = (count+6-1)/6;
		//pages = new int[tmppage];
		for(int i=0;i<tmppage;i++){
			ItemDTO pageDTO = new ItemDTO();
			pageDTO.setCategory_id(category_id);
			pageDTO.setProduct_name(SearchText);
			pages.add(pageDTO);
			//pages[i]=i+1;
		}
	//	pages[0]=category_id;

		itemList = itemdao.select(category_id,SearchText,page,LimitFlag);

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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

/*	public int[] getPages() {
		return pages;
	}

	public void setPages(int[] pages) {
		this.pages = pages;
	}*/

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLimitFlag() {
		return LimitFlag;
	}

	public void setLimitFlag(int limitFlag) {
		LimitFlag = limitFlag;
	}

	public ArrayList<ItemDTO> getPages() {
		return pages;
	}

	public void setPages(ArrayList<ItemDTO> pages) {
		this.pages = pages;
	}

}

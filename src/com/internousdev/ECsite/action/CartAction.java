package com.internousdev.ECsite.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.CartActionDAO;
import com.internousdev.ECsite.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware{

	private int product_id;
	private int item_count;
	private int total_price = 0;
	private int dell_id;
	private String message = "";
	public ArrayList<ItemDTO> CartAry = new ArrayList<ItemDTO>();
	public Map<String,Object> session;
	private boolean CartEnptyFlag=false;


	/**
	 * 仮IDか本IDかの確認
	 * @return
	 */
	private String user_check(){
		String now_user = "";

		if(session.get("user_id")!=null){
			now_user = session.get("user_id").toString();
		}else{
			now_user = session.get("tmpID").toString();
		}

		return now_user;
	}

	/**
	 * カートページ推移
	 * @return
	 */
	public String CartShow(){
		String now_user = user_check();
		CartActionDAO CartShowDAO = new CartActionDAO();
		if(now_user.length()>0){
			CartAry = CartShowDAO.CartShow(now_user);
			if(CartAry.isEmpty()){
				message = "カートに商品がありません";
				CartEnptyFlag = true;
			}else{
				Iterator<ItemDTO> itr = CartAry.iterator();
				ItemDTO CartListDTO = new ItemDTO();
				while(itr.hasNext()){
					CartListDTO = (ItemDTO)itr.next();
					total_price = total_price + (CartListDTO.getPrice() * CartListDTO.getStock());
				}
			}
		}

		return SUCCESS;
	}

	/**
	 * カートに入れる
	 * @return
	 */
	public String CartIn(){
		String now_user = user_check();

		String ret = ERROR;
		CartActionDAO CADAO = new CartActionDAO();

		if(now_user.length()>0){
			if(CADAO.CartIn(now_user, product_id,item_count)){
				ret = CartShow();

			}
		}

		return ret;
	}

	/**
	 * カートの中身を削除
	 * @return
	 */
	public String CartDell(){
		CartActionDAO CADAO = new CartActionDAO();
		String now_user = user_check();

		if(now_user.length()>0){
			CADAO.CartDell(now_user, dell_id);
		}

		CartShow();

		return SUCCESS;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getTotal_price() {
		return total_price;
	}

	public void setTotal_price(int total_price) {
		this.total_price = total_price;
	}

	public int getDell_id() {
		return dell_id;
	}

	public void setDell_id(int dell_id) {
		this.dell_id = dell_id;
	}

	public int getItem_count() {
		return item_count;
	}

	public void setItem_count(int item_count) {
		this.item_count = item_count;
	}

	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ArrayList<ItemDTO> getCartAry() {
		return CartAry;
	}

	public void setCartAry(ArrayList<ItemDTO> cartAry) {
		CartAry = cartAry;
	}

	public boolean isCartEnptyFlag() {
		return CartEnptyFlag;
	}

	public void setCartEnptyFlag(boolean cartEnptyFlag) {
		CartEnptyFlag = cartEnptyFlag;
	}



}

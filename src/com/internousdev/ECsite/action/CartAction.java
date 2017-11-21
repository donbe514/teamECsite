package com.internousdev.ECsite.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.CartActionDAO;
import com.internousdev.ECsite.dao.ItemDetailDAO;
import com.internousdev.ECsite.dto.ItemDTO;
import com.internousdev.ECsite.util.RandomForm;
import com.opensymphony.xwork2.ActionSupport;

public class CartAction extends ActionSupport implements SessionAware{

	private int product_id;
	private String item_count;
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

		}else if(session.get("tmpID")!=null){

			now_user = session.get("tmpID").toString();

		}else{

			RandomForm rf = new RandomForm();
			now_user =rf.RandomStr(16);//16桁の仮IDの発行
			session.put("tmpID", now_user);

		}

		return now_user;
	}

	/**
	 * カートページ推移
	 * @return
	 */
	public String CartShow(){
		String now_user = user_check();//ユーザーIDの取得
		CartActionDAO CartShowDAO = new CartActionDAO();

		if(now_user.length()<1){
			message=message+"ユーザーデータエラーが発生しました。<br>";
		}else{
			CartAry = CartShowDAO.CartShow(now_user);
			if(CartAry.isEmpty()){
				message = message+"カートに商品がありません。<br>";
				CartEnptyFlag = true;
			}
			else{
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
		String now_user = user_check();//ユーザーIDの取得
		String ret = ERROR;

		CartActionDAO CADAO = new CartActionDAO();//基本カートアクションのインスタンス化
		ItemDetailDAO IDDAO = new ItemDetailDAO();//商品単品検索DAO
		ItemDTO StockDTO = IDDAO.detail(product_id);//商品ストック情報格納

		ArrayList<ItemDTO> CartList = new ArrayList<ItemDTO>();
		ItemDTO CartListDTO = new ItemDTO();
		int CartInCount = 0;
		int ErrorCount=0;


		if(now_user.length()<1){//idが不正な値か確認する。
			message=message+"ユーザーデータエラーが発生しました。<br>";
			ErrorCount++;
		}
		if(!(item_count.matches("^[0-9]+$"))){//カート投入数が数字でないならエラー
			message=message+"カート投入数が不正です。<br>";
			ErrorCount++;

		}else{//数字であることが確認されてからint変換
			CartInCount =Integer.parseInt(item_count.toString());
		}

		if(CartInCount==0){//投入数が0ならエラー
			message=message+"投入数が0のため、カートに商品が投入されませんでした。<br>";
			ErrorCount++;
		}else if(CartInCount<0){//投入数が負の数値ならエラー
			message=message+"カートに負の数値が投入されたため、カートに商品が投入されませんでした。<br>";
			ErrorCount++;
		}else if(CartInCount>StockDTO.getStock()){//投入数が在庫以上ならエラー
			message=message+"在庫を越える数値が投入されたため、カートに商品が投入されませんでした。<br>";
			ErrorCount++;
		}

		if(ErrorCount>0){
			ret = ERROR;
		}else{//エラーチェックが発生しなかったら

			CartList = CADAO.CartShow(now_user);//now_userに紐付くカート情報取得
			boolean DapFlag=false;//カート内容重複フラグ
			int DapItemCount = 0;


			Iterator<ItemDTO> itr = CartList.iterator();
			while(itr.hasNext()){
				CartListDTO = (ItemDTO)itr.next();
				if(product_id==CartListDTO.getProduct_id()){//カート内容重複確認
					DapFlag =true;
					DapItemCount = CartListDTO.getStock();//重複商品のカート内個数記録
				}
			}

			if(DapFlag){
				//重複していたらアップデート
				CartInCount = CartInCount +DapItemCount;//カート内合計数記録
				if(CartInCount>StockDTO.getStock()){//カート内合計数が在庫以上ならエラー
					message=message+"在庫を越える数値が投入されたため、カートに商品が投入されませんでした。<br>";
					ErrorCount++;
				}
				if(ErrorCount>0){
					//エラーしていたら何もしない。
				}else{
					CADAO.CartUpdate(now_user, product_id, CartInCount);
					ret = SUCCESS;
				}

			}else{
				//重複していないならインサート
				CADAO.CartInsert(now_user, product_id, CartInCount);
				ret = SUCCESS;
			}

		}

		CartShow();//カート内観覧メソッド

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

		CartShow();//カート内観覧メソッド

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

	public String getItem_count() {
		return item_count;
	}

	public void setItem_count(String item_count) {
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

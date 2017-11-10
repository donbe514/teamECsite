package com.internousdev.ECsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.BuyItemComplateDAO;
import com.internousdev.ECsite.dao.CartActionDAO;
import com.internousdev.ECsite.dao.ItemDetailDAO;
import com.internousdev.ECsite.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfilmAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;

	public BuyItemComplateDAO buyItemComplateDAO = new BuyItemComplateDAO();

	/**
	 * 商品購入情報登録メソッド
	 *
	 * @author internous
	 */
	public String execute() throws SQLException{
		String result = ERROR;

		String user_id = session.get("user_id").toString();

		if(user_id!=null){

			CartActionDAO CADAO = new CartActionDAO();
			ArrayList<ItemDTO> CartList = new ArrayList<ItemDTO>();
			CartList = CADAO.CartShow(user_id);//カート情報を取得

			Cart_Histry_Chenge(user_id,CartList);//カートテーブル情報を購入履歴に入れる。

			Stock_Chenge(user_id,CartList);//在庫変更

			buyItemComplateDAO.cart_infoDelete(user_id);// カートテーブル情報削除

			result = SUCCESS;

		}
		return result;
	}

	/**
	 * カート情報を履歴に入れる
	 * @return
	 */
	private void Cart_Histry_Chenge(String user_id,ArrayList<ItemDTO> CartList){


		// カートテーブル情報を購入履歴テーブルに格納
		Iterator<ItemDTO> CartItr = CartList.iterator();
		ItemDTO CartElmtDTO = new ItemDTO();
		while(CartItr.hasNext()){
			CartElmtDTO = (ItemDTO)CartItr.next();
			buyItemComplateDAO.purchase_history_info(user_id,CartElmtDTO.getProduct_id(),CartElmtDTO.getStock());
		}
	}

	/**
	 * カートに入れていた商品分の在庫を減らす
	 * @param user_id
	 * @param CartList
	 */
	private void Stock_Chenge(String user_id,ArrayList<ItemDTO> CartList){

		Iterator<ItemDTO> CartItr = CartList.iterator();
		ItemDTO CartElmtDTO = new ItemDTO();
		ItemDetailDAO IDDAO = new ItemDetailDAO();
		BuyItemComplateDAO  BIDAO = new BuyItemComplateDAO();

		while(CartItr.hasNext()){
			ItemDTO StockitemDTO = new ItemDTO();
			CartElmtDTO = (ItemDTO)CartItr.next();
			int ChengeStock = 0;

			StockitemDTO = IDDAO.detail(CartElmtDTO.getProduct_id());

			if(StockitemDTO.getProduct_id() == CartElmtDTO.getProduct_id()){
				ChengeStock =StockitemDTO.getStock()-CartElmtDTO.getStock();

				BIDAO.stock_chenge(ChengeStock,CartElmtDTO.getProduct_id());
			}

		}
	}





	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}

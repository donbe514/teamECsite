package com.internousdev.ECsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.BuyItemComplateDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfilmAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;

	public String result;

	public BuyItemComplateDAO buyItemComplateDAO = new BuyItemComplateDAO();

	/**
	 * 商品購入情報登録メソッド
	 *
	 * @author internous
	 */
	public String execute() throws SQLException{

//		テスト用
//		session.put("id", 1);
//		session.put("user_id","1");
//		session.put("product_id", 1);

		// カートテーブル情報を購入履歴テーブルに格納
		buyItemComplateDAO.purchase_history_info(
				Integer.parseInt(session.get("id").toString()),
				session.get("user_id").toString(),
				Integer.parseInt(session.get("product_id").toString()));

		// カートテーブル情報削除
		String user_id = session.get("user_id").toString();
		buyItemComplateDAO. cart_infoDelete(user_id);

		result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

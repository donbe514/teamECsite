package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ECsite.util.DBConnector;
import com.internousdev.ECsite.util.DateUtil;
import com.internousdev.ECsite.util.RandomForm;


public class BuyItemComplateDAO {

	private DateUtil date = new DateUtil();

	// 購入履歴格納メソッド
	public void CartHistoryIn(String user_id, int product_id,int item_count)  {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		RandomForm rf = new RandomForm();

		String sql = "INSERT INTO purchase_history_info(id,user_id,product_id,insert_date,item_count) VALUES(?, ?, ?, ?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, rf.RandomNom(9));
			ps.setString(2, user_id);
			ps.setInt(3, product_id);
			ps.setString(4, date.getDate());
			ps.setInt(5, item_count);

			ps.execute();

		}catch(Exception e) {
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

		// カートテーブル情報削除メソッド
	public void CartDataDelete(int id,String user_id) {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE FROM cart_info where id = ? AND user_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, user_id);

			ps.executeUpdate();

		}catch(SQLException e) {
			e.printStackTrace();
		}

		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}


	public void StockChenge(int ChengeStock,int Product_id){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		//UPDATE テーブル名 SET カラム名 = 要素.... WHERE 検索条件；
		String sql = "UPDATE product_info SET stock = ? WHERE product_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, ChengeStock);
			ps.setInt(2, Product_id);

			ps.execute();

		}catch(Exception e) {
			e.printStackTrace();
		}

		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

	}


}


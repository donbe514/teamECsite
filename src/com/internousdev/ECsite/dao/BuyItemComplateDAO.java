package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ECsite.util.DBConnector;
import com.internousdev.ECsite.util.DateUtil;


public class BuyItemComplateDAO {

	private DateUtil date = new DateUtil();

	// 購入履歴格納メソッド
	public void purchase_history_info(int id, String user_id, int product_id)  {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "INSERT INTO purchase_history_info(id,user_id,product_id,insert_date) VALUES(?, ?, ?, ?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, id);
			ps.setString(2, user_id);
			ps.setInt(3, product_id);
			ps.setString(4, date.getDate());

			ps.execute();

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

		// カートテーブル情報削除メソッド
		public int cart_infoDelete(String user_id) {

			DBConnector db = new DBConnector();
			Connection con = db.getConnection();

			String sql = "DELETE FROM cart_info where user_id=?";

			int result =0;

			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, user_id);

				result = ps.executeUpdate();

			}catch(SQLException e) {
				e.printStackTrace();
			}
			return result;
		}
}


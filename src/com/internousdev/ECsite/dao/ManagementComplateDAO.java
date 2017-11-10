package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.ECsite.util.DBConnector;
import com.internousdev.ECsite.util.DateUtil;

public class ManagementComplateDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DateUtil dateUtil = new DateUtil();

	private String sql = "UPDATE product_info SET stock=?, update_date=? where product_name=?" ;//一致する商品名の在庫数、更新日を更新

	//商品在庫数更新メソッド
	public void updateStock(int stock, String product_name) {
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, stock);
			ps.setString(2,dateUtil.getDate());
			ps.setString(3, product_name);
			ps.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

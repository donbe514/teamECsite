package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.internousdev.ECsite.dto.ManagementDTO;
import com.internousdev.ECsite.util.DBConnector;

public class ManagementDAO {

	// 商品情報表示メソッド
	public  ArrayList<ManagementDTO> getInfo()  {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "SELECT * FROM product_info";//商品情報テーブルを全検索

		ArrayList<ManagementDTO> managementDTO = new ArrayList<ManagementDTO>();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				ManagementDTO dto = new ManagementDTO();
				dto.setProduct_id(rs.getInt("product_id"));
				dto.setProduct_name(rs.getString("product_name"));
				dto.setStocks(rs.getInt("stock"));
				managementDTO.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return managementDTO;
	}


	//商品情報参照メソッド
	public ManagementDTO referenceInfo(String product_name) {

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "SELECT * FROM product_info where product_name=?"; //商品名を検索

		ManagementDTO dto = new ManagementDTO();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, product_name);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
			    dto.setProduct_id(rs.getInt("product_id"));
				dto.setProduct_name(rs.getString("product_name"));
				dto.setStocks(rs.getInt("stock"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return dto;
	}

	public int StockCount(){

		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql = "SELECT sum(stock) FROM product_info "; //商品名を検索

		int SumStock =0;

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				SumStock=rs.getInt("sum(stock)");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return SumStock;
	}

}

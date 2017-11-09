package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ECsite.dto.ItemDTO;
import com.internousdev.ECsite.util.DBConnector;

public class ItemDetailDAO {


	public ArrayList<ItemDTO> detail(int product_id) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql;

		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
		sql = "select * from product_info where product_id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, product_id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ItemDTO dto = new ItemDTO();
				dto.setId(rs.getInt("id"));
				dto.setProduct_id(rs.getInt("product_id"));
				dto.setProduct_name(rs.getString("product_name"));
				dto.setProduct_name_kana(rs.getString("product_name_kana"));
				dto.setProduct_description(rs.getString("product_description"));
				dto.setCategory_id(rs.getInt("category_id"));
				dto.setPrice(rs.getInt("price"));
				dto.setImage_file_path(rs.getString("image_file_path"));
				dto.setImage_file_name(rs.getString("image_file_path"));
				dto.setRelease_date(rs.getString("release_date"));
				dto.setRelease_company(rs.getString("release_company"));
				dto.setStatus(rs.getInt("status"));
				dto.setInsert_date(rs.getString("insert_date"));
				dto.setUpdate_date(rs.getString("update_date"));
				dto.setStock(rs.getInt("stock"));
				itemList.add(dto);
			}

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return itemList;
	}
}

package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ECsite.dto.ItemDTO;
import com.internousdev.ECsite.util.DBConnector;

public class ItemDAO {


	public ArrayList<ItemDTO> select(int category_id,String SearchText,int page,int LimitFlag) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql;
		String tmp ="";

		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
		sql = "select * from product_info";

		switch(category_id){
		case 1:
		case 2:
		case 3: tmp=(" where category_id = " + category_id);
			break;
		default:
		}

		int i = SearchText.length();
		String tmptext="";
		if(i>0){
			tmptext="'%"+SearchText+"%'";
		}

		if(i>0 & category_id>0){
			sql=sql + tmp + " AND product_name like " + tmptext;
		}
		else if(category_id>0){
			sql=sql + tmp;
		}
		else if(i>0){
			sql=sql + " where product_name like " +tmptext;
		}
		System.out.println(sql);

		if(LimitFlag!=0){
			sql = sql+" limit " + ((page-1)*6) + ",6";
		}
		System.out.println(sql);

		try {
			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setInt(1, category_id);
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


	public int SearchCount(int category_id,String SearchText) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int count = 0;
		int tmpcount = 0;
		String tmpsql ="";

		String sql = "select count(*) from product_info";

		if(category_id>0){
			tmpsql= " category_id = "+category_id;
			tmpcount++;
		}
		if(SearchText!=null){
			if(SearchText.length()>0){
				if(tmpcount>0){
					tmpsql = tmpsql+" AND ";
				}

				tmpsql = tmpsql+" product_name like '%" + SearchText +"%'";

				tmpcount++;
			}
		}

		if(tmpcount>0){
			sql = sql+" WHERE "+tmpsql;
		}

		System.out.println(sql);


		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if (rs.next()){
				count = rs.getInt("count(*)");
			}

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;
	}

}

package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ECsite.dto.ItemDTO;
import com.internousdev.ECsite.util.DBConnector;

public class ItemDAO {

	public ArrayList<ItemDTO> select(int category_id, String SearchText, int page, int LimitFlag) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		String sql;
		String tmp = "";

		ArrayList<ItemDTO> itemList = new ArrayList<ItemDTO>();
		sql = "select * from product_info";

		switch (category_id) {
		case 1:
			tmp = (" category_id = " + category_id);
			break;
		case 2:
			tmp = (" category_id = " + category_id);
			break;
		case 3:
			tmp = (" category_id = " + category_id); // 全体検索以外のとき、カテゴリーIDのSQL文を入れる。
			break;
		default:
		}

		int i = SearchText.length();

		if (i > 0 & category_id > 0) {

			if (SearchText.length() > 0) {
				SearchText = SearchText.replace("　", " ");
				String[] SearchList = SearchText.split(" ");
				int y = SearchList.length;
				String[] Sname = new String[y];
				String[] Skana = new String[y];
				String namekana = "";
				tmp = (" category_id = " + category_id);
				for (int r = 0; r < y; r++) {
					Sname[r] = (" product_name like '%" + SearchList[r] + "%' ");
					Skana[r] = (" product_name_kana like '%" + SearchList[r] + "%'");
					namekana = namekana + (" AND " + "(" + Sname[r] + " or " + Skana[r] + ")");
				}
				sql = sql + " where" + tmp + namekana; // カテゴリID+検索機能のSQL
				System.out.println(sql);
			}
		} else if (category_id > 0) {
			sql = sql + " where " + tmp; // カテゴリIDだけのSQL
			System.out.println(sql);
		} else if (i > 0) {
			if (SearchText.length() > 0) {
				SearchText = SearchText.replace("　", " ");
				String[] SearchList = SearchText.split(" ");
				int y = SearchList.length;
				String[] Sname = new String[y];
				String[] Skana = new String[y];
				String namekana = "";
				tmp = (" category_id = " + category_id);
				for (int r = 0; r < y; r++) {
					Sname[r] = (" product_name like '%" + SearchList[r] + "%' ");
					Skana[r] = (" product_name_kana like '%" + SearchList[r] + "%'");
					if (r > 0) {
						namekana = namekana + "AND";
					}
					namekana = namekana + ("(" + Sname[r] + " or " + Skana[r] + ")");
				}
				sql = sql + " where " + namekana; // 検索機能だけのSQL
				System.out.println(sql);
			}
		}
		if (LimitFlag != 0) {
			sql = sql + " limit " + ((page - 1) * 6) + ",6"; // 商品を各ページに６個づつ表示するSQL、以下DTO
			System.out.println(sql);
		}

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			// ps.setInt(1, category_id);
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

	public int SearchCount(int category_id, String SearchText) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int count = 0;
		int tmpcount = 0;
		String tmpsql = "";
		String categorysql = "";
		String sql = "select count(*) from product_info";

		if (category_id > 0) {
			categorysql = " category_id = " + category_id;
			tmpcount++;
		}
		if (SearchText != null) {
			if (SearchText.length() > 0) {
				if (tmpcount > 0) {

					SearchText = SearchText.replace("　", " ");
					String[] SearchList = SearchText.split(" ");
					int y = SearchList.length;

					String[] Sname = new String[y];
					String[] Skana = new String[y];
					String namekana = "";

					for (int r = 0; r < y; r++) {
						Sname[r] = (" product_name like '%" + SearchList[r] + "%' ");
						Skana[r] = (" product_name_kana like '%" + SearchList[r] + "%'");
						if (r > 0) {
							namekana = namekana + "AND";
						}
						namekana = namekana + ("(" + Sname[r] + " or " + Skana[r] + ")");
					}
					tmpsql = categorysql + " AND " + namekana;
					System.out.println(sql);

				} else {

					SearchText = SearchText.replace("　", " ");
					String[] SearchList = SearchText.split(" ");
					int y = SearchList.length;
					String[] Sname = new String[y];
					String[] Skana = new String[y];
					String namekana = "";
					for (int r = 0; r < y; r++) {
						Sname[r] = (" product_name like '%" + SearchList[r] + "%' ");
						Skana[r] = (" product_name_kana like '%" + SearchList[r] + "%' ");
						if (r > 0) {
							namekana = namekana + "AND";
						}
						namekana = namekana + ("(" + Sname[r] + " or " + Skana[r] + ")");
					}
					tmpsql = namekana;
					tmpcount++;
				}
			} // 文字数をここでチェックして、nullだったとき、カテゴリIDを入れる。
			else {
				tmpsql = categorysql;
			}
		} // 文字がnullかどうかチェックして、nullだったとき、カテゴリID(無い）を入れる。
		else {
			tmpsql = categorysql;
		}
		if (tmpsql.length() > 0)
		{
			sql = sql + " where " + tmpsql;
		}

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				count = rs.getInt("count(*)");
			}

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return count;
	}

}

package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ECsite.util.DBConnector;
import com.internousdev.ECsite.util.DateUtil;

public class UserInfoComplateDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	public String sql = "INSERT INTO user_info(user_id, password, family_name_kana, family_name, first_name_kana, first_name_kana sex, email) VALUE(?,?,?,?,?,?,?,?,?)";

	public void createUser(String family_name_kana, String family_name, String first_name_kana, String first_name,int sex, String email) throws SQLException {
		 try{
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 preparedStatement.setString(1, family_name_kana);
			 preparedStatement.setString(2, family_name);
			 preparedStatement.setString(3,first_name_kana);
			 preparedStatement.setString(4, first_name);
			 preparedStatement.setInt(5,sex);
			 preparedStatement.setString(6,email);
			 preparedStatement.setString(7, dateUtil.getDate());

			 preparedStatement.execute();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 connection.close();
		 }
	}

}

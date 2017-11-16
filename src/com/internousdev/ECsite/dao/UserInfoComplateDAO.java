package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ECsite.util.DBConnector;
import com.internousdev.ECsite.util.DateUtil;
import com.internousdev.ECsite.util.RandomForm;

public class UserInfoComplateDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	public String sql = "INSERT INTO user_info (id, user_id, password, first_name, family_name, first_name_kana, family_name_kana, sex, email, insert_date) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	public void createUser(String user_id, String password, String first_name, String family_name, String first_name_kana, String family_name_kana,int sex, String email) throws SQLException {


		RandomForm randomForm = new RandomForm();

		try{
			 PreparedStatement preparedStatement = connection.prepareStatement(sql);
			 preparedStatement.setInt(1, randomForm.RandomNom(9));
			 preparedStatement.setString(2, user_id);
			 preparedStatement.setString(3, password);
			 preparedStatement.setString(4, first_name);
			 preparedStatement.setString(5, family_name);
			 preparedStatement.setString(6,first_name_kana);
			 preparedStatement.setString(7, family_name_kana);
			 preparedStatement.setInt(8,sex);
			 preparedStatement.setString(9,email);
			 preparedStatement.setString(10, dateUtil.getDate());

			 preparedStatement.execute();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 connection.close();
		 }
	}

}

package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ECsite.util.DBConnector;
import com.internousdev.ECsite.util.DateUtil;
import com.internousdev.ECsite.util.RandomForm;


public class AddressRegistrationDAO {


	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();


	private String sql = "INSERT INTO destination_info (id, user_id, first_name, family_name, first_name_kana, family_name_kana, email, tel_number, user_address, insert_date) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

	public void add(String user_id, String putFirst_name, String putFamily_name, String putFirst_name_kana, String putFamily_name_kana, String putUser_address, String putTel_number, String putEmail) throws SQLException {



		RandomForm randomForm = new RandomForm();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, randomForm.RandomNom(9));
			preparedStatement.setString(2, user_id);
			preparedStatement.setString(3, putFirst_name);
			preparedStatement.setString(4, putFamily_name);
			preparedStatement.setString(5, putFirst_name_kana);
			preparedStatement.setString(6, putFamily_name_kana);
			preparedStatement.setString(7, putEmail);
			preparedStatement.setString(8, putTel_number);
			preparedStatement.setString(9, putUser_address);
			preparedStatement.setString(10, dateUtil.getDate());
			preparedStatement.execute();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

}

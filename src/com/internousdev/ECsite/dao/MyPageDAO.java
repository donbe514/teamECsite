package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ECsite.dto.UserDTO;
import com.internousdev.ECsite.util.DBConnector;


public class MyPageDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private UserDTO userDTO = new UserDTO();


	public UserDTO getUserInfo(String user_id){

		String sql="SELECT first_name,family_name,first_name_kana,family_name_kana,sex,email,logined FROM user_info where user_id = ?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,user_id);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()){
				userDTO.setFirst_name(resultSet.getString("first_name"));
				userDTO.setFamily_name(resultSet.getString("family_name"));
				userDTO.setFirst_name_kana(resultSet.getString("first_name_kana"));
				userDTO.setFamily_name_kana(resultSet.getString("family_name_kana"));
				userDTO.setSex(resultSet.getInt("sex"));
				userDTO.setEmail(resultSet.getString("email"));
				userDTO.setLogined(resultSet.getInt("logined"));
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		return userDTO;
	}

}

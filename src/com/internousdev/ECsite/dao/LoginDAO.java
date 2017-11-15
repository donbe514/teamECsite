package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ECsite.dto.UserDTO;
import com.internousdev.ECsite.util.DBConnector;


public class LoginDAO {


	public UserDTO getLoginUserInfo(String user_id, String password){
		UserDTO userDTO = new UserDTO();
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql ="SELECT * FROM user_info where user_id = ? AND password = ?";


		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user_id);
			preparedStatement.setString(2, password);

			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				userDTO.setUser_id(resultSet.getString("user_id"));
				userDTO.setPassword(resultSet.getString("password"));
				userDTO.setFamily_name(resultSet.getString("family_name"));
				userDTO.setFirst_name(resultSet.getString("first_name"));


			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		 return userDTO;
	}


	public UserDTO userSearch (String user_id){
		UserDTO userDTO = new UserDTO();
    	DBConnector dbConnector = new DBConnector();
    	Connection connection = dbConnector.getConnection();

    	String sql = "SELECT * FROM user_info where user_id = ?";

    	try{
    		PreparedStatement preparedStatement = connection.prepareStatement(sql);
    		preparedStatement.setString(1,user_id);

    		 ResultSet resultSet = preparedStatement.executeQuery();
    		 if(resultSet.next()) {
    			 userDTO.setUser_id(resultSet.getString("user_id"));
    			 userDTO.setPassword(resultSet.getString("password"));
    		 }


    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	return userDTO;
    }




	public boolean loginFlg(String user_id ,int loginFlg){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		boolean result = false;
		String sql = "UPDATE user_info SET logined = ? WHERE user_id =?";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,loginFlg);
			preparedStatement.setString(2,user_id);

			preparedStatement.execute();
			result =true;

		}catch(Exception e){
			e.printStackTrace();

			}

		return result;
	}
}

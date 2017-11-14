package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ECsite.util.DBConnector;


public class SaipassDAO {

private DBConnector dbConnector = new DBConnector();

private Connection connection = dbConnector.getConnection();



private String sql = "UPDATE user_info SET password  = ? WHERE user_id  =?";


public void createSaipass(String password, String user_id) throws SQLException {

try{
	PreparedStatement preparedStatement = connection.prepareStatement(sql);
	preparedStatement.setString(1, password);
	preparedStatement.setString(2, user_id);






	preparedStatement.execute();
}catch(Exception e) {
	e.printStackTrace();
}finally {
	connection.close();
}
}}
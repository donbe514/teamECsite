package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ECsite.util.DBConnector;

public class UserIdDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();


	private String sql = "SELECT COUNT(*) FROM user_info where user_id = ?";

	public int user_count(String user_id) throws SQLException {

		int count=0;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user_id);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next()){
				count=rs.getInt("count(*)");
			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();

		}
		return count;
	}

}

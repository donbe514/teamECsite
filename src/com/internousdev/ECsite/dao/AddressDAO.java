package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ECsite.dto.AddressDTO;
import com.internousdev.ECsite.util.DBConnector;



public class AddressDAO {


	public List<AddressDTO> getAddressInfo(String user_id) throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		List<AddressDTO> addressList = new ArrayList<AddressDTO>();


		String sql = "SELECT id, user_id, first_name, family_name, first_name_kana, family_name_kana, email, tel_number, user_address FROM destination_info where user_id = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user_id);

			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				AddressDTO dto = new AddressDTO();

				dto.setPutFirst_name(resultSet.getString("first_name"));
				dto.setPutFamily_name(resultSet.getString("family_name"));
				dto.setPutFirst_name_kana(resultSet.getString("first_name_kana"));
				dto.setPutFamily_name_kana(resultSet.getString("family_name_kana"));
				dto.setPutEmail(resultSet.getString("email"));
				dto.setPutTel_number(resultSet.getString("tel_number"));
				dto.setPutUser_address(resultSet.getString("user_address"));

				addressList.add(dto);
			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return addressList;
	}

}

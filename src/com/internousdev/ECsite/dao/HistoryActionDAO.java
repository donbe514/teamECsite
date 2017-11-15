package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.ECsite.dto.ItemDTO;
import com.internousdev.ECsite.util.DBConnector;

public class HistoryActionDAO {

    private DBConnector dbConnector = new DBConnector();
    private Connection connection = dbConnector.getConnection();

    //商品履歴取得
    public ArrayList<ItemDTO> getMyPageUserInfo(String user_id ) throws SQLException {
        ArrayList<ItemDTO> historyDTO = new ArrayList<ItemDTO>();

        String sql ="SELECT pi.product_id, "
                + "pi.product_name, "              //商品名
                + "pi.product_name_kana, "         //るび
                + "pi.image_file_path, "           //画像
                + "pi.price, "                     //商品値段
                + "pi.release_company, "           //販売会社
                + "pi.release_date "               //発売日
                + "FROM product_info pi "
                + "LEFT JOIN purchase_history_info phi "
                + "ON pi.product_id = phi.product_id "
                + "where user_id = ? "
                + "ORDER BY pi.insert_date "
                + "DESC ";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user_id);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()) {
                ItemDTO dto = new ItemDTO();
                dto.setProduct_name(resultSet.getString("product_name"));
                dto.setProduct_name_kana(resultSet.getString("product_name_kana"));
                dto.setImage_file_path(resultSet.getString("image_file_path"));
                dto.setPrice(resultSet.getInt("price"));
                dto.setRelease_company(resultSet.getString("release_company"));
                dto.setRelease_date(resultSet.getString("release_date"));
                historyDTO.add(dto);
            }

        } catch(Exception e){
            e.printStackTrace();
        } finally {
            connection.close();
        }
        return historyDTO;

    }

    //商品履歴削除
    public void  Delete(String user_id) throws SQLException {

    String sql ="DELETE"
            + "FROM purchase_history_info "
            + "WHERE "
            + "user_id = ? ";
    try{
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,user_id);

    } catch(Exception e){
        e.printStackTrace();
    } finally {
        connection.close();
        
    }
    }
}

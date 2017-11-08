package com.internousdev.ECsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import com.internousdev.ECsite.dto.ItemDTO;
import com.internousdev.ECsite.util.DBConnector;
import com.internousdev.ECsite.util.DateUtil;
import com.internousdev.ECsite.util.RandomForm;

public class CartActionDAO {

	/**
	 * カート投入用
	 * @param user_id
	 * @param product_id
	 * @return　成功失敗による真偽値
	 */
	public boolean CartIn(String user_id,int product_id,int item_count){
		boolean result = false;

		ArrayList<ItemDTO> CartListDTO = new ArrayList<ItemDTO>();

		CartListDTO = CartSearch(user_id);//カート内サーチ
		ItemDTO CartInDTO = new ItemDTO();

		Iterator<ItemDTO> itr = CartListDTO.iterator();
		while (itr.hasNext()) {
			CartInDTO = (ItemDTO) itr.next();
			if(CartInDTO.getProduct_id() == product_id){//カート内に現在選択商品が入っていたらUPDATEメソッド
				int total_count = CartInDTO.getStock() + item_count;
				result = CartUpdate(user_id,product_id,total_count);

			}
		}

		if(!(result)){//カート内に現在商品が入っていなかったらINSERTメソッド
			result = CartInsert(user_id,product_id,item_count);
		}

		return result;
	}

	/**
	 * カートテーブル挿入/カート投入用
	 * @param user_id
	 * @param product_id
	 * @return　成功失敗の真偽値
	 */
	private boolean CartInsert(String user_id,int product_id,int item_count){
		boolean result = false;
		DBConnector db =new DBConnector();
		Connection con = db.getConnection();
		DateUtil datetime = new DateUtil();
		RandomForm rf = new RandomForm();

		try{

			String sql = "INSERT INTO cart_info(id,user_id,product_id,insert_date,item_count) VALUES(?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, rf.RandomNom(5));
			ps.setString(2, user_id);
			ps.setInt(3, product_id);
			ps.setString(4, datetime.getDate());
			ps.setInt(5, item_count);
			/*id int primary key not null,ID*/
			/*user_id varchar(16) not null,ユーザーID*/
			 /*foreign key(user_id) references user_info(user_id),user_info.user_idとfk*/
			/*product_id int not null,商品ID*/
			/*foreign key(product_id) references product_info(product_id), product_info.product_idとfk*/
			/*insert_date datetime not null,登録日*/
			/*update_date datetime 更新日*/

			ps.execute();
			result = true;

		}catch(SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * カートテーブル更新/カート投入用
	 * @param user_id
	 * @param product_id
	 * @return　成功失敗の真偽値
	 */
	private boolean CartUpdate(String user_id,int product_id,int item_count){
		boolean result = false;
		DBConnector db =new DBConnector();
		Connection con = db.getConnection();
		DateUtil datetime = new DateUtil();

		try{
			String sql = "UPDATE cart_info SET update_date = ? ,item_count = ? WHERE user_id = ? AND product_id = ? ;";
			//UPDATE テーブル名 SET カラム名 = 要素.... WHERE 検索条件；
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, datetime.getDate());
			ps.setInt(2, item_count);
			ps.setString(3, user_id);
			ps.setInt(4, product_id);

			/*id int primary key not null,ID*/
			/*user_id varchar(16) not null,ユーザーID*/
			 /*foreign key(user_id) references user_info(user_id),user_info.user_idとfk*/
			/*product_id int not null,商品ID*/
			/*foreign key(product_id) references product_info(product_id), product_info.product_idとfk*/
			/*insert_date datetime not null,登録日*/
			/*update_date datetime 更新日*/

			ps.execute();
			result = true;

		}catch(SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return result;
	}

	/**
	 * カート内観覧用メソッド
	 * @param user_id
	 * @return ArrayList
	 */
	public ArrayList<ItemDTO> CartShow(String user_id){

		ArrayList<ItemDTO> CartListDTO = new ArrayList<ItemDTO>();
		DBConnector db =new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT cf.id,cf.user_id,cf.item_count,pi.product_name,pi.product_name_kana,pi.image_file_path,pi.price,pi.release_company,pi.release_date FROM cart_info cf LEFT JOIN product_info pi ON cf.product_id = pi.product_id WHERE cf.user_id = ? ORDER BY cf.insert_date ;";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			/*id int primary key not null,ID*/
			/*user_id varchar(16) not null,ユーザーID*/
			 /*foreign key(user_id) references user_info(user_id),user_info.user_idとfk*/
			/*product_id int not null,商品ID*/
			/*foreign key(product_id) references product_info(product_id), product_info.product_idとfk*/
			/*insert_date datetime not null,登録日*/
			/*update_date datetime 更新日*/

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				ItemDTO CartDTO = new ItemDTO();
				CartDTO.setId(rs.getInt("id"));
				CartDTO.setStock(rs.getInt("item_count"));
				CartDTO.setProduct_name(rs.getString("product_name"));
				CartDTO.setProduct_name_kana(rs.getString("product_name_kana"));
				CartDTO.setImage_file_path(rs.getString("image_file_path"));
				CartDTO.setPrice(rs.getInt("price"));
				CartDTO.setRelease_company(rs.getString("release_company"));
				CartDTO.setRelease_date(rs.getString("release_date"));
				CartListDTO.add(CartDTO);
			}

		}catch(SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return CartListDTO;
	}

	/**
	 * カート内検索/同商品カート投入確認用。
	 * @param user_id
	 * @return
	 */
	private ArrayList<ItemDTO> CartSearch(String user_id){

		DBConnector db =new DBConnector();
		Connection con = db.getConnection();

		String sql = "SELECT * FROM cart_info WHERE user_id = ?;";
		ArrayList<ItemDTO> CartListDTO = new ArrayList<ItemDTO>();

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			/*id int primary key not null,ID*/
			/*user_id varchar(16) not null,ユーザーID*/
			 /*foreign key(user_id) references user_info(user_id),user_info.user_idとfk*/
			/*product_id int not null,商品ID*/
			/*foreign key(product_id) references product_info(product_id), product_info.product_idとfk*/
			/*insert_date datetime not null,登録日*/
			/*update_date datetime 更新日*/

			ResultSet rs =  ps.executeQuery();

			while(rs.next()){
				ItemDTO CartDataDTO = new ItemDTO();
				CartDataDTO.setProduct_id(rs.getInt("product_id"));
				CartDataDTO.setStock(rs.getInt("item_count"));
				CartListDTO.add(CartDataDTO);
			}

		}catch(SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return CartListDTO;
	}


	/**
	 * カート内指定削除
	 * @param user_id
	 * @param id
	 */
	public void CartDell(String user_id,int id){

		DBConnector db =new DBConnector();
		Connection con = db.getConnection();

		String sql = "DELETE FROM cart_info WHERE user_id = ? AND id = ? ;";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setInt(2, id);
			/*id int primary key not null,ID*/
			/*user_id varchar(16) not null,ユーザーID*/
			 /*foreign key(user_id) references user_info(user_id),user_info.user_idとfk*/
			/*product_id int not null,商品ID*/
			/*foreign key(product_id) references product_info(product_id), product_info.product_idとfk*/
			/*insert_date datetime not null,登録日*/
			/*update_date datetime 更新日*/

			ps.execute();

		}catch(SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

	}


	/**
	 * 仮IDからログインIDへの切り替え
	 * @param tmpID 仮ID
	 * @param user_id ログインID
	 */
	public void CartLoginUpdate(String tmpID,String user_id){

		DBConnector db =new DBConnector();
		Connection con = db.getConnection();

		String sql = "UPDATE cart_info SET user_id = ? WHERE user_id = ? ;";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setString(2, tmpID);
			/*id int primary key not null,ID*/
			/*user_id varchar(16) not null,ユーザーID*/
			 /*foreign key(user_id) references user_info(user_id),user_info.user_idとfk*/
			/*product_id int not null,商品ID*/
			/*foreign key(product_id) references product_info(product_id), product_info.product_idとfk*/
			/*insert_date datetime not null,登録日*/
			/*update_date datetime 更新日*/

			ps.execute();

		}catch(SQLException e){
			e.printStackTrace();
		}

		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

	}
}

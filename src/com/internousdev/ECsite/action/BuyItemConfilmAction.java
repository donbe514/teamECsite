package com.internousdev.ECsite.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ECsite.dao.BuyItemComplateDAO;
import com.internousdev.ECsite.dao.CartActionDAO;
import com.internousdev.ECsite.dao.ItemDetailDAO;
import com.internousdev.ECsite.dto.ItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfilmAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;

	private String message = "";
	public ArrayList<ItemDTO> BuyFalseList = new ArrayList<ItemDTO>();
	private boolean BuyFalseFlag = false;
	private boolean CartEnptyFlag=false;
	private int id =0;

	public String BuyItemConplate(){
		String result = ERROR;
		String user_id = "";
		int ErrorCount = 0;
		ItemDetailDAO IDDAO = new ItemDetailDAO();
		CartActionDAO CADAO = new CartActionDAO();
		BuyItemComplateDAO BIDAO = new BuyItemComplateDAO();
		ArrayList<ItemDTO> CartAry = new ArrayList<ItemDTO>();

		if(id<=0){
			result = "address";
			ErrorCount++;
		}else{

			if(session.get("user_id") == null){//決済確定時、未ログインならログインページへ
				result = "login";
				ErrorCount++;
			}else{
			    user_id = session.get("user_id").toString();
				CartAry = CADAO.CartShow(user_id);
				if(CartAry.isEmpty()){//カート内容がなければカート画面へ
					result = "cart";
					message=message+"カートに商品がありません。<br>";
					CartEnptyFlag=true;
					ErrorCount++;
				}
			}

			if(ErrorCount<1){//エラーチェックに引っかからなければ
				Iterator<ItemDTO> CartItr = CartAry.iterator();
				int BuySuccsessCount =0;

				while(CartItr.hasNext()){//カート情報の数だけループ

					ItemDTO CartDataDTO = new ItemDTO();//現在のカート情報用
					ItemDTO StockCheckDTO = new ItemDTO();//商品情報検索用

					CartDataDTO = (ItemDTO)CartItr.next();//現在のカート項目の引き出し
					StockCheckDTO = IDDAO.detail(CartDataDTO.getProduct_id());

					if(StockCheckDTO.getStock() >= CartDataDTO.getStock()){//在庫 >= カート投入数 なら在庫足りてる

						BIDAO.CartHistoryIn(user_id, CartDataDTO.getProduct_id(), CartDataDTO.getStock());//カート情報を履歴に書き込み
						BIDAO.StockChenge(StockCheckDTO.getStock()-CartDataDTO.getStock(), CartDataDTO.getProduct_id());//在庫情報の更新
						BIDAO.CartDataDelete(CartDataDTO.getId(), user_id);//現在のカート項目の削除

						BuySuccsessCount++;//購入成功回数の記録

					}else{
						BuyFalseList.add(CartDataDTO);//購入失敗リストの追加
						BIDAO.CartDataDelete(CartDataDTO.getId(), user_id);//現在のカート項目の削除
					}

				}

				if(!(BuyFalseList.isEmpty())){
					BuyFalseFlag =true;
				}

				if(BuySuccsessCount<1){//購入成功回数が0以下ならカート画面へ

					result = "cart";
					message=message+"在庫が足りず、商品が購入できませんでした。商品画面から再度購入しなおしてください。<br>";
					CartEnptyFlag=true;

				}else{//購入成功回数1回以上あれば決済完了画面へ
					result = SUCCESS;
				}

			}
		}

		return result;
	}


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ArrayList<ItemDTO> getBuyFalseList() {
		return BuyFalseList;
	}

	public void setBuyFalseList(ArrayList<ItemDTO> buyFalseList) {
		BuyFalseList = buyFalseList;
	}


	public boolean isCartEnptyFlag() {
		return CartEnptyFlag;
	}


	public void setCartEnptyFlag(boolean cartEnptyFlag) {
		CartEnptyFlag = cartEnptyFlag;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public boolean isBuyFalseFlag() {
		return BuyFalseFlag;
	}


	public void setBuyFalseFlag(boolean buyFalseFlag) {
		BuyFalseFlag = buyFalseFlag;
	}



}

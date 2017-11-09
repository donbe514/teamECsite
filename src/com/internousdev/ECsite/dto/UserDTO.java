
package com.internousdev.ECsite.dto;

public class UserDTO {

	private int id;

	private String user_id;

	private String password;

	private String first_name;

	private String family_name;

	private String first_name_kana;

	private String family_name_kana;

	private int sex;

	private String email;

	private int status;

	private int logined;

    private String insert_date;

	private String update_date;

	public boolean loginFlg = false;





	public int getId(){
	 return id;
	}
	public void setId(int id){
		this.id = id;
	}


	public String getUser_id(){
		return user_id;
	}
	public void setUser_id(String user_id){
		this.user_id = user_id;
	}


     public String getPassword(){
    	 return password;
     }
     public void setPassword(String password){
    	this.password = password;
     }


     public String getFirst_name(){
    	 return first_name;
     }
     public void setFirst_name(String first_name){
    	 this.first_name = first_name;
     }


     public String getFamily_name(){
    	 return family_name;
     }
     public void setFamily_name(String family_name){
    	 this.family_name = family_name;
     }


     public String getFirst_name_kana(){
    	 return first_name_kana;
     }
     public void setFirst_name_kana(String first_name_kana){
    	 this.first_name_kana = first_name_kana;
     }


     public String getFamily_name_kana(){
    	 return family_name_kana;
     }
     public void setFamily_name_kana(String family_name_kana){
    	 this.family_name_kana = family_name_kana;
     }


     public int getSex(){
    	 return sex;
     }
     public void setSex(int sex){
    	 this.sex =sex;
     }


     public String getEmail(){
    	 return email;
    }
     public void setEmail(String email){
    	 this.email=email;
    }


     public int getStatus(){
    	 return status;
     }
     public void setStatus(int status){
    	 this.status = status;
     }


     public int getLogined(){
    	 return logined;
     }
     public void setLogined( int logined){
    	 this.logined  = logined;
     }


     public String getInsert_date(){
    	 return insert_date;
     }
     public void setInsert_date(String insert_date){
    	 this.insert_date = insert_date;
     }


     public String getUpdate_date(){
    	 return update_date;
     }
     public void setUpdate_date(String update_date){
    	 this.update_date = update_date;
     }
	/**
	 * loginFlgを取得します。
	 * @return loginFlg
	 */
	public boolean getLoginFlg() {
	    return loginFlg;
	}
	/**
	 * loginFlgを設定します。
	 * @param loginFlg loginFlg
	 */
	public void setLoginFlg(boolean loginFlg) {
	    this.loginFlg = loginFlg;
	}

     }



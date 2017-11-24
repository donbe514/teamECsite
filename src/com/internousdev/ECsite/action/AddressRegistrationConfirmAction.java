package com.internousdev.ECsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AddressRegistrationConfirmAction extends ActionSupport implements SessionAware{

	public String putFamily_name;
	public String putFirst_name;
	public String putFamily_name_kana;
	public String putFirst_name_kana;
	public String sex;
	public String putUser_address;
	public String putTel_number;
	public String putEmail;

	public Map<String,Object> session;
	public String result;
	public List<String> errorMessage = new ArrayList<>();

	public String execute() {
		result = SUCCESS;



		if(!(putFamily_name.equals("")) && !(putFirst_name.equals("")) && !(putFamily_name_kana.equals("")) && !(putFirst_name_kana.equals(""))&& !(putUser_address.equals("")) && !(putTel_number.equals("")) && !(putEmail.equals(""))
			&& !(putFamily_name.length()<1 || putFamily_name.length()>16) && !(putFirst_name.length()<1 || putFirst_name.length()>16) && !(putFamily_name_kana.length()<1 || putFamily_name_kana.length()>16) && !(putFirst_name_kana.length()<1 || putFirst_name_kana.length()>16) && !(putUser_address.length()<15 || putUser_address.length()>50) && !(putTel_number.length()<11 || putTel_number.length()>13) && !(putEmail.length()<18 || putEmail.length()>32)){
			session.put("putFamily_name", putFamily_name);
			session.put("putFirst_name", putFirst_name);
			session.put("putFamily_name_kana", putFamily_name_kana);
			session.put("putFirst_name_kana", putFirst_name_kana);
			session.put("putUser_address", putUser_address);
			session.put("putTel_number", putTel_number);
			session.put("putEmail", putEmail);
		}

		/*未入力時または指定された桁数･文字種以外の時errorMessageにエラーメッセージを追加する。*/

		if(putFamily_name.equals("")||putFamily_name.matches("^[ 　]+$")){
			errorMessage.add("姓を入力してください。");
			result = ERROR;
		}
		if(putFirst_name.equals("")||putFirst_name.matches("^[ 　]+$")){
			errorMessage.add("名を入力してください。");
			result = ERROR;
		}
		if(putFamily_name_kana.equals("")||putFamily_name_kana.matches("^[ 　]+$")){
			errorMessage.add("姓ふりがなを入力してください。");
			result = ERROR;
		}
		if(putFirst_name_kana.equals("")||putFirst_name_kana.matches("^[ 　]+$")){
			errorMessage.add("名ふりがなを入力してください。");
			result = ERROR;
		}
		if(putUser_address.equals("")||putUser_address.matches("^[ 　]+$")){
			errorMessage.add("住所を入力してください。");
			result = ERROR;
		}
		if(putTel_number.equals("")||putTel_number.matches("^[ 　]+$")){
			errorMessage.add("電話番号を入力してください。");
			result = ERROR;
		}
		if(putEmail.equals("")||putEmail.matches("^[ 　]+$")){
			errorMessage.add("メールアドレスを入力してください。");
			result = ERROR;
		}

		if(putFamily_name.length()<1 || putFamily_name.length()>16){
			errorMessage.add("姓は1文字以上16文字以下で入力してください。");
			result = ERROR;
		}
		if(putFirst_name.length()<1 || putFirst_name.length()>16){
			errorMessage.add("名は1文字以上16文字以下で入力してください。");
			result = ERROR;
		}
		if(putFamily_name_kana.length()<1 || putFamily_name_kana.length()>16){
			errorMessage.add("姓ふりがなは1文字以上16文字以下で入力してください。");
			result = ERROR;
		}
		if(putFirst_name_kana.length()<1 || putFirst_name_kana.length()>16){
			errorMessage.add("名ふりがなは1文字以上16文字以下で入力してください。");
			result = ERROR;
		}
		if(putUser_address.length()<15 || putUser_address.length()>50){
			errorMessage.add("住所は15文字以上50文字以下で入力してください。");
			result = ERROR;
		}
		if(putTel_number.length()<11 || putTel_number.length()>13){
			errorMessage.add("電話番号は11文字以上13文字以下で入力してください。");
			result = ERROR;
		}
		if(putEmail.length()<18 || putEmail.length()>32){
			errorMessage.add("メールアドレスは18文字以上32文字以下で入力してください。");
			result = ERROR;
		}

		if(!putFamily_name.matches("^[a-zA-Z]+$") && !putFamily_name.matches("^[ぁ-ゞ]+$") && !putFamily_name.matches("^[一-龠]*$")){
			errorMessage.add("姓は半角英語･ひらがな･漢字で入力してください。");
			result = ERROR;
		}

		if(!putFirst_name.matches("^[a-zA-Z]+$") && !putFirst_name.matches("^[ぁ-ゞ]+$") && !putFirst_name.matches("^[一-龠]*$")){
			errorMessage.add("名は半角英語･ひらがな･漢字で入力してください。");
			result = ERROR;
		}


		if (!(putFamily_name_kana.matches("^[\\u3040-\\u309F]+$"))) {
			errorMessage.add("姓ふりがなはひらがなで入力してください。");
			result = ERROR;
		}
		if (!(putFirst_name_kana.matches("^[\\u3040-\\u309F]+$"))) {
			errorMessage.add("名ふりがなはひらがなで入力してください。");
			result = ERROR;
		}
		if (!putTel_number.matches("^[0-9]+$")) {
			errorMessage.add("電話番号は半角数字で入力してください。");
			result = ERROR;

		}
		if(!putUser_address.matches("^[-_.,/@+*;:#$%&A-Za-z0-9]+$") && !putUser_address.matches("^[ぁ-ゞ]+$") && !putUser_address.matches("^[一-龠]*$")&& !putUser_address.matches("^[ァ-ヶ]+$")&& !putUser_address.matches("^[｡-ﾟ+]+$")){
			errorMessage.add("住所は半角英数字･ひらがな･漢字・カタカナ・半角記号で入力してください。");
			result = ERROR;
		}


//		if (!putEmail.matches("^[a-zA-Z0-9 -/:-@\[-\`\{-\~]+$")) {
		if (!putEmail.matches("^[a-zA-Z0-9#$%&'_`/=~\\*\\+\\-\\?\\^\\{\\|\\}]+(\\.[a-zA-Z0-9!#$%&'_`/=~\\*\\+\\-\\?\\^\\{\\|\\}]+)*+(.*)@[a-zA-Z0-9][a-zA-Z0-9\\-]*(\\.[a-zA-Z0-9\\-]+)+$")) {
			errorMessage.add("正しいメールアドレスの形式で入力してください。");
			result = ERROR;
		}

//		String pattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$" ;
//		　
//		Pattern p = Pattern.compile(pattern);
//		if(p.matcher(str).find()){
//		    System.out.println(str + "はメールアドレスの形式です");
//		}else{
//		    System.out.println(str + "はメールアドレスの形式ではありません");
//		}

		return result;

	}



	/**
	 * @return putFamily_name
	 */
	public String getPutFamily_name() {
		return putFamily_name;
	}
	/**
	 * @param putFamily_name セットする putFamily_name
	 */
	public void setPutFamily_name(String putFamily_name) {
		this.putFamily_name = putFamily_name;
	}
	/**
	 * @return putFirst_name
	 */
	public String getPutFirst_name() {
		return putFirst_name;
	}
	/**
	 * @param putFirst_name セットする putFirst_name
	 */
	public void setPutFirst_name(String putFirst_name) {
		this.putFirst_name = putFirst_name;
	}
	/**
	 * @return putFamily_name_kana
	 */
	public String getPutFamily_name_kana() {
		return putFamily_name_kana;
	}
	/**
	 * @param putFamily_name_kana セットする putFamily_name_kana
	 */
	public void setPutFamily_name_kana(String putFamily_name_kana) {
		this.putFamily_name_kana = putFamily_name_kana;
	}
	/**
	 * @return putFirst_name_kana
	 */
	public String getPutFirst_name_kana() {
		return putFirst_name_kana;
	}
	/**
	 * @param putFirst_name_kana セットする putFirst_name_kana
	 */
	public void setPutFirst_name_kana(String putFirst_name_kana) {
		this.putFirst_name_kana = putFirst_name_kana;
	}
	/**
	 * @return putUser_address
	 */
	public String getPutUser_address() {
		return putUser_address;
	}
	/**
	 * @param putUser_address セットする putUser_address
	 */
	public void setPutUser_address(String putUser_address) {
		this.putUser_address = putUser_address;
	}
	/**
	 * @return putTel_number
	 */
	public String getPutTel_number() {
		return putTel_number;
	}
	/**
	 * @param putTel_number セットする putTel_number
	 */
	public void setPutTel_number(String putTel_number) {
		this.putTel_number = putTel_number;
	}
	/**
	 * @return putEmail
	 */
	public String getPutEmail() {
		return putEmail;
	}
	/**
	 * @param putEmail セットする putEmail
	 */
	public void setPutEmail(String putEmail) {
		this.putEmail = putEmail;
	}
	/**
	 * @return session
	 */
	public Map<String, Object> getSession() {
		return session;
	}
	/**
	 * @param session セットする session
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	/**
	 * @return sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex セットする sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}


}

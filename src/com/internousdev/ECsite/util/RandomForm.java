package com.internousdev.ECsite.util;

import java.security.SecureRandom;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * 無作為数列/無作為文字列生成クラス
 * @author internousdev
 *
 */
public class RandomForm {


	/**
	 * 1～9桁までのint形の無作為数列を生成。頭数桁0になる可能性あり。
	 * @param i 任意の桁数
	 * @return 無作為数列
	 */
	public int RandomNom(int i){
		int result = 0;
		if(i<10){
			double db = Math.pow(10, i);
			SecureRandom sr = new SecureRandom();
			result = sr.nextInt((int)db);
		}

		return result;
	}

	/**
	 * 任意の文字数の無作為文字列を生成。
	 * @param i 任意の文字数
	 * @return 無作為文字列
	 */
	public String RandomStr(int i){
		String result = RandomStringUtils.randomAlphabetic(i);

		return result;
	}

}

package com.internousdev.ECsite.util;

import java.security.SecureRandom;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomForm {

	public int RandomNom(int i){
		int result = 0;
		if(i<10){
			double db = Math.pow(10, i);
			SecureRandom sr = new SecureRandom();
			result = sr.nextInt((int)db);
		}

		return result;
	}

	public String RandomStr(int i){
		String result = RandomStringUtils.randomAlphabetic(i);

		return result;
	}

}

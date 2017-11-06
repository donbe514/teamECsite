package com.internousdev.ECsite.util;

import java.security.SecureRandom;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomForm {

	public int RandomInt(int i){
		int result = 0;
		SecureRandom sr = new SecureRandom();
		result = sr.nextInt(i);

		return result;
	}

	public String RandomStr(int i){
		String result = RandomStringUtils.randomAlphabetic(i);

		return result;
	}

}

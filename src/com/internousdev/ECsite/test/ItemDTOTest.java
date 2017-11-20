package com.internousdev.ECsite.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.ECsite.dto.ItemDTO;

public class ItemDTOTest {

	ItemDTO test = new ItemDTO();
	String expected;
	String actual;

	int expectedInt;
	int actualInt;

	private void assertThat1(String message, String string) {
	}

/*     Stock    */
	@Test
	public void testGetStock1() {
		expectedInt = 0;
		test.setStock(expectedInt);

		assertEquals(expectedInt,test.getStock());
	}

	@Test
	public void testGetStock2() {
		expectedInt = -2147483648;
		test.setStock(expectedInt);

		assertEquals(expectedInt,test.getStock());
	}

	@Test
	public void testGetStock3() {
		expectedInt = 2147483647;
		test.setStock(expectedInt);

		assertEquals(expectedInt,test.getStock());
	}

	@Test
	public void testGetStock4() {
		try {
			expectedInt = Integer.parseInt("-2147483649");
			test.setStock(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetStock5() {
		try {
			expectedInt = Integer.parseInt("2147483648");
			test.setStock(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetStock1() {
		expectedInt = 0;
		test.setStock(expectedInt);
		actualInt = test.getStock();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetStock2() {
		expectedInt = -2147483648;
		test.setStock(expectedInt);
		actualInt = test.getStock();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetStock3() {
		expectedInt = 2147483647;
		test.setStock(expectedInt);
		actualInt = test.getStock();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetStock4() {
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setStock(postalMin);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	@Test
	public void testSetStock5() {
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setStock(postalMax);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	/*     Product_name    */

	@Test
	public void testGetProduct_name1() {
		expected = null;
		test.setProduct_name(expected);

		assertEquals(expected,test.getProduct_name());
	}

	@Test
	public void testGetProduct_name2() {
		expected = "";
		test.setProduct_name(expected);

		assertEquals(expected,test.getProduct_name());
	}

	@Test
	public void testGetProduct_name3() {
		expected = " ";
		test.setProduct_name(expected);

		assertEquals(expected,test.getProduct_name());
	}

	@Test
	public void testGetProduct_name4() {
		expected = "　";
		test.setProduct_name(expected);

		assertEquals(expected,test.getProduct_name());
	}

	@Test
	public void testGetProduct_name5() {
		expected = "abc123";
		test.setProduct_name(expected);

		assertEquals(expected,test.getProduct_name());
	}

	@Test
	public void testGetProduct_name6() {
		expected = "あいう１２３";
		test.setProduct_name(expected);

		assertEquals(expected,test.getProduct_name());
	}

	@Test
	public void testGetProduct_name7() {
		expected = "abc123あいう１２３";
		test.setProduct_name(expected);

		assertEquals(expected,test.getProduct_name());
	}

	@Test
	public void testGetProduct_name8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setProduct_name(expected);

		assertEquals(expected,test.getProduct_name());
	}


	@Test
	public void testSetProduct_name1() {
		expected = null;
		test.setProduct_name(expected);
		actual = test.getProduct_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_name2() {
		expected = "";
		test.setProduct_name(expected);
		actual = test.getProduct_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_name3() {
		expected = " ";
		test.setProduct_name(expected);
		actual = test.getProduct_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_name4() {
		expected = "　";
		test.setProduct_name(expected);
		actual = test.getProduct_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_name5() {
		expected = "abc123";
		test.setProduct_name(expected);
		actual = test.getProduct_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_name6() {
		expected = "あいう１２３";
		test.setProduct_name(expected);
		actual = test.getProduct_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_name7() {
		expected = "abc123あいう１２３";
		test.setProduct_name(expected);
		actual = test.getProduct_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_name8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setProduct_name(expected);
		actual = test.getProduct_name();

		assertEquals(expected,actual);
	}

	/*     Product_name_kana    */

	@Test
	public void testGetProduct_name_kana1() {
		expected = null;
		test.setProduct_name_kana(expected);

		assertEquals(expected,test.getProduct_name_kana());
	}

	@Test
	public void testGetProduct_name_kana2() {
		expected = "";
		test.setProduct_name_kana(expected);

		assertEquals(expected,test.getProduct_name_kana());
	}

	@Test
	public void testGetProduct_name_kana3() {
		expected = " ";
		test.setProduct_name_kana(expected);

		assertEquals(expected,test.getProduct_name_kana());
	}

	@Test
	public void testGetProduct_name_kana4() {
		expected = "　";
		test.setProduct_name_kana(expected);

		assertEquals(expected,test.getProduct_name_kana());
	}

	@Test
	public void testGetProduct_name_kana5() {
		expected = "abc123";
		test.setProduct_name_kana(expected);

		assertEquals(expected,test.getProduct_name_kana());
	}

	@Test
	public void testGetProduct_name_kana6() {
		expected = "あいう１２３";
		test.setProduct_name_kana(expected);

		assertEquals(expected,test.getProduct_name_kana());
	}

	@Test
	public void testGetProduct_name_kana7() {
		expected = "abc123あいう１２３";
		test.setProduct_name_kana(expected);

		assertEquals(expected,test.getProduct_name_kana());
	}

	@Test
	public void testGetProduct_name_kana8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setProduct_name_kana(expected);

		assertEquals(expected,test.getProduct_name_kana());
	}


	@Test
	public void testSetProduct_name_kana1() {
		expected = null;
		test.setProduct_name_kana(expected);
		actual = test.getProduct_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_name_kana2() {
		expected = "";
		test.setProduct_name_kana(expected);
		actual = test.getProduct_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_name_kana3() {
		expected = " ";
		test.setProduct_name_kana(expected);
		actual = test.getProduct_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_name_kana4() {
		expected = "　";
		test.setProduct_name_kana(expected);
		actual = test.getProduct_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_name_kana5() {
		expected = "abc123";
		test.setProduct_name_kana(expected);
		actual = test.getProduct_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_name_kana6() {
		expected = "あいう１２３";
		test.setProduct_name_kana(expected);
		actual = test.getProduct_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_name_kana7() {
		expected = "abc123あいう１２３";
		test.setProduct_name_kana(expected);
		actual = test.getProduct_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_name_kana8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setProduct_name_kana(expected);
		actual = test.getProduct_name_kana();

		assertEquals(expected,actual);
	}

	/*     Product_description    */

	@Test
	public void testGetProduct_description1() {
		expected = null;
		test.setProduct_description(expected);

		assertEquals(expected,test.getProduct_description());
	}

	@Test
	public void testGetProduct_description2() {
		expected = "";
		test.setProduct_description(expected);

		assertEquals(expected,test.getProduct_description());
	}

	@Test
	public void testGetProduct_description3() {
		expected = " ";
		test.setProduct_description(expected);

		assertEquals(expected,test.getProduct_description());
	}

	@Test
	public void testGetProduct_description4() {
		expected = "　";
		test.setProduct_description(expected);

		assertEquals(expected,test.getProduct_description());
	}

	@Test
	public void testGetProduct_description5() {
		expected = "abc123";
		test.setProduct_description(expected);

		assertEquals(expected,test.getProduct_description());
	}

	@Test
	public void testGetProduct_description6() {
		expected = "あいう１２３";
		test.setProduct_description(expected);

		assertEquals(expected,test.getProduct_description());
	}

	@Test
	public void testGetProduct_description7() {
		expected = "abc123あいう１２３";
		test.setProduct_description(expected);

		assertEquals(expected,test.getProduct_description());
	}

	@Test
	public void testGetProduct_description8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setProduct_description(expected);

		assertEquals(expected,test.getProduct_description());
	}


	@Test
	public void testSetProduct_description1() {
		expected = null;
		test.setProduct_description(expected);
		actual = test.getProduct_description();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_description2() {
		expected = "";
		test.setProduct_description(expected);
		actual = test.getProduct_description();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_description3() {
		expected = " ";
		test.setProduct_description(expected);
		actual = test.getProduct_description();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_description4() {
		expected = "　";
		test.setProduct_description(expected);
		actual = test.getProduct_description();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_description5() {
		expected = "abc123";
		test.setProduct_description(expected);
		actual = test.getProduct_description();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_description6() {
		expected = "あいう１２３";
		test.setProduct_description(expected);
		actual = test.getProduct_description();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_description7() {
		expected = "abc123あいう１２３";
		test.setProduct_description(expected);
		actual = test.getProduct_description();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetProduct_description8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setProduct_description(expected);
		actual = test.getProduct_description();

		assertEquals(expected,actual);
	}


	/*     Category_id    */

	@Test
	public void testGetCategory_id1() {
		expectedInt = 0;
		test.setCategory_id(expectedInt);

		assertEquals(expectedInt,test.getCategory_id());
	}

	@Test
	public void testGetCategory_id2() {
		expectedInt = -2147483648;
		test.setCategory_id(expectedInt);

		assertEquals(expectedInt,test.getCategory_id());
	}

	@Test
	public void testGetCategory_id3() {
		expectedInt = 2147483647;
		test.setCategory_id(expectedInt);

		assertEquals(expectedInt,test.getCategory_id());
	}

	@Test
	public void testGetCategory_id4() {
		try {
			expectedInt = Integer.parseInt("-2147483649");
			test.setCategory_id(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetCategory_id5() {
		try {
			expectedInt = Integer.parseInt("2147483648");
			test.setCategory_id(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetCategory_id1() {
		expectedInt = 0;
		test.setCategory_id(expectedInt);
		actualInt = test.getCategory_id();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetCategory_id2() {
		expectedInt = -2147483648;
		test.setCategory_id(expectedInt);
		actualInt = test.getCategory_id();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetCategory_id3() {
		expectedInt = 2147483647;
		test.setCategory_id(expectedInt);
		actualInt = test.getCategory_id();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetCategory_id4() {
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setCategory_id(postalMin);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	@Test
	public void testSetCategory_id5() {
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setCategory_id(postalMax);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}

	}


	/*     Price    */
	@Test
	public void testGetPrice1() {
		expectedInt = 0;
		test.setPrice(expectedInt);

		assertEquals(expectedInt,test.getPrice());
	}

	@Test
	public void testGetPrice2() {
		expectedInt = -2147483648;
		test.setPrice(expectedInt);

		assertEquals(expectedInt,test.getPrice());
	}

	@Test
	public void testGetPrice3() {
		expectedInt = 2147483647;
		test.setPrice(expectedInt);

		assertEquals(expectedInt,test.getPrice());
	}

	@Test
	public void testGetPrice4() {
		try {
			expectedInt = Integer.parseInt("-2147483649");
			test.setPrice(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetPrice5() {
		try {
			expectedInt = Integer.parseInt("2147483648");
			test.setPrice(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetPrice1() {
		expectedInt = 0;
		test.setPrice(expectedInt);
		actualInt = test.getPrice();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetPrice2() {
		expectedInt = -2147483648;
		test.setPrice(expectedInt);
		actualInt = test.getPrice();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetPrice3() {
		expectedInt = 2147483647;
		test.setPrice(expectedInt);
		actualInt = test.getPrice();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetPrice4() {
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setPrice(postalMin);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	@Test
	public void testSetPrice5() {
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setPrice(postalMax);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	/*     Release_date    */

	@Test
	public void testGetRelease_date1() {
		expected = null;
		test.setRelease_date(expected);

		assertEquals(expected,test.getRelease_date());
	}

	@Test
	public void testGetRelease_date2() {
		expected = "";
		test.setRelease_date(expected);

		assertEquals(expected,test.getRelease_date());
	}

	@Test
	public void testGetRelease_date3() {
		expected = " ";
		test.setRelease_date(expected);

		assertEquals(expected,test.getRelease_date());
	}

	@Test
	public void testGetRelease_date4() {
		expected = "　";
		test.setRelease_date(expected);

		assertEquals(expected,test.getRelease_date());
	}

	@Test
	public void testGetRelease_date5() {
		expected = "abc123";
		test.setRelease_date(expected);

		assertEquals(expected,test.getRelease_date());
	}

	@Test
	public void testGetRelease_date6() {
		expected = "あいう１２３";
		test.setRelease_date(expected);

		assertEquals(expected,test.getRelease_date());
	}

	@Test
	public void testGetRelease_date7() {
		expected = "abc123あいう１２３";
		test.setRelease_date(expected);

		assertEquals(expected,test.getRelease_date());
	}

	@Test
	public void testGetRelease_date8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setRelease_date(expected);

		assertEquals(expected,test.getRelease_date());
	}


	@Test
	public void testSetRelease_date1() {
		expected = null;
		test.setRelease_date(expected);
		actual = test.getRelease_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date2() {
		expected = "";
		test.setRelease_date(expected);
		actual = test.getRelease_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date3() {
		expected = " ";
		test.setRelease_date(expected);
		actual = test.getRelease_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date4() {
		expected = "　";
		test.setRelease_date(expected);
		actual = test.getRelease_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date5() {
		expected = "abc123";
		test.setRelease_date(expected);
		actual = test.getRelease_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date6() {
		expected = "あいう１２３";
		test.setRelease_date(expected);
		actual = test.getRelease_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date7() {
		expected = "abc123あいう１２３";
		test.setRelease_date(expected);
		actual = test.getRelease_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_date8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setRelease_date(expected);
		actual = test.getRelease_date();

		assertEquals(expected,actual);
	}

	/*     Release_company    */

	@Test
	public void testGetRelease_company1() {
		expected = null;
		test.setRelease_company(expected);

		assertEquals(expected,test.getRelease_company());
	}

	@Test
	public void testGetRelease_company2() {
		expected = "";
		test.setRelease_company(expected);

		assertEquals(expected,test.getRelease_company());
	}

	@Test
	public void testGetRelease_company3() {
		expected = " ";
		test.setRelease_company(expected);

		assertEquals(expected,test.getRelease_company());
	}

	@Test
	public void testGetRelease_company4() {
		expected = "　";
		test.setRelease_company(expected);

		assertEquals(expected,test.getRelease_company());
	}

	@Test
	public void testGetRelease_company5() {
		expected = "abc123";
		test.setRelease_company(expected);

		assertEquals(expected,test.getRelease_company());
	}

	@Test
	public void testGetRelease_company6() {
		expected = "あいう１２３";
		test.setRelease_company(expected);

		assertEquals(expected,test.getRelease_company());
	}

	@Test
	public void testGetRelease_company7() {
		expected = "abc123あいう１２３";
		test.setRelease_company(expected);

		assertEquals(expected,test.getRelease_company());
	}

	@Test
	public void testGetRelease_company8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setRelease_company(expected);

		assertEquals(expected,test.getRelease_company());
	}


	@Test
	public void testSetRelease_company1() {
		expected = null;
		test.setRelease_company(expected);
		actual = test.getRelease_company();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_company2() {
		expected = "";
		test.setRelease_company(expected);
		actual = test.getRelease_company();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_company3() {
		expected = " ";
		test.setRelease_company(expected);
		actual = test.getRelease_company();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_company4() {
		expected = "　";
		test.setRelease_company(expected);
		actual = test.getRelease_company();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_company5() {
		expected = "abc123";
		test.setRelease_company(expected);
		actual = test.getRelease_company();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_company6() {
		expected = "あいう１２３";
		test.setRelease_company(expected);
		actual = test.getRelease_company();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_company7() {
		expected = "abc123あいう１２３";
		test.setRelease_company(expected);
		actual = test.getRelease_company();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetRelease_company8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setRelease_company(expected);
		actual = test.getRelease_company();

		assertEquals(expected,actual);
	}

	/*     Image_file_path    */

	@Test
	public void testGetImage_file_path1() {
		expected = null;
		test.setImage_file_path(expected);

		assertEquals(expected,test.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path2() {
		expected = "";
		test.setImage_file_path(expected);

		assertEquals(expected,test.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path3() {
		expected = " ";
		test.setImage_file_path(expected);

		assertEquals(expected,test.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path4() {
		expected = "　";
		test.setImage_file_path(expected);

		assertEquals(expected,test.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path5() {
		expected = "abc123";
		test.setImage_file_path(expected);

		assertEquals(expected,test.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path6() {
		expected = "あいう１２３";
		test.setImage_file_path(expected);

		assertEquals(expected,test.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path7() {
		expected = "abc123あいう１２３";
		test.setImage_file_path(expected);

		assertEquals(expected,test.getImage_file_path());
	}

	@Test
	public void testGetImage_file_path8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setImage_file_path(expected);

		assertEquals(expected,test.getImage_file_path());
	}


	@Test
	public void testSetImage_file_path1() {
		expected = null;
		test.setImage_file_path(expected);
		actual = test.getImage_file_path();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_path2() {
		expected = "";
		test.setImage_file_path(expected);
		actual = test.getImage_file_path();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_path3() {
		expected = " ";
		test.setImage_file_path(expected);
		actual = test.getImage_file_path();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_path4() {
		expected = "　";
		test.setImage_file_path(expected);
		actual = test.getImage_file_path();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_path5() {
		expected = "abc123";
		test.setImage_file_path(expected);
		actual = test.getImage_file_path();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_path6() {
		expected = "あいう１２３";
		test.setImage_file_path(expected);
		actual = test.getImage_file_path();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_path7() {
		expected = "abc123あいう１２３";
		test.setImage_file_path(expected);
		actual = test.getImage_file_path();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetImage_file_path8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setImage_file_path(expected);
		actual = test.getImage_file_path();

		assertEquals(expected,actual);
	}


	/*     Insert_date    */

	@Test
	public void testGetInsert_date1() {
		expected = null;
		test.setInsert_date(expected);

		assertEquals(expected,test.getInsert_date());
	}

	@Test
	public void testGetInsert_date2() {
		expected = "";
		test.setInsert_date(expected);

		assertEquals(expected,test.getInsert_date());
	}

	@Test
	public void testGetInsert_date3() {
		expected = " ";
		test.setInsert_date(expected);

		assertEquals(expected,test.getInsert_date());
	}

	@Test
	public void testGetInsert_date4() {
		expected = "　";
		test.setInsert_date(expected);

		assertEquals(expected,test.getInsert_date());
	}

	@Test
	public void testGetInsert_date5() {
		expected = "abc123";
		test.setInsert_date(expected);

		assertEquals(expected,test.getInsert_date());
	}

	@Test
	public void testGetInsert_date6() {
		expected = "あいう１２３";
		test.setInsert_date(expected);

		assertEquals(expected,test.getInsert_date());
	}

	@Test
	public void testGetInsert_date7() {
		expected = "abc123あいう１２３";
		test.setInsert_date(expected);

		assertEquals(expected,test.getInsert_date());
	}

	@Test
	public void testGetInsert_date8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setInsert_date(expected);

		assertEquals(expected,test.getInsert_date());
	}


	@Test
	public void testSetInsert_date1() {
		expected = null;
		test.setInsert_date(expected);
		actual = test.getInsert_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsert_date2() {
		expected = "";
		test.setInsert_date(expected);
		actual = test.getInsert_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsert_date3() {
		expected = " ";
		test.setInsert_date(expected);
		actual = test.getInsert_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsert_date4() {
		expected = "　";
		test.setInsert_date(expected);
		actual = test.getInsert_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsert_date5() {
		expected = "abc123";
		test.setInsert_date(expected);
		actual = test.getInsert_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsert_date6() {
		expected = "あいう１２３";
		test.setInsert_date(expected);
		actual = test.getInsert_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsert_date7() {
		expected = "abc123あいう１２３";
		test.setInsert_date(expected);
		actual = test.getInsert_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetInsert_date8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setInsert_date(expected);
		actual = test.getInsert_date();

		assertEquals(expected,actual);
	}


	/*     Update_date    */


	@Test
	public void testGetUpdate_date1() {
		expected = null;
		test.setUpdate_date(expected);

		assertEquals(expected,test.getUpdate_date());
	}

	@Test
	public void testGetUpdate_date2() {
		expected = "";
		test.setUpdate_date(expected);

		assertEquals(expected,test.getUpdate_date());
	}

	@Test
	public void testGetUpdate_date3() {
		expected = " ";
		test.setUpdate_date(expected);

		assertEquals(expected,test.getUpdate_date());
	}

	@Test
	public void testGetUpdate_date4() {
		expected = "　";
		test.setUpdate_date(expected);

		assertEquals(expected,test.getUpdate_date());
	}

	@Test
	public void testGetUpdate_date5() {
		expected = "abc123";
		test.setUpdate_date(expected);

		assertEquals(expected,test.getUpdate_date());
	}

	@Test
	public void testGetUpdate_date6() {
		expected = "あいう１２３";
		test.setUpdate_date(expected);

		assertEquals(expected,test.getUpdate_date());
	}

	@Test
	public void testGetUpdate_date7() {
		expected = "abc123あいう１２３";
		test.setUpdate_date(expected);

		assertEquals(expected,test.getUpdate_date());
	}

	@Test
	public void testGetUpdate_date8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setUpdate_date(expected);

		assertEquals(expected,test.getUpdate_date());
	}


	@Test
	public void testSetUpdate_date1() {
		expected = null;
		test.setUpdate_date(expected);
		actual = test.getUpdate_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUpdate_date2() {
		expected = "";
		test.setUpdate_date(expected);
		actual = test.getUpdate_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUpdate_date3() {
		expected = " ";
		test.setUpdate_date(expected);
		actual = test.getUpdate_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUpdate_date4() {
		expected = "　";
		test.setUpdate_date(expected);
		actual = test.getUpdate_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUpdate_date5() {
		expected = "abc123";
		test.setUpdate_date(expected);
		actual = test.getUpdate_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUpdate_date6() {
		expected = "あいう１２３";
		test.setUpdate_date(expected);
		actual = test.getUpdate_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUpdate_date7() {
		expected = "abc123あいう１２３";
		test.setUpdate_date(expected);
		actual = test.getUpdate_date();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUpdate_date8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setUpdate_date(expected);
		actual = test.getUpdate_date();

		assertEquals(expected,actual);
	}



	/*     Id    */
	@Test
	public void testGetId1() {
		expectedInt = 0;
		test.setId(expectedInt);

		assertEquals(expectedInt,test.getId());
	}

	@Test
	public void testGetId2() {
		expectedInt = -2147483648;
		test.setId(expectedInt);

		assertEquals(expectedInt,test.getId());
	}

	@Test
	public void testGetId3() {
		expectedInt = 2147483647;
		test.setId(expectedInt);

		assertEquals(expectedInt,test.getId());
	}

	@Test
	public void testGetId4() {
		try {
			expectedInt = Integer.parseInt("-2147483649");
			test.setId(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetId5() {
		try {
			expectedInt = Integer.parseInt("2147483648");
			test.setId(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId1() {
		expectedInt = 0;
		test.setId(expectedInt);
		actualInt = test.getId();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetId2() {
		expectedInt = -2147483648;
		test.setId(expectedInt);
		actualInt = test.getId();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetId3() {
		expectedInt = 2147483647;
		test.setId(expectedInt);
		actualInt = test.getId();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetId4() {
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setId(postalMin);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	@Test
	public void testSetId5() {
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setStock(postalMax);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	/*     Product_id    */

	@Test
	public void testGetProduct_id1() {
		expectedInt = 0;
		test.setProduct_id(expectedInt);

		assertEquals(expectedInt,test.getProduct_id());
	}

	@Test
	public void testGetProduct_id2() {
		expectedInt = -2147483648;
		test.setProduct_id(expectedInt);

		assertEquals(expectedInt,test.getProduct_id());
	}

	@Test
	public void testGetProduct_id3() {
		expectedInt = 2147483647;
		test.setProduct_id(expectedInt);

		assertEquals(expectedInt,test.getProduct_id());
	}

	@Test
	public void testGetProduct_id4() {
		try {
			expectedInt = Integer.parseInt("-2147483649");
			test.setProduct_id(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetProduct_id5() {
		try {
			expectedInt = Integer.parseInt("2147483648");
			test.setProduct_id(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetProduct_id1() {
		expectedInt = 0;
		test.setProduct_id(expectedInt);
		actualInt = test.getProduct_id();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetProduct_id2() {
		expectedInt = -2147483648;
		test.setProduct_id(expectedInt);
		actualInt = test.getProduct_id();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetProduct_id3() {
		expectedInt = 2147483647;
		test.setProduct_id(expectedInt);
		actualInt = test.getProduct_id();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetProduct_id4() {
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setProduct_id(postalMin);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	@Test
	public void testSetProduct_id5() {
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setProduct_id(postalMax);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	/*     Status    */
	@Test
	public void testGetStatus1() {
		expectedInt = 0;
		test.setStatus(expectedInt);

		assertEquals(expectedInt,test.getStatus());
	}

	@Test
	public void testGetStatus2() {
		expectedInt = -2147483648;
		test.setStatus(expectedInt);

		assertEquals(expectedInt,test.getStatus());
	}

	@Test
	public void testGetStatus3() {
		expectedInt = 2147483647;
		test.setStatus(expectedInt);

		assertEquals(expectedInt,test.getStatus());
	}

	@Test
	public void testGetStatus4() {
		try {
			expectedInt = Integer.parseInt("-2147483649");
			test.setStatus(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetStatus5() {
		try {
			expectedInt = Integer.parseInt("2147483648");
			test.setStatus(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetStatus1() {
		expectedInt = 0;
		test.setStatus(expectedInt);
		actualInt = test.getStatus();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetStatus2() {
		expectedInt = -2147483648;
		test.setStatus(expectedInt);
		actualInt = test.getStatus();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetStatus3() {
		expectedInt = 2147483647;
		test.setStatus(expectedInt);
		actualInt = test.getStatus();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetStatus4() {
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setStatus(postalMin);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	@Test
	public void testSetStatus5() {
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setStatus(postalMax);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	/*     Total_price    */
	@Test
	public void testGetTotal_price1() {
		expectedInt = 0;
		test.setTotal_price(expectedInt);

		assertEquals(expectedInt,test.getTotal_price());
	}

	@Test
	public void testGetTotal_price2() {
		expectedInt = -2147483648;
		test.setTotal_price(expectedInt);

		assertEquals(expectedInt,test.getTotal_price());
	}

	@Test
	public void testGetTotal_price3() {
		expectedInt = 2147483647;
		test.setTotal_price(expectedInt);

		assertEquals(expectedInt,test.getTotal_price());
	}

	@Test
	public void testGetTotal_price4() {
		try {
			expectedInt = Integer.parseInt("-2147483649");
			test.setTotal_price(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetTotal_price5() {
		try {
			expectedInt = Integer.parseInt("2147483648");
			test.setTotal_price(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetTotal_price1() {
		expectedInt = 0;
		test.setTotal_price(expectedInt);
		actualInt = test.getTotal_price();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetTotal_price2() {
		expectedInt = -2147483648;
		test.setTotal_price(expectedInt);
		actualInt = test.getTotal_price();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetTotal_price3() {
		expectedInt = 2147483647;
		test.setTotal_price(expectedInt);
		actualInt = test.getTotal_price();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetTotal_price4() {
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setTotal_price(postalMin);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	@Test
	public void testSetTotal_price5() {
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setTotal_price(postalMax);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

}

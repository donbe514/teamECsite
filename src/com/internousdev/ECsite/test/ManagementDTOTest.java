package com.internousdev.ECsite.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.ECsite.dto.ManagementDTO;

public class ManagementDTOTest {

	ManagementDTO test = new ManagementDTO();
	String expected;
	String actual;

	int expectedInt;
	int actualInt;

	boolean expectedboolean;
	boolean actualboolean;

	private void assertThat1(String message, String string) {
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

	/*     ManagementFlg    */
	@Test
	public void testGetManagementFlg1() {
		expectedboolean = true;
		test.setManagementFlg(expectedboolean);
		actualboolean = test.getManagementFlg();
		assertEquals(expectedboolean, actualboolean);
	}

	@Test
	public void testGetManagementFlg2() {
		expectedboolean = false;
		test.setManagementFlg(expectedboolean);
		actualboolean = test.getManagementFlg();
		assertEquals(expectedboolean, actualboolean);
	}

	@Test
	public void testsetManagementFlg1() {
		expectedboolean = true;
		test.setManagementFlg(expectedboolean);
		actualboolean = test.getManagementFlg();
		assertEquals(expectedboolean, actualboolean);
	}
	@Test
	public void testsetManagementFlg2() {
		expectedboolean = false;
		test.setManagementFlg(expectedboolean);
		actualboolean = test.getManagementFlg();
		assertEquals(expectedboolean, actualboolean);
	}

	/*     Stocks    */
	@Test
	public void testGetStocks1() {
		expectedInt = 0;
		test.setStocks(expectedInt);

		assertEquals(expectedInt,test.getStocks());
	}

	@Test
	public void testGetStocks2() {
		expectedInt = -2147483648;
		test.setStocks(expectedInt);

		assertEquals(expectedInt,test.getStocks());
	}

	@Test
	public void testGetStocks3() {
		expectedInt = 2147483647;
		test.setStocks(expectedInt);

		assertEquals(expectedInt,test.getStocks());
	}

	@Test
	public void testGetStocks4() {
		try {
			expectedInt = Integer.parseInt("-2147483649");
			test.setStocks(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetStocks5() {
		try {
			expectedInt = Integer.parseInt("2147483648");
			test.setStocks(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetStocks1() {
		expectedInt = 0;
		test.setStocks(expectedInt);
		actualInt = test.getStocks();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetStocks2() {
		expectedInt = -2147483648;
		test.setStocks(expectedInt);
		actualInt = test.getStocks();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetStocks3() {
		expectedInt = 2147483647;
		test.setStocks(expectedInt);
		actualInt = test.getStocks();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetStocks4() {
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setStocks(postalMin);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	@Test
	public void testSetStocks5() {
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setStocks(postalMax);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

}

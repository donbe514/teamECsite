package com.internousdev.ECsite.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.ECsite.dto.UserDTO;

public class UserDTOTest {
	UserDTO test = new UserDTO();
	String expected;
	String actual;

	int expectedInt;
	int actualInt;

	boolean expectedboolean;
	boolean actualboolean;

	private void assertThat1(String message, String string) {
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
			test.setId(postalMax);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	/*     User_id    */
	@Test
	public void testGetUser_id1() {
		expected = null;
		test.setUser_id(expected);

		assertEquals(expected,test.getUser_id());
	}

	@Test
	public void testGetUser_id2() {
		expected = "";
		test.setUser_id(expected);

		assertEquals(expected,test.getUser_id());
	}

	@Test
	public void testGetUser_id3() {
		expected = " ";
		test.setUser_id(expected);

		assertEquals(expected,test.getUser_id());
	}

	@Test
	public void testGetUser_id4() {
		expected = "　";
		test.setUser_id(expected);

		assertEquals(expected,test.getUser_id());
	}

	@Test
	public void testGetUser_id5() {
		expected = "abc123";
		test.setUser_id(expected);

		assertEquals(expected,test.getUser_id());
	}

	@Test
	public void testGetUser_id6() {
		expected = "あいう１２３";
		test.setUser_id(expected);

		assertEquals(expected,test.getUser_id());
	}

	@Test
	public void testGetUser_id7() {
		expected = "abc123あいう１２３";
		test.setUser_id(expected);

		assertEquals(expected,test.getUser_id());
	}

	@Test
	public void testGetUser_id8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setUser_id(expected);

		assertEquals(expected,test.getUser_id());
	}


	@Test
	public void testSetUser_id1() {
		expected = null;
		test.setUser_id(expected);
		actual = test.getUser_id();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUser_id2() {
		expected = "";
		test.setUser_id(expected);
		actual = test.getUser_id();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUser_id3() {
		expected = " ";
		test.setUser_id(expected);
		actual = test.getUser_id();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUser_id4() {
		expected = "　";
		test.setUser_id(expected);
		actual = test.getUser_id();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUser_id5() {
		expected = "abc123";
		test.setUser_id(expected);
		actual = test.getUser_id();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUser_id6() {
		expected = "あいう１２３";
		test.setUser_id(expected);
		actual = test.getUser_id();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUser_id7() {
		expected = "abc123あいう１２３";
		test.setUser_id(expected);
		actual = test.getUser_id();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetUser_id8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setUser_id(expected);
		actual = test.getUser_id();

		assertEquals(expected,actual);
	}

	/*     Password    */
	@Test
	public void testGetPassword1() {
		expected = null;
		test.setPassword(expected);

		assertEquals(expected,test.getPassword());
	}

	@Test
	public void testGetPassword2() {
		expected = "";
		test.setPassword(expected);

		assertEquals(expected,test.getPassword());
	}

	@Test
	public void testGetPassword3() {
		expected = " ";
		test.setPassword(expected);

		assertEquals(expected,test.getPassword());
	}

	@Test
	public void testGetPassword4() {
		expected = "　";
		test.setPassword(expected);

		assertEquals(expected,test.getPassword());
	}

	@Test
	public void testGetPassword5() {
		expected = "abc123";
		test.setPassword(expected);

		assertEquals(expected,test.getPassword());
	}

	@Test
	public void testGetPassword6() {
		expected = "あいう１２３";
		test.setPassword(expected);

		assertEquals(expected,test.getPassword());
	}

	@Test
	public void testGetPassword7() {
		expected = "abc123あいう１２３";
		test.setPassword(expected);

		assertEquals(expected,test.getPassword());
	}

	@Test
	public void testGetPassword8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPassword(expected);

		assertEquals(expected,test.getPassword());
	}


	@Test
	public void testSetPassword1() {
		expected = null;
		test.setPassword(expected);
		actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword2() {
		expected = "";
		test.setPassword(expected);
		actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword3() {
		expected = " ";
		test.setPassword(expected);
		actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword4() {
		expected = "　";
		test.setPassword(expected);
		actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword5() {
		expected = "abc123";
		test.setPassword(expected);
		actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword6() {
		expected = "あいう１２３";
		test.setPassword(expected);
		actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword7() {
		expected = "abc123あいう１２３";
		test.setPassword(expected);
		actual = test.getPassword();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPassword8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPassword(expected);
		actual = test.getPassword();

		assertEquals(expected,actual);
	}

	/*     First_name    */
	@Test
	public void testGetFirst_name1() {
		expected = null;
		test.setFirst_name(expected);

		assertEquals(expected,test.getFirst_name());
	}

	@Test
	public void testGetFirst_name2() {
		expected = "";
		test.setFirst_name(expected);

		assertEquals(expected,test.getFirst_name());
	}

	@Test
	public void testGetFirst_name3() {
		expected = " ";
		test.setFirst_name(expected);

		assertEquals(expected,test.getFirst_name());
	}

	@Test
	public void testGetFirst_name4() {
		expected = "　";
		test.setFirst_name(expected);

		assertEquals(expected,test.getFirst_name());
	}

	@Test
	public void testGetFirst_name5() {
		expected = "abc123";
		test.setFirst_name(expected);

		assertEquals(expected,test.getFirst_name());
	}

	@Test
	public void testGetFirst_name6() {
		expected = "あいう１２３";
		test.setFirst_name(expected);

		assertEquals(expected,test.getFirst_name());
	}

	@Test
	public void testGetFirst_name7() {
		expected = "abc123あいう１２３";
		test.setFirst_name(expected);

		assertEquals(expected,test.getFirst_name());
	}

	@Test
	public void testGetFirst_name8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setFirst_name(expected);

		assertEquals(expected,test.getFirst_name());
	}


	@Test
	public void testSetFirst_name1() {
		expected = null;
		test.setFirst_name(expected);
		actual = test.getFirst_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirst_name2() {
		expected = "";
		test.setFirst_name(expected);
		actual = test.getFirst_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirst_name3() {
		expected = " ";
		test.setFirst_name(expected);
		actual = test.getFirst_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirst_name4() {
		expected = "　";
		test.setFirst_name(expected);
		actual = test.getFirst_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirst_name5() {
		expected = "abc123";
		test.setFirst_name(expected);
		actual = test.getFirst_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirst_name6() {
		expected = "あいう１２３";
		test.setFirst_name(expected);
		actual = test.getFirst_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirst_name7() {
		expected = "abc123あいう１２３";
		test.setFirst_name(expected);
		actual = test.getFirst_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirst_name8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setFirst_name(expected);
		actual = test.getFirst_name();

		assertEquals(expected,actual);
	}

	/*     Family_name    */
	@Test
	public void testGetFamily_name1() {
		expected = null;
		test.setFamily_name(expected);

		assertEquals(expected,test.getFamily_name());
	}

	@Test
	public void testGetFamily_name2() {
		expected = "";
		test.setFamily_name(expected);

		assertEquals(expected,test.getFamily_name());
	}

	@Test
	public void testGetFamily_name3() {
		expected = " ";
		test.setFamily_name(expected);

		assertEquals(expected,test.getFamily_name());
	}

	@Test
	public void testGetFamily_name4() {
		expected = "　";
		test.setFamily_name(expected);

		assertEquals(expected,test.getFamily_name());
	}

	@Test
	public void testGetFamily_name5() {
		expected = "abc123";
		test.setFamily_name(expected);

		assertEquals(expected,test.getFamily_name());
	}

	@Test
	public void testGetFamily_name6() {
		expected = "あいう１２３";
		test.setFamily_name(expected);

		assertEquals(expected,test.getFamily_name());
	}

	@Test
	public void testGetFamily_name7() {
		expected = "abc123あいう１２３";
		test.setFamily_name(expected);

		assertEquals(expected,test.getFamily_name());
	}

	@Test
	public void testGetFamily_name8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setFamily_name(expected);

		assertEquals(expected,test.getFamily_name());
	}


	@Test
	public void testSetFamily_name1() {
		expected = null;
		test.setFamily_name(expected);
		actual = test.getFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamily_name2() {
		expected = "";
		test.setFamily_name(expected);
		actual = test.getFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamily_name3() {
		expected = " ";
		test.setFamily_name(expected);
		actual = test.getFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamily_name4() {
		expected = "　";
		test.setFamily_name(expected);
		actual = test.getFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamily_name5() {
		expected = "abc123";
		test.setFamily_name(expected);
		actual = test.getFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamily_name6() {
		expected = "あいう１２３";
		test.setFamily_name(expected);
		actual = test.getFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamily_name7() {
		expected = "abc123あいう１２３";
		test.setFamily_name(expected);
		actual = test.getFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamily_name8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setFamily_name(expected);
		actual = test.getFamily_name();

		assertEquals(expected,actual);
	}

	/*     First_name_kana    */
	@Test
	public void testGetFirst_name_kana1() {
		expected = null;
		test.setFirst_name_kana(expected);

		assertEquals(expected,test.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana2() {
		expected = "";
		test.setFirst_name_kana(expected);

		assertEquals(expected,test.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana3() {
		expected = " ";
		test.setFirst_name_kana(expected);

		assertEquals(expected,test.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana4() {
		expected = "　";
		test.setFirst_name_kana(expected);

		assertEquals(expected,test.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana5() {
		expected = "abc123";
		test.setFirst_name_kana(expected);

		assertEquals(expected,test.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana6() {
		expected = "あいう１２３";
		test.setFirst_name_kana(expected);

		assertEquals(expected,test.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana7() {
		expected = "abc123あいう１２３";
		test.setFirst_name_kana(expected);

		assertEquals(expected,test.getFirst_name_kana());
	}

	@Test
	public void testGetFirst_name_kana8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setFirst_name_kana(expected);

		assertEquals(expected,test.getFirst_name_kana());
	}


	@Test
	public void testSetFirst_name_kana1() {
		expected = null;
		test.setFirst_name_kana(expected);
		actual = test.getFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirst_name_kana2() {
		expected = "";
		test.setFirst_name_kana(expected);
		actual = test.getFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirst_name_kana3() {
		expected = " ";
		test.setFirst_name_kana(expected);
		actual = test.getFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirst_name_kana4() {
		expected = "　";
		test.setFirst_name_kana(expected);
		actual = test.getFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirst_name_kana5() {
		expected = "abc123";
		test.setFirst_name_kana(expected);
		actual = test.getFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirst_name_kana6() {
		expected = "あいう１２３";
		test.setFirst_name_kana(expected);
		actual = test.getFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirst_name_kana7() {
		expected = "abc123あいう１２３";
		test.setFirst_name_kana(expected);
		actual = test.getFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFirst_name_kana8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setFirst_name_kana(expected);
		actual = test.getFirst_name_kana();

		assertEquals(expected,actual);
	}

	/*     Family_name_kana    */
	@Test
	public void testGetFamily_name_kana1() {
		expected = null;
		test.setFamily_name_kana(expected);

		assertEquals(expected,test.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana2() {
		expected = "";
		test.setFamily_name_kana(expected);

		assertEquals(expected,test.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana3() {
		expected = " ";
		test.setFamily_name_kana(expected);

		assertEquals(expected,test.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana4() {
		expected = "　";
		test.setFamily_name_kana(expected);

		assertEquals(expected,test.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana5() {
		expected = "abc123";
		test.setFamily_name_kana(expected);

		assertEquals(expected,test.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana6() {
		expected = "あいう１２３";
		test.setFamily_name_kana(expected);

		assertEquals(expected,test.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana7() {
		expected = "abc123あいう１２３";
		test.setFamily_name_kana(expected);

		assertEquals(expected,test.getFamily_name_kana());
	}

	@Test
	public void testGetFamily_name_kana8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setFamily_name_kana(expected);

		assertEquals(expected,test.getFamily_name_kana());
	}


	@Test
	public void testSetFamily_name_kana1() {
		expected = null;
		test.setFamily_name_kana(expected);
		actual = test.getFamily_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamily_name_kana2() {
		expected = "";
		test.setFamily_name_kana(expected);
		actual = test.getFamily_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamily_name_kana3() {
		expected = " ";
		test.setFamily_name_kana(expected);
		actual = test.getFamily_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamily_name_kana4() {
		expected = "　";
		test.setFamily_name_kana(expected);
		actual = test.getFamily_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamily_name_kana5() {
		expected = "abc123";
		test.setFamily_name_kana(expected);
		actual = test.getFamily_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamily_name_kana6() {
		expected = "あいう１２３";
		test.setFamily_name_kana(expected);
		actual = test.getFamily_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamily_name_kana7() {
		expected = "abc123あいう１２３";
		test.setFamily_name_kana(expected);
		actual = test.getFamily_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetFamily_name_kana8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setFamily_name_kana(expected);
		actual = test.getFamily_name_kana();

		assertEquals(expected,actual);
	}

	/*     Sex    */
	@Test
	public void testGetSex1() {
		expectedInt = 0;
		test.setSex(expectedInt);

		assertEquals(expectedInt,test.getSex());
	}

	@Test
	public void testGetSex2() {
		expectedInt = -2147483648;
		test.setSex(expectedInt);

		assertEquals(expectedInt,test.getSex());
	}

	@Test
	public void testGetSex3() {
		expectedInt = 2147483647;
		test.setSex(expectedInt);

		assertEquals(expectedInt,test.getSex());
	}

	@Test
	public void testGetSex4() {
		try {
			expectedInt = Integer.parseInt("-2147483649");
			test.setSex(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetSex5() {
		try {
			expectedInt = Integer.parseInt("2147483648");
			test.setSex(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetSex1() {
		expectedInt = 0;
		test.setSex(expectedInt);
		actualInt = test.getSex();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetSex2() {
		expectedInt = -2147483648;
		test.setSex(expectedInt);
		actualInt = test.getSex();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetSex3() {
		expectedInt = 2147483647;
		test.setSex(expectedInt);
		actualInt = test.getSex();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetSex4() {
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setSex(postalMin);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	@Test
	public void testSetSex5() {
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setSex(postalMax);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	/*     Email    */
	@Test
	public void testGetEmail1() {
		expected = null;
		test.setEmail(expected);

		assertEquals(expected,test.getEmail());
	}

	@Test
	public void testGetEmail2() {
		expected = "";
		test.setEmail(expected);

		assertEquals(expected,test.getEmail());
	}

	@Test
	public void testGetEmail3() {
		expected = " ";
		test.setEmail(expected);

		assertEquals(expected,test.getEmail());
	}

	@Test
	public void testGetEmail4() {
		expected = "　";
		test.setEmail(expected);

		assertEquals(expected,test.getEmail());
	}

	@Test
	public void testGetEmail5() {
		expected = "abc123";
		test.setEmail(expected);

		assertEquals(expected,test.getEmail());
	}

	@Test
	public void testGetEmail6() {
		expected = "あいう１２３";
		test.setEmail(expected);

		assertEquals(expected,test.getEmail());
	}

	@Test
	public void testGetEmail7() {
		expected = "abc123あいう１２３";
		test.setEmail(expected);

		assertEquals(expected,test.getEmail());
	}

	@Test
	public void testGetEmail8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setEmail(expected);

		assertEquals(expected,test.getEmail());
	}


	@Test
	public void testSetEmail1() {
		expected = null;
		test.setEmail(expected);
		actual = test.getEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail2() {
		expected = "";
		test.setEmail(expected);
		actual = test.getEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail3() {
		expected = " ";
		test.setEmail(expected);
		actual = test.getEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail4() {
		expected = "　";
		test.setEmail(expected);
		actual = test.getEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail5() {
		expected = "abc123";
		test.setEmail(expected);
		actual = test.getEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail6() {
		expected = "あいう１２３";
		test.setEmail(expected);
		actual = test.getEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail7() {
		expected = "abc123あいう１２３";
		test.setEmail(expected);
		actual = test.getEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetEmail8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setEmail(expected);
		actual = test.getEmail();

		assertEquals(expected,actual);
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

	/*     Logined    */
	@Test
	public void testGetLogined1() {
		expectedInt = 0;
		test.setLogined(expectedInt);

		assertEquals(expectedInt,test.getLogined());
	}

	@Test
	public void testGetLogined2() {
		expectedInt = -2147483648;
		test.setLogined(expectedInt);

		assertEquals(expectedInt,test.getLogined());
	}

	@Test
	public void testGetLogined3() {
		expectedInt = 2147483647;
		test.setLogined(expectedInt);

		assertEquals(expectedInt,test.getLogined());
	}

	@Test
	public void testGetLogined4() {
		try {
			expectedInt = Integer.parseInt("-2147483649");
			test.setLogined(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testGetLogined5() {
		try {
			expectedInt = Integer.parseInt("2147483648");
			test.setLogined(expectedInt);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetLogined1() {
		expectedInt = 0;
		test.setLogined(expectedInt);
		actualInt = test.getLogined();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetLogined2() {
		expectedInt = -2147483648;
		test.setLogined(expectedInt);
		actualInt = test.getLogined();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetLogined3() {
		expectedInt = 2147483647;
		test.setLogined(expectedInt);
		actualInt = test.getLogined();

		assertEquals(expectedInt,actualInt);
	}

	@Test
	public void testSetLogined4() {
		try {
			int postalMin = Integer.parseInt("-2147483649");
			test.setLogined(postalMin);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	@Test
	public void testSetLogined5() {
		try {
			int postalMax = Integer.parseInt("2147483648");
			test.setLogined(postalMax);

		} catch (RuntimeException e) {
			assertThat1(e.getMessage(), "For input string: \"2147483648\"");
		}

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

	/*     LoginFlg    */
	@Test
	public void testGetLoginFlg1() {
		expectedboolean = true;
		test.setLoginFlg(expectedboolean);
		actualboolean = test.getLoginFlg();
		assertEquals(expectedboolean, actualboolean);
	}

	@Test
	public void testGetLoginFlg2() {
		expectedboolean = false;
		test.setLoginFlg(expectedboolean);
		actualboolean = test.getLoginFlg();
		assertEquals(expectedboolean, actualboolean);
	}

	@Test
	public void testsetLoginFlg1() {
		expectedboolean = true;
		test.setLoginFlg(expectedboolean);
		actualboolean = test.getLoginFlg();
		assertEquals(expectedboolean, actualboolean);
	}
	@Test
	public void testsetLoginFlg2() {
		expectedboolean = false;
		test.setLoginFlg(expectedboolean);
		actualboolean = test.getLoginFlg();
		assertEquals(expectedboolean, actualboolean);
	}

}

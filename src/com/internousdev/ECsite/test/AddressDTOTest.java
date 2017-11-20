package com.internousdev.ECsite.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdev.ECsite.dto.AddressDTO;

public class AddressDTOTest {

	AddressDTO test = new AddressDTO();
	String expected;
	String actual;

	@Test
	public void testGetId1() {
		expected = null;
		test.setId(expected);

		assertEquals(expected,test.getId());
	}

	@Test
	public void testGetId2() {
		expected = "";
		test.setId(expected);

		assertEquals(expected,test.getId());
	}

	@Test
	public void testGetId3() {
		expected = " ";
		test.setId(expected);

		assertEquals(expected,test.getId());
	}

	@Test
	public void testGetId4() {
		expected = "　";
		test.setId(expected);

		assertEquals(expected,test.getId());
	}

	@Test
	public void testGetId5() {
		expected = "abc123";
		test.setId(expected);

		assertEquals(expected,test.getId());
	}

	@Test
	public void testGetId6() {
		expected = "あいう１２３";
		test.setId(expected);

		assertEquals(expected,test.getId());
	}

	@Test
	public void testGetId7() {
		expected = "abc123あいう１２３";
		test.setId(expected);

		assertEquals(expected,test.getId());
	}

	@Test
	public void testGetId8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setId(expected);

		assertEquals(expected,test.getId());
	}


	@Test
	public void testSetId1() {
		expected = null;
		test.setId(expected);
		actual = test.getId();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetId2() {
		expected = "";
		test.setId(expected);
		actual = test.getId();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetId3() {
		expected = " ";
		test.setId(expected);
		actual = test.getId();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetId4() {
		expected = "　";
		test.setId(expected);
		actual = test.getId();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetId5() {
		expected = "abc123";
		test.setId(expected);
		actual = test.getId();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetId6() {
		expected = "あいう１２３";
		test.setId(expected);
		actual = test.getId();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetId7() {
		expected = "abc123あいう１２３";
		test.setId(expected);
		actual = test.getId();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetId8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setId(expected);
		actual = test.getId();

		assertEquals(expected,actual);
	}

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


	@Test
	public void testGetPutFirst_name1() {
		expected = null;
		test.setPutFirst_name(expected);

		assertEquals(expected,test.getPutFirst_name());
	}

	@Test
	public void testGetPutFirst_name2() {
		expected = "";
		test.setPutFirst_name(expected);

		assertEquals(expected,test.getPutFirst_name());
	}

	@Test
	public void testGetPutFirst_name3() {
		expected = " ";
		test.setPutFirst_name(expected);

		assertEquals(expected,test.getPutFirst_name());
	}

	@Test
	public void testGetPutFirst_name4() {
		expected = "　";
		test.setPutFirst_name(expected);

		assertEquals(expected,test.getPutFirst_name());
	}

	@Test
	public void testGetPutFirst_name5() {
		expected = "abc123";
		test.setPutFirst_name(expected);

		assertEquals(expected,test.getPutFirst_name());
	}

	@Test
	public void testGetPutFirst_name6() {
		expected = "あいう１２３";
		test.setPutFirst_name(expected);

		assertEquals(expected,test.getPutFirst_name());
	}

	@Test
	public void testGetPutFirst_name7() {
		expected = "abc123あいう１２３";
		test.setPutFirst_name(expected);

		assertEquals(expected,test.getPutFirst_name());
	}

	@Test
	public void testGetPutFirst_name8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPutFirst_name(expected);

		assertEquals(expected,test.getPutFirst_name());
	}


	@Test
	public void testSetPutFirst_name1() {
		expected = null;
		test.setPutFirst_name(expected);
		actual = test.getPutFirst_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFirst_name2() {
		expected = "";
		test.setPutFirst_name(expected);
		actual = test.getPutFirst_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFirst_name3() {
		expected = " ";
		test.setPutFirst_name(expected);
		actual = test.getPutFirst_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFirst_name4() {
		expected = "　";
		test.setPutFirst_name(expected);
		actual = test.getPutFirst_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFirst_name5() {
		expected = "abc123";
		test.setPutFirst_name(expected);
		actual = test.getPutFirst_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFirst_name6() {
		expected = "あいう１２３";
		test.setPutFirst_name(expected);
		actual = test.getPutFirst_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFirst_name7() {
		expected = "abc123あいう１２３";
		test.setPutFirst_name(expected);
		actual = test.getPutFirst_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFirst_name8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPutFirst_name(expected);
		actual = test.getPutFirst_name();

		assertEquals(expected,actual);
	}


	@Test
	public void testGetPutFamily_name1() {
		expected = null;
		test.setPutFamily_name(expected);

		assertEquals(expected,test.getPutFamily_name());
	}

	@Test
	public void testGetPutFamily_name2() {
		expected = "";
		test.setPutFamily_name(expected);

		assertEquals(expected,test.getPutFamily_name());
	}

	@Test
	public void testGetPutFamily_name3() {
		expected = " ";
		test.setPutFamily_name(expected);

		assertEquals(expected,test.getPutFamily_name());
	}

	@Test
	public void testGetPutFamily_name4() {
		expected = "　";
		test.setPutFamily_name(expected);

		assertEquals(expected,test.getPutFamily_name());
	}

	@Test
	public void testGetPutFamily_name5() {
		expected = "abc123";
		test.setPutFamily_name(expected);

		assertEquals(expected,test.getPutFamily_name());
	}

	@Test
	public void testGetPutFamily_name6() {
		expected = "あいう１２３";
		test.setPutFamily_name(expected);

		assertEquals(expected,test.getPutFamily_name());
	}

	@Test
	public void testGetPutFamily_name7() {
		expected = "abc123あいう１２３";
		test.setPutFamily_name(expected);

		assertEquals(expected,test.getPutFamily_name());
	}

	@Test
	public void testGetPutFamily_name8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPutFamily_name(expected);

		assertEquals(expected,test.getPutFamily_name());
	}


	@Test
	public void testSetPutFamily_name1() {
		expected = null;
		test.setPutFamily_name(expected);
		actual = test.getPutFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFamily_name2() {
		expected = "";
		test.setPutFamily_name(expected);
		actual = test.getPutFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFamily_name3() {
		expected = " ";
		test.setPutFamily_name(expected);
		actual = test.getPutFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFamily_name4() {
		expected = "　";
		test.setPutFamily_name(expected);
		actual = test.getPutFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFamily_name5() {
		expected = "abc123";
		test.setPutFamily_name(expected);
		actual = test.getPutFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFamily_name6() {
		expected = "あいう１２３";
		test.setPutFamily_name(expected);
		actual = test.getPutFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFamily_name7() {
		expected = "abc123あいう１２３";
		test.setPutFamily_name(expected);
		actual = test.getPutFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFamily_name8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPutFamily_name(expected);
		actual = test.getPutFamily_name();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPutFirst_name_kana1() {
		expected = null;
		test.setPutFirst_name_kana(expected);

		assertEquals(expected,test.getPutFirst_name_kana());
	}

	@Test
	public void testGetPutFirst_name_kana2() {
		expected = "";
		test.setPutFirst_name_kana(expected);

		assertEquals(expected,test.getPutFirst_name_kana());
	}

	@Test
	public void testGetPutFirst_name_kana3() {
		expected = " ";
		test.setPutFirst_name_kana(expected);

		assertEquals(expected,test.getPutFirst_name_kana());
	}

	@Test
	public void testGetPutFirst_name_kana4() {
		expected = "　";
		test.setPutFirst_name_kana(expected);

		assertEquals(expected,test.getPutFirst_name_kana());
	}

	@Test
	public void testGetPutFirst_name_kana5() {
		expected = "abc123";
		test.setPutFirst_name_kana(expected);

		assertEquals(expected,test.getPutFirst_name_kana());
	}

	@Test
	public void testGetPutFirst_name_kana6() {
		expected = "あいう１２３";
		test.setPutFirst_name_kana(expected);

		assertEquals(expected,test.getPutFirst_name_kana());
	}

	@Test
	public void testGetPutFirst_name_kana7() {
		expected = "abc123あいう１２３";
		test.setPutFirst_name_kana(expected);

		assertEquals(expected,test.getPutFirst_name_kana());
	}

	@Test
	public void testGetPutFirst_name_kana8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPutFirst_name_kana(expected);

		assertEquals(expected,test.getPutFirst_name_kana());
	}


	@Test
	public void testSetPutFirst_name_kana1() {
		expected = null;
		test.setPutFirst_name_kana(expected);
		actual = test.getPutFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFirst_name_kana2() {
		expected = "";
		test.setPutFirst_name_kana(expected);
		actual = test.getPutFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFirst_name_kana3() {
		expected = " ";
		test.setPutFirst_name_kana(expected);
		actual = test.getPutFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFirst_name_kana4() {
		expected = "　";
		test.setPutFirst_name_kana(expected);
		actual = test.getPutFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFirst_name_kana5() {
		expected = "abc123";
		test.setPutFirst_name_kana(expected);
		actual = test.getPutFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFirst_name_kana6() {
		expected = "あいう１２３";
		test.setPutFirst_name_kana(expected);
		actual = test.getPutFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFirst_name_kana7() {
		expected = "abc123あいう１２３";
		test.setPutFirst_name_kana(expected);
		actual = test.getPutFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFirst_name_kana8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPutFirst_name_kana(expected);
		actual = test.getPutFirst_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testGetPutFamily_name_kana1() {
		expected = null;
		test.setPutFamily_name_kana(expected);

		assertEquals(expected,test.getPutFamily_name_kana());
	}

	@Test
	public void testGetPutFamily_name_kana2() {
		expected = "";
		test.setPutFamily_name_kana(expected);

		assertEquals(expected,test.getPutFamily_name_kana());
	}

	@Test
	public void testGetPutFamily_name_kana3() {
		expected = " ";
		test.setPutFamily_name_kana(expected);

		assertEquals(expected,test.getPutFamily_name_kana());
	}

	@Test
	public void testGetPutFamily_name_kana4() {
		expected = "　";
		test.setPutFamily_name_kana(expected);

		assertEquals(expected,test.getPutFamily_name_kana());
	}

	@Test
	public void testGetPutFamily_name_kana5() {
		expected = "abc123";
		test.setPutFamily_name_kana(expected);

		assertEquals(expected,test.getPutFamily_name_kana());
	}

	@Test
	public void testGetPutFamily_name_kana6() {
		expected = "あいう１２３";
		test.setPutFamily_name_kana(expected);

		assertEquals(expected,test.getPutFamily_name_kana());
	}

	@Test
	public void testGetPutFamily_name_kana7() {
		expected = "abc123あいう１２３";
		test.setPutFamily_name_kana(expected);

		assertEquals(expected,test.getPutFamily_name_kana());
	}

	@Test
	public void testGetPutFamily_name_kana8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPutFamily_name_kana(expected);

		assertEquals(expected,test.getPutFamily_name_kana());
	}


	@Test
	public void testSetPutFamily_name_kana1() {
		expected = null;
		test.setPutFamily_name_kana(expected);
		actual = test.getPutFamily_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFamily_name_kana2() {
		expected = "";
		test.setPutFamily_name_kana(expected);
		actual = test.getPutFamily_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFamily_name_kana3() {
		expected = " ";
		test.setPutFamily_name_kana(expected);
		actual = test.getPutFamily_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFamily_name_kana4() {
		expected = "　";
		test.setPutFamily_name_kana(expected);
		actual = test.getPutFamily_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFamily_name_kana5() {
		expected = "abc123";
		test.setPutFamily_name_kana(expected);
		actual = test.getPutFamily_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFamily_name_kana6() {
		expected = "あいう１２３";
		test.setPutFamily_name_kana(expected);
		actual = test.getPutFamily_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFamily_name_kana7() {
		expected = "abc123あいう１２３";
		test.setPutFamily_name_kana(expected);
		actual = test.getPutFamily_name_kana();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutFamily_name_kana8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPutFamily_name_kana(expected);
		actual = test.getPutFamily_name_kana();

		assertEquals(expected,actual);
	}


	@Test
	public void testGetPutEmail1() {
		expected = null;
		test.setPutEmail(expected);

		assertEquals(expected,test.getPutEmail());
	}

	@Test
	public void testGetPutEmail2() {
		expected = "";
		test.setPutEmail(expected);

		assertEquals(expected,test.getPutEmail());
	}

	@Test
	public void testGetPutEmail3() {
		expected = " ";
		test.setPutEmail(expected);

		assertEquals(expected,test.getPutEmail());
	}

	@Test
	public void testGetPutEmail4() {
		expected = "　";
		test.setPutEmail(expected);

		assertEquals(expected,test.getPutEmail());
	}

	@Test
	public void testGetPutEmail5() {
		expected = "abc123";
		test.setPutEmail(expected);

		assertEquals(expected,test.getPutEmail());
	}

	@Test
	public void testGetPutEmail6() {
		expected = "あいう１２３";
		test.setPutEmail(expected);

		assertEquals(expected,test.getPutEmail());
	}

	@Test
	public void testGetPutEmail7() {
		expected = "abc123あいう１２３";
		test.setPutEmail(expected);

		assertEquals(expected,test.getPutEmail());
	}

	@Test
	public void testGetPutEmail8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPutEmail(expected);

		assertEquals(expected,test.getPutEmail());
	}


	@Test
	public void testSetPutEmail1() {
		expected = null;
		test.setPutEmail(expected);
		actual = test.getPutEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutEmail2() {
		expected = "";
		test.setPutEmail(expected);
		actual = test.getPutEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutEmail3() {
		expected = " ";
		test.setPutEmail(expected);
		actual = test.getPutEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutEmail4() {
		expected = "　";
		test.setPutEmail(expected);
		actual = test.getPutEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutEmail5() {
		expected = "abc123";
		test.setPutEmail(expected);
		actual = test.getPutEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutEmail6() {
		expected = "あいう１２３";
		test.setPutEmail(expected);
		actual = test.getPutEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutEmail7() {
		expected = "abc123あいう１２３";
		test.setPutEmail(expected);
		actual = test.getPutEmail();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutEmail8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPutEmail(expected);
		actual = test.getPutEmail();

		assertEquals(expected,actual);
	}


	@Test
	public void testGetPutTel_number1() {
		expected = null;
		test.setPutTel_number(expected);

		assertEquals(expected,test.getPutTel_number());
	}

	@Test
	public void testGetPutTel_number2() {
		expected = "";
		test.setPutTel_number(expected);

		assertEquals(expected,test.getPutTel_number());
	}

	@Test
	public void testGetPutTel_number3() {
		expected = " ";
		test.setPutTel_number(expected);

		assertEquals(expected,test.getPutTel_number());
	}

	@Test
	public void testGetPutTel_number4() {
		expected = "　";
		test.setPutTel_number(expected);

		assertEquals(expected,test.getPutTel_number());
	}

	@Test
	public void testGetPutTel_number5() {
		expected = "abc123";
		test.setPutTel_number(expected);

		assertEquals(expected,test.getPutTel_number());
	}

	@Test
	public void testGetPutTel_number6() {
		expected = "あいう１２３";
		test.setPutTel_number(expected);

		assertEquals(expected,test.getPutTel_number());
	}

	@Test
	public void testGetPutTel_number7() {
		expected = "abc123あいう１２３";
		test.setPutTel_number(expected);

		assertEquals(expected,test.getPutTel_number());
	}

	@Test
	public void testGetPutTel_number8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPutTel_number(expected);

		assertEquals(expected,test.getPutTel_number());
	}


	@Test
	public void testSetPutTel_number1() {
		expected = null;
		test.setPutTel_number(expected);
		actual = test.getPutTel_number();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutTel_number2() {
		expected = "";
		test.setPutTel_number(expected);
		actual = test.getPutTel_number();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutTel_number3() {
		expected = " ";
		test.setPutTel_number(expected);
		actual = test.getPutTel_number();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutTel_number4() {
		expected = "　";
		test.setPutTel_number(expected);
		actual = test.getPutTel_number();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutTel_number5() {
		expected = "abc123";
		test.setPutTel_number(expected);
		actual = test.getPutTel_number();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutTel_number6() {
		expected = "あいう１２３";
		test.setPutTel_number(expected);
		actual = test.getPutTel_number();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutTel_number7() {
		expected = "abc123あいう１２３";
		test.setPutTel_number(expected);
		actual = test.getPutTel_number();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutTel_number8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPutTel_number(expected);
		actual = test.getPutTel_number();

		assertEquals(expected,actual);
	}


	@Test
	public void testGetPutUser_address1() {
		expected = null;
		test.setPutUser_address(expected);

		assertEquals(expected,test.getPutUser_address());
	}

	@Test
	public void testGetPutUser_address2() {
		expected = "";
		test.setPutUser_address(expected);

		assertEquals(expected,test.getPutUser_address());
	}

	@Test
	public void testGetPutUser_address3() {
		expected = " ";
		test.setPutUser_address(expected);

		assertEquals(expected,test.getPutUser_address());
	}

	@Test
	public void testGetPutUser_address4() {
		expected = "　";
		test.setPutUser_address(expected);

		assertEquals(expected,test.getPutUser_address());
	}

	@Test
	public void testGetPutUser_address5() {
		expected = "abc123";
		test.setPutUser_address(expected);

		assertEquals(expected,test.getPutUser_address());
	}

	@Test
	public void testGetPutUser_address6() {
		expected = "あいう１２３";
		test.setPutUser_address(expected);

		assertEquals(expected,test.getPutUser_address());
	}

	@Test
	public void testGetPutUser_address7() {
		expected = "abc123あいう１２３";
		test.setPutUser_address(expected);

		assertEquals(expected,test.getPutUser_address());
	}

	@Test
	public void testGetPutUser_address8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPutUser_address(expected);

		assertEquals(expected,test.getPutUser_address());
	}


	@Test
	public void testSetPutUser_address1() {
		expected = null;
		test.setPutUser_address(expected);
		actual = test.getPutUser_address();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutUser_address2() {
		expected = "";
		test.setPutUser_address(expected);
		actual = test.getPutUser_address();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutUser_address3() {
		expected = " ";
		test.setPutUser_address(expected);
		actual = test.getPutUser_address();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutUser_address4() {
		expected = "　";
		test.setPutUser_address(expected);
		actual = test.getPutUser_address();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutUser_address5() {
		expected = "abc123";
		test.setPutUser_address(expected);
		actual = test.getPutUser_address();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutUser_address6() {
		expected = "あいう１２３";
		test.setPutUser_address(expected);
		actual = test.getPutUser_address();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutUser_address7() {
		expected = "abc123あいう１２３";
		test.setPutUser_address(expected);
		actual = test.getPutUser_address();

		assertEquals(expected,actual);
	}

	@Test
	public void testSetPutUser_address8() {
		expected = "ａｂｃ１２３あいう漢字";
		test.setPutUser_address(expected);
		actual = test.getPutUser_address();

		assertEquals(expected,actual);
	}


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


}

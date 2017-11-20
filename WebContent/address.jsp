<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta charset="utf-8">
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<title>address</title>


	<link rel="stylesheet" type="text/css" href="./css/main.css">

	<style type="text/css">

 		table {
 			border:1px; solid black;
			width:700px;
			height;500px;
			text-align:left;
			margin:0 auto;
			font-size:15px;
		}

		.td1 {
			width:200px;
			height;500px;
			text-align:left;
			margin:0 auto;
			font-size:15px;
		}
		.td2 {
			width:500px;
			height;500px;
			text-align:left;
			margin:0 auto;
			font-size:15px;
		}
		.center{
			text-align:center;
		}

		.check{
			position:relative;
			right:450px;
			top:100px;
			text-align:center;
		}

/* 		.buybutton {
			font-size:15px;
			padding: 10px 12px;
			margin-bottom:15px;
			width:140px;
			cursor: pointer;
		} */

	</style>

</head>
<body>
	<div class="header">
		<h1>❐　宛先情報選択画面</h1>
	</div>

	<form action="BuyItemConfilmAction">
		<s:iterator value="addressDTOList">

		<div class="main">

			<div class="check">
				<input type="radio" name="address" value='<s:property value="id" />' checked="checked">
			</div>

		<table>

			<tr>
				<td class=td1>姓</td>
				<td class=td2>
					<s:property value="putFamily_name" />
				</td>
			</tr>
			<tr>
				<td class=td1>名</td>
				<td class=td2>
					<s:property value="putFirst_name" />
				</td>
			</tr>
			<tr>
				<td class=td1>姓ふりがな</td>
				<td class=td2>
					<s:property value="putFamily_name_kana" />

				</td>
			</tr>
			<tr>
				<td class=td1>名ふりがな</td>
				<td class=td2>
					<s:property value="putFirst_name_kana" />

			</td>
			</tr>
			<tr>
				<td class=td1>電話番号</td>
				<td class=td2>
					<s:property value="putTel_number" />

				</td>
			</tr>
			<tr>
				<td class=td1>住所</td>
				<td class=td2>
					<s:property value="putUser_address" />
				</td>
			</tr>
			<tr>
				<td class=td1>メールアドレス</td>
				<td class=td2>
					<s:property value="putEmail" />
				</td>
			</tr>
		</table>
		</div>
		</s:iterator>
		<br>
			<div class="center"><button class="submit_bt" type="submit">決済する</button></div>
	</form>
<div class="center">
	<p>宛先情報登録は<a href='<s:url action="AddressRegistrationAction" />'>こちら</a></p>
</div>
<div class="footer">
<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
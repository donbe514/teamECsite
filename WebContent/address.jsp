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

					 .t1 {
			border:solid 2px #0000ff;
			width:700px;
 			height:250px;
			text-align:left;
			margin:10px auto 0px;
			font-size:15px;
			border-collapse: collapse;
			table-layout: auto;

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

.tableborder_right{

background-color:#b0e0e6;
border-right: double 5px #0000ff;
width:200px;

}

.tableborder{
padding-bottom:5px ;
    padding-top:5px ;
border-bottom: solid 1px #0000ff;

}
.table_left{
padding-left: 5px;
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

	<!-- 登録した宛先を表示 -->

		<s:iterator value="addressDTOList">

		<div class="main">

	<!-- 宛先選択チェックボックス -->

			<div class="check">
				<input type="radio" name="id" value='<s:property value="id" />' checked="checked">
			</div>
		<table class="t1">
 			<tr class="tableborder">
				<td class="tableborder_right">
					<label>名前</label>
				</td>
				<td class="table_left">
					<label>姓</label><br>
					<s:property value="putFamily_name" />
				</td>

				<td>
					<label>名</label><br>
					<s:property value="putFirst_name" />
				</td>
			</tr>
			<tr class="tableborder">
				<td class="tableborder_right">
					<label>ふりがな</label>
				</td>
				<td class="table_left">
					<label>せい</label><br>
					<s:property value="putFamily_name_kana" />
				</td>

				<td>
					<label>めい</label><br>
					<s:property value="putFirst_name_kana" />
				</td>
			</tr>
	<tr class="tableborder">
		<td class="tableborder_right">
			<label>住所</label>
		</td>
		<td colspan="2" class="table_left">
			<s:property value="putUser_address" />
		</td>
	</tr>
	<tr class="tableborder">
		<td class="tableborder_right">
			<label>電話番号</label>
		</td>
		<td colspan="2" class="table_left">
			<s:property value="putTel_number" />
		</td>
	</tr>

	<tr class="tableborder">
		<td class="tableborder_right">
			<label>メールアドレス</label>
		</td>
		<td colspan="2" class="table_left">
			<s:property value="putEmail" />
		</td>
	</tr>

  </table>
		</div>
		</s:iterator>
		<br>
		<s:if test="AddCheck">
			<div class="center"><button class="submit_bt" type="submit">決済する</button></div>
		</s:if>
		<s:else>
			<div class="center">宛先登録をお願いします。</div>
		</s:else>
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
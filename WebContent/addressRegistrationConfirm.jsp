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
	<title>addressRegistrationConfirm</title>
	<link rel="stylesheet" type="text/css" href="./css/main.css">
	<style type="text/css">

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

/* 			.button {
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
	<h1>❐　宛先登録確認画面</h1>
</div>
<div class="main">
			<!-- <table> -->
				<s:form action="AddressRegistrationComplateAction">

<!--
		</table> -->
		<table class="t1">
 			<tr class="tableborder">
				<td class="tableborder_right">
					<label>名前</label>
				</td>
				<td class="table_left">
					<label>姓</label><br>

					<input type="hidden" name="putFamily_name" maxlength="16" minlength="1" value="<s:property value="putFamily_name" />" class="c" />
					<s:property value="putFamily_name" />
				</td>

				<td>
					<label>名</label><br>

					<input type="hidden" name="putFirst_name" maxlength="16" minlength="1" value="<s:property value="putFirst_name" />" class="c" />
					<s:property value="putFirst_name" />
				</td>
			</tr>
			<tr class="tableborder">
				<td class="tableborder_right">
					<label>ふりがな</label>
				</td>
				<td class="table_left">
					<label>せい</label><br>

					<input type="hidden" name="putFamily_name_kana" maxlength="16" minlength="1" value="<s:property value="putFamily_name_kana" />" class="c" />
					<s:property value="putFamily_name_kana" />
				</td>

				<td>
					<label>めい</label><br>

					<input type="hidden" name="putFirst_name_kana" maxlength="16" minlength="1" value="<s:property value="putFirst_name_kana" />" class="c" />
					<s:property value="putFirst_name_kana" />
				</td>
			</tr>
	<tr class="tableborder">
		<td class="tableborder_right">
			<label>住所</label>
		</td>
		<td colspan="2" class="table_left">
			<input type ="hidden" name="putUser_address" value="<s:property value="putUser_address" />" size="60" maxlength="32" class="c"/>
			<s:property value="putUser_address" />
		</td>
	</tr>
	<tr class="tableborder">
		<td class="tableborder_right">
			<label>電話番号</label>
		</td>
		<td colspan="2" class="table_left">
			<input type ="hidden" name="putTel_number" value="<s:property value="putTel_number" />" size="60" maxlength="32" class="c"/>
			<s:property value="putTel_number" />
		</td>
	</tr>

	<tr class="tableborder">
		<td class="tableborder_right">
			<label>メールアドレス</label>
		</td>
		<td colspan="2" class="table_left">
			<input type ="hidden" name="putEmail" value="<s:property value="putEmail" />" size="60" maxlength="32" class="c"/>
			<s:property value="putEmail" />
		</td>
	</tr>

  </table>

				<br><br>
				<div class="center"><button class="submit_bt" type="submit">登録</button></div>
				</s:form>
	</div>
	<div class="footer">
<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
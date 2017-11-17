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

 			table {
 			border:1px; solid black;
			width:700px;
			height;500px;
			text-align:left;
			margin:0 auto;
			font-size:15px;
		}

			.center{
			text-align:center;
			}



			.button {
			font-size:15px;
			padding: 10px 12px;
			margin-bottom:15px;
			width:140px;
			cursor: pointer;
		}


	</style>
</head>
<body>
<div class="header">
	<h1>❐　宛先登録確認画面</h1>
</div>
<div class="main">
			<table>
				<s:form action="AddressRegistrationComplateAction">



					<tr>
						<td>
							<label>姓:</label>
						</td>
						<td>
							<s:property value="putFamily_name" />
						</td>
					</tr>
					<tr>
						<td>
							<label>名:</label>
						</td>
						<td>
							<s:property value="putFirst_name" />
						</td>
					</tr>
					<tr>
						<td>
							<label>姓ふりがな:</label>
						</td>
						<td>
							<s:property value="putFamily_name_kana" />
						</td>
					</tr>
					<tr>
						<td>
							<label>名ふりがな:</label>
						</td>
						<td>
							<s:property value="putFirst_name_kana" />
						</td>
					</tr>

					<tr>
						<td>
							<label>住所:</label>
						</td>
						<td>
							<s:property value="putUser_address" />
						</td>
					</tr>
					<tr>
						<td>
							<label>電話番号:</label>
						</td>
						<td>
							<s:property value="putTel_number" />
						</td>
					</tr>
					<tr>
						<td>
							<label>メールアドレス:</label>
						</td>
						<td>
							<s:property value="putEmail" />
						</td>
					</tr>
					<tr>
						<td>
							<div class="center"><button class="button" type="submit">登録</button></div>
						</td>
					</tr>
				</s:form>
			</table>
	</div>
</body>
</html>
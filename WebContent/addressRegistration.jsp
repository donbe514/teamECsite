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
	<title>addressRegistration</title>
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

		}
		.EM {
			color:red;
			font-size:13px;
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

			.buybutton {
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
	<h1>❐　宛先登録画面</h1>
</div>
<div class="main">
			<table>
			<s:form action="AddressRegistrationConfirmAction">
				<tr>
					<td class="td1">
						<div class="EM">
							<s:if test="errorMessage != null">
								<s:iterator value="errorMessage" status="count">
									<s:property value="errorMessage[#count.index]" /><br>
								</s:iterator>
							</s:if>
						</div>

					</td>
				</tr>
				<tr>
					<td class="td1">
						<label>名前</label>
					</td>
					<td class="td1">
						<label>姓</label>
					</td>
					<td class="td1">
						<input type="text" name="putFamily_name" maxlength="16" minlength="1" value="" />
					</td>

					<td class="td1">
						<label>名</label>
					</td>
					<td class="td1">
						<input type="text" name="putFirst_name" maxlength="16" minlength="1" value="" />
					</td>
				</tr>
				<tr>
					<td class="td1">
						<label>ふりがな</label>
					</td>
					<td class="td1">
						<label>姓</label>
					</td>
					<td class="td1">
						<input type="text" name="putFamily_name_kana" maxlength="16" minlength="1" value="" />
					</td>

					<td class="td1">
						<label>名</label>
					</td>
					<td class="td1">
						<input type="text" name="putFirst_name_kana" maxlength="16" minlength="1" value="" />
					</td>
				</tr>

				<tr>
					<td colspan="2">
						<label>住所</label>
					</td>
					<td class="td1">
						<input type="text" name="putUser_address" maxlength="50" minlength="15" value="" />
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label>電話番号</label>
					</td>
					<td class="td1">
						<input type="text" name="putTel_number" maxlength="13" minlength="11" value="" />
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label>メールアドレス</label>
					</td>
					<td class="td1">
						<input type="text" name="putEmail" maxlength="32" minlength="18" value="" />
					</td>
				</tr>

				<s:submit value="確認"/>
			</s:form>
			</table>
</div>
</body>
</html>
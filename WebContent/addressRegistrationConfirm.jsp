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
	<link rel="stylesheet" type="text/css" href="/ecsite/CSS/style.css">
	<style type="text/css">




	</style>
</head>
<body>

<h3>登録する宛先情報は以下でよろしいですか。</h3>
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
<%-- 					<tr>
						<td>
							<label>性別:</label>
						</td>
						<td>
							<s:property value="sex" escape="false" />
						</td>
					</tr> --%>
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
							<s:submit value="登録" />
						</td>
					</tr>
				</s:form>
			</table>
</body>
</html>
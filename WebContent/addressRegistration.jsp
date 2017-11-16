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
	<link rel="stylesheet" type="text/css" href="">
	<style type="text/css">




	</style>
</head>
<body>

			<table>
			<s:form action="AddressRegistrationConfirmAction">
				<tr>
					<td>
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
					<td>
						<label>姓:</label>
					</td>
					<td>
						<input type="text" name="putFamily_name" maxlength="16" minlength="1" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>名:</label>
					</td>
					<td>
						<input type="text" name="putFirst_name" maxlength="16" minlength="1" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>姓ふりがな:</label>
					</td>
					<td>
						<input type="text" name="putFamily_name_kana" maxlength="16" minlength="1" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>名ふりがな:</label>
					</td>
					<td>
						<input type="text" name="putFirst_name_kana" maxlength="16" minlength="1" value="" />
					</td>
				</tr>
				<!-- <td>
					<div class="check">
						<input type="radio" name="sex" value="0" checked="checked">男性
						<input type="radio" name="sex" value="1">女性
					</div>

				</td> -->
				<tr>
					<td>
						<label>住所:</label>
					</td>
					<td>
						<input type="text" name="putUser_address" maxlength="50" minlength="15" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>電話番号:</label>
					</td>
					<td>
						<input type="text" name="putTel_number" maxlength="13" minlength="11" value="" />
					</td>
				</tr>
				<tr>
					<td>
						<label>メールアドレス:</label>
					</td>
					<td>
						<input type="text" name="putEmail" maxlength="32" minlength="18" value="" />
					</td>
				</tr>
				<s:submit value="確認"/>
			</s:form>
			</table>

</body>
</html>
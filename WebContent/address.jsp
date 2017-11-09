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

	<style type="text/css">

	</style>

</head>
<body>

			<table>

			<s:form action="">
			<s:iterator value="addressDTOList">

				<tr>
					<td>姓</td>

					<td>
						<s:property value="putFamily_name" />

					</td>
				</tr>
				<tr>
					<td>名</td>
					<td>
						<s:property value="putFirst_name" />

					</td>
				</tr>
				<tr>
					<td>姓ふりがな</td>
					<td>
						<s:property value="putFamily_name_kana" />

					</td>
					<td>名ふりがな</td>
					<td>
						<s:property value="putFirst_name_kana" />

					</td>
				</tr>


				<tr>
					<td>電話番号</td>
					<td>
						<s:property value="putTel_number" />

					</td>
				</tr>
				<tr>
					<td>メールアドレス</td>
					<td>
						<s:property value="putEmail" />

					</td>
				</tr>
				<tr>
					<td>宛先情報選択</td>
					<td>
						<div class="check">
						<input type="radio" name="address" value='<s:property value="id" />' checked="checked"><s:property value="putUser_address" />

						</div>

					</td>
				</tr>
				</s:iterator>
				<s:submit value="確認" />

			</s:form>

		</table>


</body>
</html>
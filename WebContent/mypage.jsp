<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css">
	<meta http-equiv="Content-Script-Type" content="text/javascript">
	<meta http-equiv="imagetoolbar" content="no">
	<meta name="description" content="">
	<meta name="keywords" content="">
	<title>★MyPage☆</title>
	<link rel="stylesheet" href="./css/mypage.css">
	<link rel="stylesheet" type="text/css" href="./css/main.css">
<style>
</style>
</head>
<body>
<div class="header">
<h1>❒　MyPage</h1>
</div>

<div class="main">
<h2>あなたの登録情報です</h2>

	<table border=1>
	<tr>
		<th>
			名前
		</th>
		<td>
			<s:property value="family_name"/>
			<s:property value="first_name"/>
		</td>
	</tr>
	<tr>
		<th>
			ふりがな
		</th>
		<td>
			<s:property value="family_name_kana"/>
			<s:property value="first_name_kana"/>
		</td>
	</tr>
	<tr>
		<th>
			性別
		</th>
		<td>
			<s:if test="sex==0">
				男
			</s:if>
			<s:else>
				女
			</s:else>
		</td>
	</tr>
	<tr>
		<th>
			e-mail
		</th>
		<td>
			<s:property value="email"/>
		</td>
	</tr>
	</table>
	<br><br>
	購入履歴は<a href='<s:url action="HistoryAction"/>'>こちら</a>
	<br><br>
</div>



<div class="footer">
<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
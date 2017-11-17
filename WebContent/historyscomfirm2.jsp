<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>購入履歴の削除確認画面</title>
</head>
<body>
	選択した購入履歴を削除します。
	<form action="historydelete2">
	<input type="submit" value="実行する" >

	<input type="button" value="購入履歴に戻る"  onclick="history.back()">
	</form>



</body>
</html>
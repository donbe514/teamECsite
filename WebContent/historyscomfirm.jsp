<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css">
body{
	text-align:center;}
</style>
<title>購入履歴の削除確認画面</title>
</head>
<body>
	購入履歴を全削除します。
	<form action="historydelete">
	<input type="submit" value="実行する" >

	<input type="button" value="購入履歴に戻る"  onclick="history.back()">
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="./css/main.css">
<style type="text/css">
body{
	text-align:center;
	}
</style>
<title>購入履歴の削除確認画面</title>
</head>
<body>
	<div class="header">
	<h1>購入履歴を全削除します。</h1>
	<br><br><br>
	<form action="historydelete">
	<input type="submit" value="実行する" class="submit_bt">
	<input type="button" value="戻る"  onclick="history.back()" class="submit_bt">
	</form>
	</div>
	<br><br><br>
	<div class="footer">
	<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
	<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</body>
</html>
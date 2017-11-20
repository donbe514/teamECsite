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
	<title>登録完了画面</title>
	<link rel="stylesheet" type="text/css" href="./css/main.css">
	<style type="text/css">

			.center{
			text-align:center;
			}

	</style>
</head>
<body>
<div class="header">
	<h1>❐　宛先登録完了画面</h1>
</div>
<div class="main">
<div class="center">
		<h1>宛先登録が完了しました。</h1>
		<br><br>
		<p>宛先情報選択は<a href='<s:url action="AddressAction" />'>こちら</a></p></div>
		</div>

<div class="footer">
<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>

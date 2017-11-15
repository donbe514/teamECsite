<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>決済完了</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
<link rel="stylesheet" href="./css/animate.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
<style type="text/css">
.thank{
	font-size:50px;
	color:#008B8B;
	font-weight:bold;
}
p{
	text-align:center
}
</style>
</head>
<body>
<div class="header">
	<h1>❐　決済完了</h1>
</div>
<div class="main">
	<p class="animated rubberBand"><span class="thank">ご購入ありがとうございます！</span></p><br><br>
	<p>決済が完了致しました。</p><br><br>
	<p>Homeへ戻る場合は<a href='<s:url action="BuyItemComplateAction" />' target="_parent">こちら</a></p>
</div>
<div class="footer">
	<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
	<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
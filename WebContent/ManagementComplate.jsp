<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在庫更新完了</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
</head>
<body>
<div class="header">
<h1>❐　在庫更新完了画面</h1>
</div>
<div class="main">
<div class="left">
<p style="font-size:50px; color:#008B8B; text-align:center;"><b>在庫の更新が完了しました。</b></p><br><br>
<p style="text-align:center;">管理画面に戻る場合は<a href='<s:url action="ManagementAction" />'>こちら</a></p>
</div>
<div class="right">
</div>
</div>
<br><br>
<div class="footer">
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
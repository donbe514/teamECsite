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
<title>UserInfoComplate</title>
	<link rel="stylesheet" type="text/css" href="./css/main.css">
	<style type="text/css">

			.center{
			text-align:center;
			}

	</style>
</head>
<body>
<div class="header">
	<h1>❐　ユーザー登録完了画面</h1>
</div>
<div class="main">
<br><br>
<p style="text-align:center; font-size:30px;  font-weight:bold;">ユーザー登録が完了しました。</p>
<br><br>
      <div class="center">
      <p>ログインは<a href='<s:url action="LoginPageAction" />'>こちら</a></p>

      </div>
 </div>
<div class="footer">
	<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
	<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
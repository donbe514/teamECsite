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

			.main{
			text-align:center;
			width:100%;
			height:600px;
			}

			.a{
			margin:100px auto 30px;


			}

			.r{
			color:black;
			font-size:54px;
			}

			.r:hover{
			color:red;
			font-size:68px;
			font-family: Impact;

			}


			.o{
			color:black;
			font-size:54px;
			}

			.o:hover{
			color:orange;
			font-size:68px;
			font-family: Impact;

			}

			.y{
			color:black;
			font-size:54px;
			}

			.y:hover{
			color:yellow;
			font-size:68px;
			font-family: Impact;
			}

			.yg{
			color:black;
			font-size:54px;
			}

			.yg:hover{
			color:yellowgreen;
			font-size:68px;
			font-family: Impact;
			}

			.g{
			color:black;
			font-size:54px;
			}

			.g:hover{
			color:green;
			font-size:68px;
			font-family: Impact;
			}

			.b{
			color:black;
			font-size:54px;
			}

			.b:hover{
			color:blue;
			font-size:68px;
			font-family: Impact;
			}

			.p{
			color:black;
			font-size:54px;
			}

			.p:hover{
			color:purple;
			font-size:68px;
			font-family: Impact;
			}

			.end{
			font-size:48px;
			}

	</style>
</head>
<body>
<div class="header">
	<h1>❐　ユーザーの登録を完了致しました。</h1>
</div>
<div class="main">
<div class="a">
<label class="r">K</label>
<label class="o">O</label>
<label class="y">M</label>
<label class="yg">A</label>
<label class="g">Z</label>
<label class="b">O</label>
<label class="p">N</label>
<label class="end">でのお買い物を<br>お楽しみ下さい!！</label>
</div>




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
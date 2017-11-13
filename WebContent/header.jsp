<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<title>ヘッダー</title>
<link rel="stylesheet" type="text/css" href="./css/header.css">
</head>
<body>

<div class= header>
	<!-- ロゴ画像 -->
	<div class="leftbox">
	<div class = "box_in">
	<!-- ロゴ画像（仮） -->
	<img src = "./images/中日.jpg" class = "logo">
	</div>
	</div>

	<!-- メニュー、検索ブロック -->
	<div class="rightbox">

		<!-- 検索バー -->
		<ul class = "introduce">
		<li>
		<form action = "IntroduceAction" target = "body">
		<select name = "category_id" class="select">
		<option value="0">全カテゴリー</option>
		<option value="1">本</option>
		<option value="2">家電・パソコン</option>
		<option value="3">おもちゃ・ゲーム</option>
		</select>
		<input type = "text" name = "SearchText"  placeholder ="キーワードを入力" class= "search">
		<input type="submit" value="検索" class="submit_btn">
		</form>
		</li>
		</ul>
		<!-- メニューバー -->
		<div class = "manuber">
		<ul class="manu">
		<li>
        	<!-- ログイン画面へ遷移（未ログイン状態で表示） -->
        	<s:if test="#session.user_id == null">
          		<a href='<s:url action = "LoginPageAction" />' target="body" >ログイン</a>
        	</s:if>
        </li>
              <li>
      		<!-- マイページ画面へ遷移（ログイン状態で表示）  -->
        	<s:if test="#session.user_id != null">
          		<a href='<s:url action = "MyPageAction" />' target="body" >マイページ</a>
        	</s:if>
        </li>
        <li>
      		<!-- ログイン画面へ遷移（ログイン状態で表示） -->
        	<s:if test="#session.user_id != null">
          		<a href='<s:url action ="LogoutAction" />' target="body">ログアウト</a>
        	</s:if>
        </li>
        <li>
      		<!-- 商品一覧画面へ遷移 -->
        	<a href='<s:url action = "IntroduceAction"><s:param name="SearchText" value=""/></s:url>' target="body" >商品一覧</a>
        </li>
        <li>
      		<!-- カート画面へ遷移 -->
        	<a href='<s:url action ="CartAction" />' target="body" >カート</a>
        </li>
        <li>
       		<!-- 管理画面に遷移 -->
        	<a href='<s:url action = "ManagementAction" />' target="body" >管理画面</a>
        </li>
		</ul>
		</div>
	</div>
</div>
</body>
</html>
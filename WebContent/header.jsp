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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="./css/header.css">
<link rel="stylesheet" type="text/css" href="./css/main.css">
</head>
<body>

<div class= headermanu>
	<!-- ロゴ画像ボックス -->
	<div class="leftbox">
		<!-- ロゴ画像（仮） -->
		<img src = "./images/中日.jpg" class = "logo">
	</div>

	<!-- メニュー、検索ブロック -->
	<div class="rightbox">

		<!-- 検索バー -->
		<ul class = "introduce">
		<!-- 検索 -->
			<li>
				<form action = "IntroduceAction" target = "body">
					<select name = "category_id" class="select">
						<option value="0">全カテゴリー</option>
						<option value="1">本</option>
						<option value="2">家電・パソコン</option>
						<option value="3">おもちゃ・ゲーム</option>
					</select>
					<input type="hidden" name="LimitFlag" value= "1">
					<input type = "text" name = "SearchText"  placeholder ="キーワードを入力" class= "search">
					<input type="submit" value="検索" class="submit_btn">
				</form>
			</li>
		<!-- 広告 -->
			<li>
				<a href='<s:url action = "IntroduceAction"><s:param name="category_id" value="2"/></s:url>' target="body" class="poster" ><span class="year">2017年<span class="electric">最新家電</span>📺</span>はこちらをチェック✔</a>
			</li>
		</ul>

		<!-- メニューバー -->
	<div class = "manuber">
		<!-- ユーザーへの挨拶文 -->
		<ul>
			<li>
				<s:if test="#session.user_id == null">
					<a class="greeting"><marquee width="150%" behavior="alternate" scrollamount="1" >ようこそ！ ゲストさん。</marquee></a>
				</s:if>
			</li>
			<li>
				<s:if test="#session.user_id != null">
					<a class="greeting"><marquee width="120%" behavior="alternate" scrollamount="1" >ようこそ！ <s:property value = "#session.first_name" /><s:property value = "#session.family_name" />さん。</marquee></a>
			</s:if>
			</li>
		</ul>
		<!-- メニュー -->
		<ul class="manu_ul">
			<li>
        		<!-- ログイン画面へ遷移（未ログイン状態で表示） -->
        		<s:if test="#session.user_id == null">
        			<a href='<s:url action = "LoginPageAction" />' target="body" >ログイン🔑</a>
       			</s:if>
        	</li>
        	<li>
      			<!-- マイページ画面へ遷移（ログイン状態で表示）  -->
        		<s:if test="#session.user_id != null">
          			<a href='<s:url action = "MyPageAction" />' target="body" >マイページ👮</a>
        		</s:if>
        	</li>
        	<li>
      			<!-- ログイン画面へ遷移（ログイン状態で表示） -->
        		<s:if test="#session.user_id != null">
          			<a href='<s:url action ="LogoutAction" />' target="body">ログアウト🔒</a>
        		</s:if>
      		</li>
        	<li>
      			<!-- 商品一覧画面へ遷移(エラー出ます……) -->
       			<a href='<s:url action = "IntroduceAction"><s:param name="SearchText" value=""/><s:param name="LimitFlag" value="1"/></s:url>' target="body" >商品一覧📚</a>
        	</li>
        	<li>
      			<!-- カート画面へ遷移 -->
        		<a href='<s:url action ="CartAction" />' target="body" >カート🛒</a>
        	</li>
        	<li>
       			<!-- 管理画面に遷移 -->
<%--        <s:if test="#session.user_id == taro "> --%>
        		<a href='<s:url action = "ManagementAction" />' target="body">管理画面🚫</a>
<%--         </s:if> --%>
        	</li>
		</ul>
	</div>

	</div>

</div>
<script type="text/javascript" src="./js/script.js"></script>
</body>
</html>
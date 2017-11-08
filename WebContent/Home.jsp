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
<title>ホーム画面</title>
<link rel="stylesheet" type="text/css" href="./css/MainStyle.css">
</head>
<body>

<div id = header>
	<ul>
		<li>
			<!-- ログイン画面へ遷移（未ログイン状態で表示） -->
			<s:if test = "#session.user_id == null">
				<a href = '<s:url action = "LoginAction" />' >ログイン</a>
			</s:if>
		</li>
		<li>
			<!-- マイページ画面へ遷移（ログイン状態で表示）  -->
			<s:if test = "#session.user_id != null">
				<a href ='<s:url action = "MyPageAction" />' >マイページ</a>
			</s:if>
		</li>
		<li>
			<!-- ログイン画面へ遷移（ログイン状態で表示） -->
			<s:if test = "#session.user_id != null">
				<a href = '<s:url action ="LogoutAcction" />' >ログアウト</a>
			</s:if>
		</li>
		<li>
			<!-- 商品一覧画面へ遷移 -->
			<a href = '<s:url action = "" />' >商品一覧</a>
		</li>
		<li>
			<!-- 商品検索画面へ遷移 -->
			<a href ='<s:url action = "" />' >商品検索</a>
		</li>
		<li>
			<!-- カート画面へ遷移 -->
			<a href = '<s:url action ="CartAction" />'>カート</a>
		</li>
		<li>
			<!-- 管理画面に遷移 -->
			<a href = '<s:url action = "" />'>管理画面</a>
		</li>
	</ul>
</div>

<div>
ホーム画面<br>
↓テストボタン。アクション名を変更して自身の作成ページへの遷移アクションに切り替えて使用してください。
<form action=" BuyItemConfilmAction">
<input type="submit" value="test">
</form>
</div>

</body>
</html>
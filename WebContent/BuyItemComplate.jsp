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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<style type="text/css">

.header{/* ヘッダー全体 */
	text-align:center;
}

.thank{/* ご購入ありがとうございます！ */
	font-size:50px;
	color:#008B8B;
	font-weight:bold;
}

p{/* 文全体 */
	text-align:center
}

</style>
</head>
<body>
<div class="main">
	<p class="animated rubberBand"><span class="thank">ご購入ありがとうございます！</span></p>
	<br><br>
	<s:if test ="BuyFalseList != null">
	<s:iterator value="BuyFalseList">
	<p style="text:center; color:red;"><s:property value="product_name" />は在庫が不足しており、購入できませんでした。</p>
	</s:iterator>
	<p style="text:center; color:red;">申し訳ございません。</p>
	</s:if>
	<br><br>
</div>

<div class="footer">
	<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
	<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
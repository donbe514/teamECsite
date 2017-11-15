<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link type="text/css" rel="stylesheet" href="http://code.jquery.com/ui/1.10.3/themes/cupertino/jquery-ui.min.css"/>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="http://code.jquery.com/ui/1.10.3/jquery-ui.min.js"></script>
<script src="./jquery.bxslider/jquery.bxslider.min.js"></script>
<link href="./jquery.bxslider/jquery.bxslider.css" rel="stylesheet">
<title>入荷確認画面</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
<style type="text/css">
b{/* sタグ適用部分 */
	font-size:30px;
	color:#008B8B;
}
.back{/* 前画面に戻る場合はこちら */
	text-align:center;
}
</style>
</head>
<body>
<div class="header">
	<h1>❐　在庫確認画面</h1>
</div>
<div class="main">
	<div class="left">
		<p>追加前在庫数：<b><s:property value ="#session.beforeStock" /></b></p>
		<p>追加後在庫数：<b><s:property value="#session.stock" /></b></p>
		<br><br>
		<s:form action = "ManagementConfilmAction">
			<tr>
				<td>商品名:</td>
				<td><b><s:property value = "product_name" /></b></td>
			</tr>
			<tr>
				<td>在庫追加数:　　</td>
				<td><b><s:property value = "stock" /></b></td>
			</tr>
			<tr>
				<td><s:submit value = "確定" /></td>
			</tr>
		</s:form>
		<p class="back">前画面に戻る場合は<a href='<s:url action="ManagementAction" />'>こちら</a></p>
	</div>
	<div class="right">
	</div>
</div>
<div class="footer">
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
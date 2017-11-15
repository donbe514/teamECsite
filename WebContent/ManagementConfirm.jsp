<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>入荷確認画面</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
</head>
<body>
<div class="header">
<h1>❐　在庫確認画面</h1>
</div>
<div class="main">
<div class="left">
<p>追加前在庫数：<b style="font-size:30px;"><s:property value ="#session.beforeStock" /></b></p>
<p>追加後在庫数：<b style="font-size:30px;"><s:property value="#session.stock" /></b></p>
<br><br>
		<s:form action = "ManagementConfilmAction">
			<tr>
				<td>商品名:</td>
				<td style="font-size:30px;"><b><s:property value = "product_name" /></b></td>
			</tr>
			<tr>
				<td>在庫追加数:　　</td>
				<td style="font-size:30px;"><b><s:property value = "stock" /></b></td>
			</tr>
			<tr>
				<td><s:submit value = "確定" /></td>
			</tr>
			</s:form>
			<p style="text-align:center;">前画面に戻る場合は<a href='<s:url action="ManagementAction" />'>こちら</a></p>
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
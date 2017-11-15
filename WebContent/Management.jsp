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
<title>管理画面</title>

<link rel="stylesheet" type="text/css" href="./css/main.css">

</head>
<body>

<div class="header">
	<h1>❐　在庫追加画面</h1>
</div>
<div class="main">
	<div class="left">
	<h2>各商品の在庫数を追加できます。</h2>
	<p>現在の在庫数を確認したい場合は、<b>入荷数を空欄のまま</b>在庫入荷ボタンを押してください。</p><br>
	<b style="color:red">※入荷数は、半角数字（正の数）のみ入力可能です。</b><br><br><br><br>
	<s:form action= "ManagementReferenceAction">
	<table>
		<tr>
			<td>商品名:
				<select name= "product_name" style="height:25px;">
				<s:iterator value = "ManagementList">
				<option><s:property value = "product_name" /></option>
				</s:iterator>
				</select>
			</td>
		</tr>
		<tr></tr>
		<tr>
			<td>
				<s:textfield name = "stock" label = "入荷数" placeholder = "入荷数入力"  id = ""  value ="" pattern="[1-9][0-9]*" style="height:20px;"/>
			</td>
		</tr>
		<tr>
			<td>
				<s:submit value = "在庫入荷" id = "submit_botton" />
			</td>
		</tr>
	</table>
	</s:form>
	<%-- </s:if> --%>
	<p style="text-align:center;">ホームに戻る場合は<a href='<s:url action="HomeAction" />' target="_parent" >こちら</a></p>
</div>

<div class="right">
</div>

</div>
<br><br>
<div class="footer">
<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
<script type="text/javascript" src="./js/MainScript.js"></script>
</body>
</html>
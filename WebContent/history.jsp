<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<link rel="stylesheet" type="text/css" href="./css/history.css">
<link rel="stylesheet" type="text/css" href="./css/main.css">
<title>商品購入履歴画面</title>
</head>

<body>

<div class="text">
<div class="header">
<h2>❒　お客様の購入履歴</h2>
</div>
<!-- 購入履歴がない場合 -->
<s:if test="HistryFlag">
	<h3>購入履歴はありません。</h3><!-- フォント、場所が気になる -->
</s:if>

<!-- 購入履歴がある場合 -->

<s:else>
	<div class="main">

	<h3>ご購入情報は以下になります。</h3>
	<form action="partDelete">
	<table border="1" align="center">
	<tr>
		<th>商品名</th>
		<th>ふりがな</th>
		<th>商品画像</th>
		<th>値段</th>
		<th>発売会社名</th>
		<th>商品発売日</th>
		<th>購入数</th>
		<th>金額</th>
		<th>購入履歴削除</th>
	</tr>

	<s:iterator value="historyList">
		<tr>
			<td><s:property value="product_name" /></td>
			<td><s:property value="product_name_kana" /></td>
			<td><img src='<s:property value="image_file_path" />' height=200px; width=250px;></td>
			<td><s:property value="price" /></td>
			<td><s:property value="release_company" /></td>
			<td><s:property value="release_date" /></td>
			<td><s:property value="stock" /></td>
			<td><s:property value="total_price" /></td>
			<td><input type="checkbox" name="del_id" value='<s:property value="id"/>'></td>

		</tr>
	</s:iterator>

	</table>
	<br><br>
	選択した購入履歴を　<input type="submit" value="削除" class="submit_bt">
	</form>
	<br><br>
	<s:form action="Historyscomfirm">
		購入履歴を　<input type="submit" value="全削除" class="submit_bt">
	</s:form>
	</div>
</s:else>
<br><br>
</div>
<div class="footer">
	<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
	<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
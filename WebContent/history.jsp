<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<title>商品購入履歴画面</title>
</head>

<body>


<h2>お客様の購入履歴</h2>

<!-- 購入履歴がない場合 -->
<s:if test="historyList == null">
	<h3>購入履歴はありません。</h3>
</s:if>

<!-- 購入履歴がある場合 -->
<s:else>
	<h3>ご購入情報は以下になります。</h3>
	<table border="1">

	<tr>
		<th>商品名</th>
		<th>ふりがな</th>
		<th>商品画像</th>
		<th>値段</th>
		<th>発売会社名</th>
		<th>商品発売日</th>
	</tr>

	<s:iterator value="historyList">
		<tr>
			<td><s:property value="product_name" /></td>
			<td><s:property value="product_name_kana" /></td>
			<td><s:property value="image_file_path" /></td>
			<td><s:property value="price" /></td>
			<td><s:property value="release_company" /></td>
			<td><s:property value="release_date" /></td>
		</tr>
	</s:iterator>

	</table>

	<s:form action="Historyscomfirm">
		購入履歴を<a href='<s:url action="HistoryComfirm"/>'>削除</a>
	</s:form>
</s:else>

</body>
</html>
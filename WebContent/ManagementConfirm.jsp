<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>入荷確認画面</title>
</head>
<body>

<p>追加前在庫数<s:property value ="#session.beforeStock" /></p>
<p>追加後在庫数<s:property value="#session.stock" /></p>

		<s:form action = "ManagementConfilmAction">
			<tr>
				<td>商品名</td>
				<td><s:property value = "product_name" /></td>
			<tr>
				<td>在庫追加数</td>
				<td><span>個数</span><s:property value = "stock" /></td>
			</tr>
			<tr>
				<td><s:submit value = "確定" /></td>
			</tr>
			<tr>
				<td><span>前画面に戻る場合は</span><a href='<s:url action="ManagementAction" />'>こちら</a></td>
			</tr>
			</s:form>




</body>
</html>
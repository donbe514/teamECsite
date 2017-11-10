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
</head>
<body>

<s:form action= "ManagementReferenceAction">
	<table style = "">
		<tr>
			<td><span>商品名</span>
				<select name= "product_name" >
				<s:iterator value = "ManagementList">
				<option><s:property value = "product_name" /></option>
				</s:iterator>
				</select>
			</td>
		</tr>
		<tr></tr>
		<tr>
			<td>
				<s:textfield name = "stock" label = "入荷数" placeholder = "入荷数入力"  id = ""  value ="" pattern="[1-9][0-9]*" />
			</td>
			<td>※半角数字（正の数）のみ入力可能</td>
		</tr>
		<tr>

		<td></td>

			<td>
				<s:submit value = "在庫入荷" id = "submit_botton" />
			</td>
		</tr>
		<tr>
			<td><span>ホームに戻る場合は</span><a href='<s:url action="HomeAction" />'>こちら</a></td>
		</tr>
	</table>
</s:form>

<script type="text/javascript" src="./js/MainScript.js"></script>
</body>
</html>
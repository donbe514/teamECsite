<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css">
	<meta http-equiv="Content-Script-Type" content="text/javascript">
	<meta http-equiv="imagetoolbar" content="no">
	<meta name="description" content="">
	<meta name="keywords" content="">
<title>★MyPage☆</title>
</head>
<body>
<header>
</header>

<div id="main">
	<s:property value="first_name"/>
	<s:property value="family_name"/>
	<s:property value="first_name_kana"/>
	<s:property value="family_name_kana"/>
	<s:if test="sex==0">
		男
	</s:if>
	<s:else>
		女
	</s:else>
	<s:property value="email"/>
	購入履歴は<a href='<s:url action="HistoryAction"/>'>こちら</a>

</div>



<footer>
</footer>
</body>
</html>
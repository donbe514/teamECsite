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
<link rel="stylesheet" type="text/css" href="./CSS/MainStyle.css">
</head>
<body>
	<div id="header">
	 	<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
			<p>決済完了</p>
		</div>
		<div>
			<p>決済が完了致しました。</p>
			<div>
				<p>Homeへ戻る場合は<a href='<s:url action="BuyItemComplateAction" />'>こちら</a></p>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>
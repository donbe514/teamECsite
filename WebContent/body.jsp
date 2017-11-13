<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<link rel="stylesheet" href="./css/body.css">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
	<title>Insert title here</title>
	<script>
		$(document).ready(function(){
        	$('.slider').bxSlider({
            	auto:true,
            	speed:1000,
            	pause:4500,
            	autoDirection:'next',
            	slideWidth:500,
            	minSlides:4,
            	maxSlides:4,
            	moveSlides:1,
            	infiniteLoop:true,
            	autoHover:true
        	});
    	});
	</script>
</head>
<body>
<br>
<div class="box1">
	<ul class="slider" >
		<s:iterator value="itemList">
			<li><a href=""><img src="./images/Anubarak.jpg" width=100% height=300px>こんにちは</a></li>
		</s:iterator>
		<li><a href=""><img src="./images/buyresult.jpg" width=100% height=300px></a></li>
		<li><a href=""><img src="./images/coldking.jpg" width=100% height=300px></a></li>
		<li><a href=""><img src="./images/Create.jpg" width=100% height=300px></a></li>
		<li><a href=""><img src="./images/create1.jpg" width=100% height=300px></a></li>
		<li><a href=""><img src="./images/Feugen.jpg" width=100% height=300px></a></li>
		<li><a href=""><img src="./images/fireboo.jpg" width=100% height=300px></a></li>
		<li><a href=""><img src="./images/footer.jpg" width=100% height=300px></a></li>
	</ul>
</div>
</body>
</html>
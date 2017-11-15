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
	<link rel="stylesheet" href="./css/animate.min.css">
<!-- 	<link rel="stylesheet" type="text/css" href="css/tuesday.min.css" /> -->
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
<div class="logo">
	<h1 class="animated rubberBand">Komazon!</h1>
</div>
<h3>Komazonはどんな物も取り扱う通販サイトです。Komazonに不可能はありません。貴方に幸せをお届けします。</h3>
<div class="box1">
	<ul class="slider" >
		<s:iterator value="#session.itemList" status="pi">
			<li><a href="<s:url action='GoDetailAction'><s:param name='product_id' value='#session.itemList[#pi.index].product_id'/></s:url>">
				<img src="<s:property value='image_file_path'/>" width=100% height=200px />
				<s:property value="product_name"/></a>
			</li>
		</s:iterator>
	</ul>
</div>
<div class="footer">
<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
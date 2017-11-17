<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta charset="utf-8">
<title>saipass_complate画面</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
    <style type="text/css">
        .t{
		        width:100%;
		        height:15%;
				color:#248;
				text-align:center;
				font-size:25px;

           }

        .main{
        	width: 100%;
		   height: 500px;
		   text-align: center;
        }
          .m span{
				display: inline-block;
	  			margin: 0 -.1.3em;
	  			animation: loading .6s infinite;
	  			font-size:90px;
	        	text-align:center;
	        	margin-top:150px;
	        	margin-bottom:160px;
	        	font-weight: bold;
	        	color:#192f60;
	        	font-family:impact;
        }

      .m span:nth-child(2) {
	  animation-delay: .1s;
	}
	.m span:nth-child(3) {
	  animation-delay: .2s;
	}.m span:nth-child(4) {
	  animation-delay: .3s;
	}.m span:nth-child(5) {
	  animation-delay: .4s;
	}.m span:nth-child(6) {
	  animation-delay: .5s;
	}.m span:nth-child(7) {
	  animation-delay: .6s;
	}.m span:nth-child(8) {
	  animation-delay: .7s;
	}.m span:nth-child(9) {
	  animation-delay: .8s;
	}.m span:nth-child(10) {
	  animation-delay: .9s;
	}.m span:nth-child(11) {
	  animation-delay: .10s;
	}.m span:nth-child(12) {
	  animation-delay: .11s;
	}

	@keyframes loading {
	  0%, 100% {
	    transform: translateY(0);
	  }
	  50% {
	    transform: translateY(15px);
	  }
	}

      .under{
	        font-size:20px;
	        text-align:center;
		}
	 </style>
</head>
<body>
 <div class="header">
  <div class="t">
  <h5>パスワードの再発行を完了致しました。<br>引き続き、お買い物をお楽しみください！</h5>
      </div>
     </div>

	<div class="main">
	   <div class="m">
	    <span>I</span>
	    <span>t'</span>
	    <span>s</span>
	    <span>C</span>
	    <span>o</span>
	    <span>m</span>
	    <span>p</span>
	    <span>l</span>
	    <span>a</span>
	    <span>t</span>
	    <span>e</span>
	    <span>!</span>
	   </div>

      <div class="under">
        <a href='<s:url action="LoginPageAction"/>'>ログインへ</a>
      </div>



</div>

  <div class="footer">
<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
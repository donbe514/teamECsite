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
		        height:80px;
				color:#248;
				text-align:center;
				font-size:40px;
           }

        .main{
        	width: 100%;
		   height: 500px;
		   text-align: center;
        }

        .m{
        	font-size:30px;
        	text-align:center;
        	margin-top:150px;
        	margin-bottom:160px;
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
      <h3>It's Complete!</h3>
      </div>
     </div>
	<div class="main">
	   <div class="m">
	      <h5>パスワードの再発行を完了致しました。<br>引き続き、お買い物をお楽しみください！</h5>
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
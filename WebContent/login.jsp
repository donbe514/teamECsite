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
   <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
   <meta http-equiv="imagetoolbar" content="no" />
   <meta name="description" content="" />
   <meta name="keywords" content="" />
   <meta charset="utf-8">
<title>❒　Login画面</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
<style type="text/css">
body {
/* 		   margin:0; */
/* 		   padding:0; */
/* 		   line-height:1.6; */
/* 		   letter-spacing:1px; */
/* 		   font-family:Verdana, Helvetica, sans-serif; */
/* 		   font-size:18px; */
/* 		   color:#333; */
/* 		   background:#fff; */
		}
.er{
        color:#e2041b;
}
.t1{
		width:400px;
		height:200px;
		margin:30px auto;
		border:2px solid #248;
		padding:0px 20px;
			}



.center{
        width:100%;
        height:50px;
		font-size: 40px;
		color:#248;
		text-align:center;
		font-weight:bold;
		margin-top:-30px;
      }

.main {
		   width: 100%;
		   height: 600px;
		   text-align: center;

		   }
.f{
   		    font-size:18px;
   		    font-weight:bold;
   		    color:#248;
}

.c{
			width:250px;
			height:25px;
			background-color:#f5f5f5;
			color:#248;
			font-size:18px;
}

.c:hover{
 			background-color:#fce3e9;
		}
.s{
   width:25px;
   height:25px;
   }

.t2 {
    float:left;
	width:50%;
	height:40px;
	text-align:right;

}
.btn{
    float:left;
    width:20%;
	height:40px;
	margin:0px auto 0px;

	}

.bt {
    width: 105px;
	height: 103px;
	background:white;
	border: 1px dotted #248;
	border-radius: 88px;
	moz-border-radius: 88px;
	webkit-border-radius: 88px;
	color:#999999;
	padding: 37px 30px 35px;
    text-align: center;
      font-weight:bold;
	font-size: 120%;
	transition: background-color 0.5s ease-in;
	webkit-transition: background-color 0.5s ease-in;
	font-style: italic;


}

.bt:hover{
			background: #248;
	        color: #FFF;
	        border: 3px solid #66ccff;
	        font-style: italic;
}



</style>
<script type="text/javascript">
<!--
function open_new() {
	var form = document.forms.mainForm;
	var user = form.LoginFlag.value;
	if(user.length>0){parent.top.location.href="Home.jsp";}
}
// -->
</script>

</head>
<body onLoad="open_new()">
<form name="mainForm">
<input type="hidden" name="LoginFlag" value="<s:property value="#session.user_id"/>">
</form>

<script type="text/javascript" src="./js/MainScript.js"></script>
<div class="header">
	 <div class="center"><p>Login</p></div>
	</div>

<div class="main">
  <form action="LoginAction">
    <div class="er">
    <s:if test="errorMessage!=''">
     <s:property value="errorMessage" escape="false" />
     </s:if>
     </div>
     <table class="t1">

   <tr>
   <td ><label class="f">ログインID</label></td><td><input type= text name="user_id" value="<s:property value="save_user"/>" class="c"  /></td>
      </tr>

   <tr>
      <td><label class="f">パスワード</label></td><td><input type=password name="password" value=""  class="c" /></td>
      </tr>

      <tr>
      <td><label class="f">保存</label></td>
      <td><input type=checkbox  value="保存" class="s"  /></td>
      </tr>
      </table>

       <table class="t2">
   <tr>
   <td><p>新規登録は<a href='<s:url action="UserAction" />'>こちら</a></p></td>
   </tr>
      <tr>
   <td><p>パスワードの再発行は<a href='<s:url action="SaipassAction" />'>こちら</a></p></td>
      </tr>
      </table>

<div class="btn">
 <input type="submit" value="login" class="bt"  />
</div>
   </form>






   </div>
<div class="footer">
<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>

</body>

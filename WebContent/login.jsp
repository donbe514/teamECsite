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
<title>Login画面</title>
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

table {
		position:absolute;
       top:225px;
       left:550px;
			}


/* .header{ */
/* 		width: 100%; */
/* 		height: 80px; */
/* 		background-color:#030303; */
/* 		} */

.center{
        width:95%;
        height:80px;
		font-size: 50px;
		color:#248;
		text-align:center;
		font-weight:bold;
      }

.main {
		   width: 100%;
		   height: 500px;
		   text-align: center;

		   }



.bt {
      font-size:18px;
      font-weight:bold;
      background-color:#248;
      color:white;
       padding: 8px 20px;
       border-style: none;
       moz-border-radius: 25px;
     webkit-border-radius: 25px;
       border-radius: 25px;
       position:absolute;
       top:250px;
       left:550px;


}


.link {
			position:absolute;
       top:450px;
       left:550px;
}

</style>
</head>
<body>
<div class="header">
	 <div class="center"><p>ログイン</p></div>
	</div>

<div class="main">
  <form action="LoginAction">
    <s:if test="errorMessage!=''">
     <s:property value="errorMessage" escape="false" />
     </s:if>

     <table>

   <tr>
   <td >ユーザーID</td><td><input type= text name="user_id" value=""  /></td>
      </tr>

      <tr>
      <td>パスワード</td><td><input type=password name="password" value="" /></td>
      </tr>

      <tr>
      <td><label>保存</label></td>
      <td><input type=checkbox  value="保存" class="hozon" /></td>
      </tr>
      </table>

      <input type="submit" value="ログイン" class="bt"  />


   </form>

   <br/>
	<div class="link">
    <p>新規登録の方は<a href='<s:url action="UserAction" />'>こちら</a></p>
    <p>パスワードを忘れた方は<a href='<s:url action="SaipassAction" />'>こちら</a></p>
   </div>



   </div>
<div class="footer">
<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>

</body>

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
    <title>UserInnfoConfirm</title>
    	<link rel="stylesheet" type="text/css" href="./css/main.css">
    	<style type="text/css">

 			table {
 			border:1px; solid black;
			width:700px;
			height;500px;
			text-align:left;
			margin:0 auto;
			font-size:15px;
		}

			.center{
			text-align:center;
			}



/* 			.button {
			font-size:15px;
			padding: 10px 12px;
			margin-bottom:15px;
			width:140px;
			cursor: pointer;
		} */


	</style>
</head>
<body>
<div class="header" style="text-align:center;">
	<h1>❐　ユーザー登録確認画面</h1>
</div>
<div class="main" style="text-align:center;">

         <form action="UserInfoComplateAction">
         <table style="text-align:center;">
             <tr id="land">
                 <td>ユーザーID</td>
                 <td><s:property value="user_id" escape="false" /></td>
             </tr>
             <tr id="land">
                 <td>パスワード</td>
                 <td><s:property value="password" escape="false" /></td>
             </tr>


             <tr id="land">
                 <td>姓</td>
                 <td><s:property value="family_name" escape="false" /></td>
             </tr>
            <tr id="land">
               <td>名前</td>
               <td><s:property value="first_name" escape="false" /></td>
            </tr>


             <tr id="land">
                 <td>せい</td>
                 <td><s:property value="family_name_kana" escape="false" /></td>
             </tr>
            <tr id="land">
               <td>めい</td>
               <td><s:property value="first_name_kana" escape="false" /></td>
             </tr>


            <tr id="land">
              <td>性別</td>
               <td><s:if test="sex==0">男</s:if>
                    <s:else>女</s:else></td>
            </tr>

            <tr id="land">
               <td>メールアドレス</td>
               <td><s:property value="email" escape="false" /></td>
            </tr>

            </table>
            <div class="center">
<br>
<button class="submit_bt" type="submit">登録</button></div>
         </form>
<br><br>
     <div id="footer">
     <div class="center">前画面に戻る場合は<a href='<s:url action="LoginAction" />'>こちら</a></div>
     </div>
  </div>
  <div class="footer">
	<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
	<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
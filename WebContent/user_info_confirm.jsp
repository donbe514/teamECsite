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
        .main{
		   height:700px;
		   width:100%;
		  }
 			table {
 			border:solid 1px #000000;
			width:700px;
 			height:300px;
			text-align:left;
			margin:150px auto 0px;
			font-size:15px;
			border-collapse: collapse;
			table-layout: auto;
		}

		.f{

			color:black;
		}

		td{
		border:solid 1px #0000ff;

		}

        th{
		border:solid 1px #0000ff;
        }

		.sita{
		float:left;
		width:55%;
		height:5%;
		margin-top:25px;
        }

		.st1{
			text-align:right;
			font-size:20px;
			}

		.h{
			float:left;
			height:5%;
			width:5%;
		}

			.center{
		float:left;
		width:40%;
		height:5%;
			text-align:center;
			}

		.button {
			font-size:15px;
			padding: 10px 12px;
			width:140px;
			cursor: pointer;
			background-color:white;
			border:silver solid 2px;
			margin:10px auto 0px;
			color:silver;
			transition: background-color 0.5s ease-in;
	        webkit-transition: background-color 0.5s ease-in;
		}

		.button:hover{
		           background-color:#0000ff;
					color:silver;
			        border: 3px solid silver;

		}


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
                 <th><font class="f">ユーザーID</font></th>
                 <td><s:property value="user_id" escape="false" /></td>
             </tr>
             <tr id="land">
                 <th><font class="f">パスワード</font></th>
                 <td><s:property value="password" escape="false" /></td>
             </tr>


             <tr id="land">
                 <th><font class="f">姓</font></th>
                 <td><s:property value="family_name" escape="false" /></td>
             </tr>
            <tr id="land">
               <th><font class="f">名前</font></th>
               <td><s:property value="first_name" escape="false" /></td>
            </tr>


             <tr id="land">
                 <th><font class="f">せい</font></th>
                 <td><s:property value="family_name_kana" escape="false" /></td>
             </tr>
            <tr id="land">
               <th><font class="f">めい</font></th>
               <td><s:property value="first_name_kana" escape="false" /></td>
             </tr>


            <tr id="land">
              <th><font class="f">性別</font></th>
               <td><s:if test="sex==0">男</s:if>
                    <s:else>女</s:else></td>
            </tr>

            <tr id="land">
               <th><font class="f">メールアドレス</font></th>
               <td><s:property value="email" escape="false" /></td>
            </tr>

            </table>

     <div class="sita">
     <div class="st1"><a href='<s:url action="LoginPageAction" />'>キャンセル</a></div>
     </div>

     <div class="h">
     </div>

            <div class="center">
<br>
<button class="submit_bt" type="submit">登録</button></div>
         </form>
<br><br>
  </div>
  <div class="footer">
	<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
	<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
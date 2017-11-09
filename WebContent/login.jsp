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
</head>
<body>
<div id="header">
</div>

<div id="main">
  <div id="certer">
   <h2>ログイン</h2>
   <s:form action="LoginAction">
   <tr>
   <td><label>ユーザーID</label></td>
     <td><s:textfield name="user_id" maxlength="8"/></td>
      </tr>

      <tr>
      <td><label>パスワード</label></td>
      <td><s:password name="password"/></td>
      <s:checkbox name="hozon" key="保存" />
     <s:submit value="ログイン"/>


   </s:form>
   </div>
   <br/>

   <div id="Link">
    <p>新規登録の方は<a href='<s:url action="UserAction" />'>こちら</a></p>
    <p>パスワードを忘れた方は<a href='<s:url action="SaipassAction" />'>こちら</a></p>
   </div>

   </div>
</body>
</html>
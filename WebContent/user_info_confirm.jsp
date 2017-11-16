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
</head>
<body>
<div id="header">
</div>
<div id="main">
  <h3>登録内容のご確認をお願いします。</h3>
     <table>
         <s:form action="UserInfoComplateAction">
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

            <h4>上記の内容で問題なければOKボタンを押してください。</h4>

            <tr>
             <td> <s:submit value="OK" /></td>
            </tr>
         </s:form>
      </table>
     <div id="footer">
     <span>前画面に戻る場合は</span><a href='<s:url action="LoginAction" />'>こちら</a>
     </div>
  </div>
</body>
</html>
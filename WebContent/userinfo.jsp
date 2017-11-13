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
<title>UserInfo</title>
</head>
<body>
<div id="header">
  </div>
<div id="main">
  <s:if test="errorMassage !=''">
     <s:property value="errorMassage" escape="false" />
  </s:if>
      <form action="UserInfoConfirmAction">
  <table>
       <tr>
         <td>
           <label>セイ</label>
         </td>
         <td>
            <input type="text" name="family_name_kana" value=""  maxlength="16"/>
         </td>
      </tr>

      <tr>
           <td>
                 <label>姓</label>
           </td>
            <td>
                 <input type="text" name="family_name" value="" maxlength="16" />
            </td>
       </tr>

       <tr>
         <td>
            <label>メイ</label>
         </td>
         <td>
              <input type="text" name="first_name_kana" value=""  maxlength="16"/>
         </td>
       </tr>
       <tr>
           <td>
                 <label>名</label>
           </td>
            <td>
                  <input type="text" name="first_name" value=""  maxlength="16"/>
           </td>
       </tr>

       <tr>
           <td>
               <label>性別</label>
           </td>
           <td>
               <td>
                <input type="radio" name="sex" value=0 checked="checked">男
                <input type="radio" name="sex" value=1>女
           </td>

       </tr>

      <tr>
          <td>
              <label>メールアドレス</label>
         </td>
          <td>
              <input type ="text" name="email" value="" size="40" maxlength="32"/>
          <td>
       </tr>
    </table>
   <input type="submit" value="ユーザーの登録">
	</form>
   <%-- <div>
      <span>ログイン画面へ</span><a href='<s:url action="LoginAction" />'>戻る</a>
   </div> --%>
</div>
</body>
</html>
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
	<link rel="stylesheet" type="text/css" href="./css/main.css">


	<style type="text/css">

  			table {
			width:700px;
			text-align:left;
			margin:0 auto;
			font-size:15px;

		}
		.td1 {

		}
		.EM {
			color:red;
			font-size:13px;
		}


			.center{
			text-align:center;
			}



			.button {
			font-size:15px;
			padding: 10px 12px;
			margin-bottom:15px;
			width:140px;
			cursor: pointer;
		}

	</style>


</head>
<body>
<div class="header">
	<h1>❐　ユーザー登録画面</h1>
</div>
<div class="main">

      <form action="UserInfoConfirmAction">
  <table>
				<tr>
					<td>
						<div class="EM">
							<s:if test="errorMessage != null">
								<s:iterator value="errorMessage" status="count">
									<s:property value="errorMessage[#count.index]" /><br>
								</s:iterator>
							</s:if>
						</div>

					</td>
				</tr>
<!-- </table>
<table> -->
	<tr>
         <td>
           <label>ユーザーID</label>
         </td>
         <td>

            <input type="text" name="user_id" value=""  maxlength="16"/>
         </td>
      </tr>
<!--  </table>
 <table> -->
       <tr>
         <td>
           <label>パスワード</label>
         </td>
         <td>

            <input type="text" name="password" value=""  maxlength="16"/>
         </td>
      </tr>
<!-- </table>
<table> -->
 			<tr>
				<td>
					<label>名前</label>
				</td>
				<td>
					<label>姓</label><br>

					<input type="text" name="family_name" maxlength="16" minlength="1" value="" />
				</td>

				<td>
					<label>名</label><br>

					<input type="text" name="first_name" maxlength="16" minlength="1" value="" />
				</td>
			</tr>
<!-- </table>
<table> -->
			<tr>
				<td>
					<label>ふりがな</label>
				</td>
				<td>
					<label>姓</label><br>

					<input type="text" name="family_name_kana" maxlength="16" minlength="1" value="" />
				</td>

				<td>
					<label>名</label><br>

					<input type="text" name="first_name_kana" maxlength="16" minlength="1" value="" />
				</td>
			</tr>
<!-- </table>
<table> -->
       <tr>
           <td>
               <label>性別</label>

           <td>
                &nbsp;<input type="radio" name="sex" value=0 checked="checked">男
                <input type="radio" name="sex" value=1>女
           </td>

       </tr>
<!-- </table>
<table> -->
      <tr>
          <td>
              <label>メールアドレス</label>
         </td>
          <td>

              <input type ="text" name="email" value="" maxlength="32"/>
          <td>
       </tr>
  </table>
    <br>
   <div class="center"><button class="button" type="submit">確認</button></div>
	</form>
   <%-- <div>
      <span>ログイン画面へ</span><a href='<s:url action="LoginAction" />'>戻る</a>
   </div> --%>
</div>
</body>
</html>
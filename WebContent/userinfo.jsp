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
.main{
		   height:700px;
		   width:100%;
		  }


		  .t0{
			  width:100%;

		      text-align:center;

		  }

  			.t1 {
			border:solid 1px #0000ff;
			width:700px;
 			height:300px;
			text-align:left;
			margin:10px auto 0px;
			font-size:15px;
			border-collapse: collapse;
			table-layout: auto;

		}

		.EM {
			color:red;
			font-size:13px;

		}


			.center{
			text-align:center;
			}

			label{
			font-size:16px;
			font-weight:bold;
			}

			.c{
			background-color:white;
			color:black;
			font-size:14px;
}

.c:hover{
 			background-color:#fce3e9;
		}



			.button {
			font-size:15px;
			padding: 10px 12px;
			margin-bottom:15px;
			width:140px;
			cursor: pointer;
			background-color:white;
			border:silver solid 2px;
			margin:10px auto 0px;
			color:#0000ff;
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
	<h1>❐　ユーザー登録画面</h1>
</div>
<div class="main">

      <form action="UserInfoConfirmAction">

  <table class="t0">
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
				</table>

<table class="t1">
	<tr>
         <td>
           <label>ユーザーID</label>
         </td>
         <td>
         <input type="text" name="user_id" value=""  maxlength="16" class="c"/>
         </td>
         <td>
         </td>
      </tr>

       <tr>
         <td>
           <label>パスワード</label>
         </td>
         <td>
            <input type="text" name="password" value=""  maxlength="16" class="c" />
         </td>
         <td>
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

					<input type="text" name="family_name" maxlength="16" minlength="1" value="" class="c" />
				</td>

				<td>
					<label>名</label><br>

					<input type="text" name="first_name" maxlength="16" minlength="1" value="" class="c" />
				</td>
			</tr>
<!-- </table>
<table> -->
			<tr>
				<td>
					<label>ふりがな</label>
				</td>
				<td>
					<label>せい</label><br>

					<input type="text" name="family_name_kana" maxlength="16" minlength="1" value="" class="c" />
				</td>

				<td>
					<label>めい</label><br>

					<input type="text" name="first_name_kana" maxlength="16" minlength="1" value="" class="c" />
				</td>
			</tr>
<!-- </table>
<table> -->
       <tr>
           <td>
               <label>性別</label>
           <td>
                &nbsp;<input type="radio" name="sex" value=0 checked="checked"><label>男</label>
                <input type="radio" name="sex" value=1><label>女</label>
           </td>
           <td></td>

       </tr>
<!-- </table>
<table> -->
      <tr>
          <td>
              <label>メールアドレス</label>
         </td>
          <td>
            <input type ="text" name="email" value="" maxlength="32" class="c"/>
          <td>
       </tr>
  </table>
    <br><br>
   <div class="center"><button class="submit_bt" type="submit">確認</button></div><!-- submitボタンCSS統一  -->
	</form>
   <%-- <div>
      <span>ログイン画面へ</span><a href='<s:url action="LoginAction" />'>戻る</a>
   </div> --%>
</div>
<div class="footer">
	<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
	<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
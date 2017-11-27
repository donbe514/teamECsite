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
		   height:750px;
		   width:100%;
		  }


		  .t0{
			  width:100%;
			  text-align:center;
				}

  			.t1 {
			border:solid 2px #0000ff;
			width:700px;
 			height:250px;
			text-align:left;
			margin:10px auto 0px;
			font-size:15px;
			border-collapse: collapse;
			table-layout: auto;

		}

		.EM {
			color:red;
			font-size:12px;

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
.tableborder_right{

background-color:#b0e0e6;
border-right: double 5px #0000ff;
width:200px;

}

.tableborder{
padding-bottom:5px ;
    padding-top:5px ;
border-bottom: solid 1px #0000ff;

}
.table_left{
padding-left: 5px;
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
	<tr class="tableborder">
         <td class="tableborder_right">
           <label>ユーザーID</label>
         </td>
         <td colspan="2" class="table_left">
         <input type="text" name="user_id" value=""  size="40" maxlength="16" class="c"/>
         </td>

      </tr>

       <tr class="tableborder">
          <td class="tableborder_right">
           <label>パスワード</label>
         </td>
         <td colspan="2" class="table_left">
            <input type="text" name="password" value="" size="40"  maxlength="16" class="c" />
         </td>

      </tr>
 			<tr class="tableborder">
				<td class="tableborder_right">
					<label>名前</label>
				</td>
				<td class="table_left">
					<label>姓</label><br>

					<input type="text" name="family_name" maxlength="16" minlength="1" value="" class="c" />
				</td>

				<td>
					<label>名</label><br>

					<input type="text" name="first_name" maxlength="16" minlength="1" value="" class="c" />
				</td>
			</tr>
			<tr class="tableborder">
				<td class="tableborder_right">
					<label>ふりがな</label>
				</td>
				<td class="table_left">
					<label>せい</label><br>

					<input type="text" name="family_name_kana" maxlength="16" minlength="1" value="" class="c" />
				</td>

				<td>
					<label>めい</label><br>

					<input type="text" name="first_name_kana" maxlength="16" minlength="1" value="" class="c" />
				</td>
			</tr>
       <tr class="tableborder">
           <td class="tableborder_right">
               <label>性別</label>
            <td colspan="2" class="table_left">
                &nbsp;<input type="radio" name="sex" value=0 checked="checked"><label>男</label>
                <input type="radio" name="sex" value=1><label>女</label>
           </td>
       </tr>
	<tr class="tableborder">
		<td class="tableborder_right">
			<label>メールアドレス</label>
		</td>
		<td colspan="2" class="table_left">
			<input type ="text" name="email" value="" size="60" maxlength="32" class="c"/>
		</td>
	</tr>

  </table>
    <br><br>
   <div class="center"><button class="submit_bt" type="submit">確認</button></div><!-- submitボタンCSS統一  -->
	</form>
  <br>
  <form action="LoginPageAction" >
   <div class="center"><button class="submit_bt1" type="submit">
     ログイン画面はこちら</button></div></form>
</div>
<div class="footer">
	<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
	<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
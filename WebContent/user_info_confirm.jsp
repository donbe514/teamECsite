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


		.f{

			color:black;
		}

        .tableborder_right{
        width:200px;
background-color:#b0e0e6;
border-right: double 5px #0000ff;

}

.tableborder{
padding-bottom:5px ;
    padding-top:5px ;
border-bottom: solid 1px #0000ff;

}
.table_left{

padding-left: 5px;
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
<table class="t1">
	<tr class="tableborder">
         <td class="tableborder_right">
           <label>ユーザーID</label>
         </td>
         <td colspan="2" class="table_left">
         <input type="hidden" name="user_id" value="<s:property value="user_id" escape="false" />"  size="40" maxlength="16" class="c"/>
         <s:property value="user_id" escape="false" />
         </td>

      </tr>

       <tr class="tableborder">
          <td class="tableborder_right">
           <label>パスワード</label>
         </td>
         <td colspan="2" class="table_left">
            <input type="hidden" name="password" value="<s:property value="password" escape="false" />" size="40"  maxlength="16" class="c" />
            <s:property value="password" escape="false" />
         </td>

      </tr>
 			<tr class="tableborder">
				<td class="tableborder_right">
					<label>名前</label>
				</td>
				<td class="table_left">
					<label>姓</label><br>

					<input type="hidden" name="family_name" maxlength="16" minlength="1" value="<s:property value="family_name" escape="false" />" class="c" />
					<s:property value="family_name" escape="false" />
				</td>

				<td>
					<label>名</label><br>

					<input type="hidden" name="first_name" maxlength="16" minlength="1" value="<s:property value="first_name" escape="false" />" class="c" />
					<s:property value="first_name" escape="false" />
				</td>
			</tr>
			<tr class="tableborder">
				<td class="tableborder_right">
					<label>ふりがな</label>
				</td>
				<td class="table_left">
					<label>せい</label><br>

					<input type="hidden" name="family_name_kana" maxlength="16" minlength="1" value="<s:property value="family_name_kana" escape="false" />" class="c" />
					<s:property value="family_name_kana" escape="false" />
				</td>

				<td>
					<label>めい</label><br>

					<input type="hidden" name="first_name_kana" maxlength="16" minlength="1" value="<s:property value="first_name_kana" escape="false" />" class="c" />
					<s:property value="first_name_kana" escape="false" />
				</td>
			</tr>
       <tr class="tableborder">
           <td class="tableborder_right">
               <label>性別</label>
            <td colspan="2" class="table_left">
             <input type="hidden" name="sex" value="<s:property value="sex" escape="false" />"  size="40" maxlength="16" class="c"/>
                <s:if test="sex==0">男</s:if>
                    <s:else>女</s:else>
           </td>
       </tr>
	<tr class="tableborder">
		<td class="tableborder_right">
			<label>メールアドレス</label>
		</td>
		<td colspan="2" class="table_left">
			<input type ="hidden" name="email" value="<s:property value="email" escape="false" />" size="60" maxlength="32" class="c"/>
			<s:property value="email" escape="false" />
		</td>
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
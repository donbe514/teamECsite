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
	<title>addressRegistration</title>
	<link rel="stylesheet" type="text/css" href="./css/main.css">

	<style type="text/css">


			.table1{
			text-align:center;
			width:100%;
			}

			.table2 {
			border:solid 1px #0000ff;
			width:700px;
 			height:300px;
			text-align:left;
			margin:10px auto 0px;
			font-size:15px;
			table-layout: auto;
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
			font-size:13px;
			}
			label{
			font-size:16px;
			font-weight:bold;
			}

			.center{
			text-align:center;
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

	</style>
</head>
<body>
<div class="header">
	<h1>❐　宛先登録画面</h1>
</div>
<div class="main">
	<form action="AddressRegistrationConfirmAction">
		<table class="table1">
			<tr>
				<td class="td1">
			<!-- エラーメッセージを表示する -->
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
					<label>名前</label>
				</td>
				<td class="table_left">
					<label>姓</label><br>

					<input type="text" name="putFamily_name" maxlength="16" minlength="1" value="" class="c" />
				</td>

				<td>
					<label>名</label><br>

					<input type="text" name="putFirst_name" maxlength="16" minlength="1" value="" class="c" />
				</td>
			</tr>
			<tr class="tableborder">
				<td class="tableborder_right">
					<label>ふりがな</label>
				</td>
				<td class="table_left">
					<label>せい</label><br>

					<input type="text" name="putFamily_name_kana" maxlength="16" minlength="1" value="" class="c" />
				</td>

				<td>
					<label>めい</label><br>

					<input type="text" name="putFirst_name_kana" maxlength="16" minlength="1" value="" class="c" />
				</td>
			</tr>
	<tr class="tableborder">
		<td class="tableborder_right">
			<label>住所</label>
		</td>
		<td colspan="2" class="table_left">
			<input type ="text" name="putUser_address" value="" size="60" maxlength="32" class="c"/>
		</td>
	</tr>
	<tr class="tableborder">
		<td class="tableborder_right">
			<label>電話番号</label>
		</td>
		<td colspan="2" class="table_left">
			<input type ="text" name="putTel_number" value="" size="60" maxlength="32" class="c"/>
		</td>
	</tr>

	<tr class="tableborder">
		<td class="tableborder_right">
			<label>メールアドレス</label>
		</td>
		<td colspan="2" class="table_left">
			<input type ="text" name="putEmail" value="" size="60" maxlength="32" class="c"/>
		</td>
	</tr>

  </table>
		<br>

		<div class="center"><button class="submit_bt" type="submit">確認</button></div>
</form>
</div>
<div class="footer">
<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
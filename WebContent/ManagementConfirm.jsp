<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<title>入荷確認画面</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
<style type="text/css">

.header{/* ヘッダー全体 */
	text-align:center;
}

.mainbox{/* 追加前追加後在庫数 */
	text-align:center;
}

table{/*商品名・入荷数 */
	margin:0 auto;
}

b{/* sタグ適用部分 */
	font-size:30px;
}
.back{/* 前画面に戻る場合はこちら */
	text-align:center;
}
.submit_bt{/* 送信ボタン */
	margin-left:110px;
}

</style>
</head>
<body>
<div class="header">
	<h1>❐　在庫確認画面</h1>
</div>
<div class="main">
	<div class="mainbox">
		<p>追加前在庫数：<b><s:property value ="#session.beforeStock" /></b></p>
		<p>追加後在庫数：<b><s:property value="#session.stock" /></b></p>
		<br><br>
	</div>
	<!-- 在庫追加完了画面に飛ばします -->
		<s:form action = "ManagementConfilmAction">
		<table>
			<tr>
				<td>商品名:</td>
				<td><b><s:property value = "product_name" /></b></td>
			</tr>
			<tr>
				<td>在庫追加数:　　</td>
				<td><b><s:property value = "stock" /></b></td>
			</tr>
			<tr><td><br></td></tr>
			<tr>
				<td><input type="submit" value = "確定" class = "submit_bt"/></td>
			</tr>
		</table>
		</s:form>
		<p class="back">前画面に戻る場合は<a href='<s:url action="ManagementAction" />'>こちら</a></p>
	</div>
<div class="footer">
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
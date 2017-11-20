<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<title>管理画面</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
<style type="text/css">

.header{/* ヘッダー全体 */
	text-align:center;
}

.important{/* 入荷数を空欄のまま */
	font-weight:bold;
	border-bottom: solid 2px #2E9AFE;
}

.mainbox{/* 説明欄 */
	text-align:center;
}

table{/* 入力欄 */
	margin:0 auto;
}

.nyuuka{/* 入荷数入力欄 */
	margin-left:9px;
	width:112px;
}
.submit_bt{/* 送信ボタン */
	margin-left:40px;
}

</style>
</head>
<body>

<div class="header">
	<h1>❐　在庫追加画面</h1>
</div>
<div class="main">
	<div class="mainbox">
		<h2>各商品の在庫数を追加できます。</h2><br>
		<p>現在の在庫数を確認したい場合は……
		<p><span class="important">入荷数を空欄のまま</span>在庫入荷ボタンを押してください。</p><br>
		<b style="color:red">※入荷数は、5桁以内の半角数字（正の数）のみ入力可能です。</b><br><br><br><br>
	</div>
		<!-- 在庫追加確認ページに飛ばします。 -->
		<s:form action= "ManagementReferenceAction">
			<table>
				<tr>
					<td>商品名:
						<select name= "product_name" style="height:25px;">
							<s:iterator value = "ManagementList">
								<option><s:property value = "product_name" /></option>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						<span>入荷数</span><input type="text" name ="stock" placeholder = "入荷数入力"  class = "nyuuka"  value ="" pattern="\d{0,5}" style="height:20px;">
						<!-- 現在は5ケタ以内の半角数字縛り。桁数の制限を外す場合は↓ -->
						<%-- <span>入荷数</span><input type="text" name ="stock" placeholder = "入荷数入力"  class = "nyuuka"  value ="" pattern="\d{0,5}" style="height:20px;"> --%>
					</td>
				</tr>
				<tr><td><br></td></tr>
				<tr>
					<td>
						<input type="submit" value = "在庫入荷" class = "submit_bt" />
					</td>
				</tr>
			</table>
		</s:form>
		<p style="text-align:center;">ホームに戻る場合は<a href='<s:url action="HomeAction" />' target="_parent" >こちら</a></p>
	</div>
<div class="footer">
	<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
	<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
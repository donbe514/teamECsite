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
<title>在庫更新完了</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
<link rel="stylesheet" href="./css/animate.min.css">
<style type="text/css">

.header{/* ヘッダー全体 */
	text-align:center;
}

.zaiko{/* 在庫の更新が完了しました。 */
	font-size:40px;
	color:#008B8B;
}
p{/* 管理画面に戻る場合はこちら */
	text-align:center;
}

</style>
</head>
<body>
<div class="header">
<h1>❐　在庫更新完了画面</h1>
</div>
<div class="main">
	<div class="left">
		<p class="animated rubberBand" style="text-align:center;"><b class="zaiko">在庫の更新が完了しました。</b></p><br><br>
		<p><b>~お疲れさまでした~</b></p><br><br>
		<p>管理画面に戻る場合は<a href='<s:url action="ManagementAction" />'>こちら</a></p>
	</div>
	<div class="right">
	</div>
</div>
<div class="footer">
	<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
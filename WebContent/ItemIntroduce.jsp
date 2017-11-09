<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="jquery.easing.1.3.js"></script>
<script type="text/javascript" src="sliders.js"></script>
<title>ItemIntroduce</title>
</head>
<body>
  <s:if test="message!=''">
    <s:property value="message" />
  </s:if>

  <h1>商品説明画面</h1>
  <s:iterator value="itemList" status="ct">
    <br>商品名：<s:property value="product_name" />
    <br>ふりがな：<s:property value="product_name_kana" />
    <br>商品番号:<s:property value="product_id" />番
 <br>価格：<s:property value="price" />円
 <br>
    <a href='<s:url action="GoDetailAction"><s:param name="product_id" value="itemList[#ct.index].product_id"/></s:url>'>
      <img src='<s:property value="image_file_path"/>'width="400" height="250"></a>
  </s:iterator>

</body>
</html>
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
<meta http-equiv="Content-Style-Type" content="text/css" />
<title>ItemIntroduce</title>
<link rel="stylesheet" type="text/css" href="./css/Item.css">
</head>
<body>
  <s:if test="message!=''">
    <s:property value="message" />
  </s:if>

  <h1>商品説明画面</h1>

  <div id="mainbox">

  <s:iterator value="itemList" status="ct">
      <div class="itembox">
        <a
          href='<s:url action="GoDetailAction"><s:param name="product_id" value="itemList[#ct.index].product_id"/></s:url>'>
          <img src='<s:property value="image_file_path"/>' width="250"
          height="250" class="imageleft">
        </a>
      </div>
      <div class="itembox">
        <table border="1">
          <tr>
            <th>商品名</th>
            <td><s:property value="product_name" /></td>
          </tr>
          <tr>
            <th>ふりがな</th>
            <td><s:property value="product_name_kana" /></td>
          </tr>
          <tr>
            <th>価格</th>
            <td>\<s:property value="price" /></td>
          </tr>
        </table>
        >商品番号:<s:property value="product_id" />番
 <br>
      </div>
  </s:iterator>
  </div>
  <div class="boxclear"></div>

  <s:iterator value="pages" status="it">
 	<a href='<s:url action="IntroduceAction">
 			<s:param name="SearchText" value="product_name" />
 			<s:param name="category_id" value="category_id" />
 			<s:param name="LimitFlag" value="1" />
 			<s:param name="page" value="#it.count" />
 			</s:url>'>
 			<s:property value="#it.count"/>
 	</a>
 </s:iterator>

</body>
</html>
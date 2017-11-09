<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ItemDetail</title>
<script type="text/javascript" src="jquery.js"></script>
<script type="text/javascript" src="jquery.easing.1.3.js"></script>
<script type="text/javascript" src="sliders.js"></script>
<title>ItemDetail</title>
</head>


<body>
  <h1>商品詳細</h1>

  <s:iterator value="itemList">
    <form action="CartInAction">
    <table>
      <tr>
        <th></th>
        <td>
        <img alt="商品画像" src="<s:property value="image_file_path" />" width="400"
          height="250"></td>
        <td>
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
              <td><s:property value="price" /></td>
            </tr>
            <tr>
              <th>商品説明欄</th>
              <td><s:property value="product_description" /></td>
            </tr>
            <tr>
            <tr>
              <th>販売会社名</th>
              <td><s:property value="release_company" /></td>
            </tr>
            <tr>
              <th>発売念月日</th>
              <td><s:property value="release_date" /></td>
            </tr>
            <tr>
              <th>商品補足説明</th>
              <td><s:property value="" /></td>
            </tr>
            <tr>
              <th>在庫数</th>
              <td><s:property value="stock" /></td>
            </tr>

          </table>
    </table>
      <select name="item_count">
            <option value=1 label=1>
            <option value=2 label=2>
            <option value=3 label=3>
            <option value=4 label=4>
            <option value=5 label=5>
      </select>
      <input type="hidden" value='<s:property value="product_id" />' name="product_id">
      <input type="submit" value="カートに入れる">
  <input type="button" value="前のページ（商品一覧）へ戻る" onclick="history.back()">
   </form>
  </s:iterator>



</body>
</html>
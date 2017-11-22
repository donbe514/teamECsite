<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cart</title>
<link rel="stylesheet" type="text/css" href="./css/cart.css">
<link rel="stylesheet" type="text/css" href="./css/main.css">
</head>
<body>
<div class="header">
<h1>❒　ショッピングカート</h1>
</div>
<div class="main">
  <div class="outer">
    <div class="inner">
      <s:if test="CartEnptyFlag">
        <p style="color:red; font-size:30px; font-weight:bold;"><s:property value="message" escape="false" /></p>
<%-- <br><br>
	<s:iterator value="BuyFalseList">
	<div style="text-align:center;"><span style = "color:red;"><s:property value="product_name" /></span>の在庫が不足しておりました。</div>
	<p style="text-align:center;">申し訳ございません。</p>
	</s:iterator> --%>
      </s:if>
      <s:else>
        <s:property value="message" escape="false"  />
        <ul class="itemlist">
          <s:iterator value="CartAry">
            <form action="CartDellAction">
              <img src='<s:property value="image_file_path"/>'
                height=250px; width=300px;>
              <h2>
                <s:property value="product_name" />
              </h2>
              <div class="mainarea">
                <dl>
                  <dt>
                    値段:
                    <s:property value="price" />円
                  </dt>
                  <dt>
                    ふりがな:
                    <s:property value="product_name_kana" />
                  </dt>
                  <dt>
                    発売会社名:
                    <s:property value="release_company" />
                  </dt>
                  <dt>
                    発売年月日:
                    <s:property value="release_date" />
                  </dt>
                  <dt>
                    個数:
                    <s:property value="stock" />
                  </dt>
                  <dt>
                    <input type="checkbox" name="dell_id"
                      value='<s:property value="id"/>'>
                      <input type="submit" value="カート削除" class="submit_bt" style=" width:100px; margin-left:20px; padding: 5px 15px; font-size:12px; ">
                  </dt>
                </dl>
              </div>
            </form>
          </s:iterator>
        </ul>
        <div class="pcolor">
          <h1>
            合計金額：
            <s:property value="total_price" />円
          </h1>
        </div>
        <form action="AddressAction">
          <input type="submit" value="決済" class="submit_bt" style="width:150px; padding: 10px 25px;" >
        </form>
      </s:else>
    </div>
  </div>
  </div>
  <div class="footer">
<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
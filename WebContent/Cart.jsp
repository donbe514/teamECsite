<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="./css/cart.css">
</head>
<body>
  <div class="outer">
    <div class="inner">
      <s:if test="CartEnptyFlag">
        <s:property value="message" />
      </s:if>
      <s:else>
        <s:property value="message" />
        <h1>ショッピングカート</h1>
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
                    値段:\
                    <s:property value="price" />
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
                    <s:property value="item_count" />
                  </dt>
                  <dt>
                    <input type="checkbox" name="dell_id"
                      value='<s:property value="id"/>'>
                      <input type="submit" value="カート削除">
                  </dt>
                </dl>
              </div>
            </form>
          </s:iterator>
        </ul>
        <div class="pcolor">
          <h1>
            合計金額：\
            <s:property value="total_price" />
          </h1>
        </div>
        <form action="AddressAction">
          <input type="submit" value="決済">
        </form>
      </s:else>
    </div>
  </div>
</body>
</html>
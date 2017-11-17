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
<link rel="stylesheet" type="text/css" href="./css/Item.css">
</head>


<body>
  <div class="outer">
    <div class="inner">
      <h1>商品詳細</h1>
      <form action="CartInAction">
        <div id="mainbox">
          <div class="itembox">
            <ul class="itemlist">
              <li><img alt="商品画像"
                src="<s:property value="image_file_path" />" width="350"
                height="200">
                <h1>
                  <s:property value="product_name" />
                </h1>
                <div class="textbox">
                  <dl>
                    <dt>
                      ふりがな:
                      <s:property value="product_name_kana" />
                    </dt>
                  </dl>
                  <dl>
                    <dt>
                      販売会社名:
                      <s:property value="release_company" />

                    </dt>
                  </dl>
                  <dl>
                    <dt>

                      発売年月日:
                      <s:property value="release_date" />
                    </dt>
                  </dl>
                  <dl>
                    <dt>
                      商品説明欄:
                      <s:property value="product_description" />
                    </dt>
                  </dl>
                  <dl>
                    <dt>
                      在庫数:
                      <s:if test="stock<1">0</s:if>
                      <s:else>
                        <s:property value="stock" />
                      </s:else>
                    </dt>
                  </dl>
                  <dl>
                  <dt>
                  <dd class="price">
                    \:
                    <s:property value="price" />
                  </dd>
                 </dt>
                 </dl>
                </div>

        <s:if test="stock>0">
          <select name="item_count">
            <s:iterator value="buyitemcount" status="bi">
              <option value="<s:property value='#bi.count'/>"><s:property
                  value="#bi.count" /></option>
            </s:iterator>
          </select>
          <input type="hidden" value='<s:property value="product_id" />'
            name="product_id">
          <input type="submit" value="カートに入れる">
        </s:if>
        <s:else>
      売り切れです。
    </s:else>
        <input type="button" value="前のページ（商品一覧）へ戻る"
          onclick="history.back()">
        <div class="boxclear"></div>
      </form></li>

            </ul>
          </div>
        </div>

    </div>
  </div>
</body>
</html>
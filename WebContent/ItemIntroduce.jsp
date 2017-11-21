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
<link rel="stylesheet" type="text/css" href="./css/Item2.css">
<link rel="stylesheet" type="text/css" href="./css/main.css">
</head>
<body>
<div class="header">
<h1>❒　商品一覧</h1>
</div>
<div class="main">
  <div class="outer">
    <div class="inner">
      <!-- TextSearchの中身がitemListに無かったときに、『検索結果はありません』と表示する。 -->
      <s:if test="message!=''">
        <h2>
          <s:property value="message" />
        </h2>
        <form action="HomeAction" target="_parent">
          <input type="submit" value="ホームへ戻る">
        </form>
      </s:if>
      <div id="mainbox">
        <s:iterator value="itemList" status="ct">
          <div class="itembox">
            <ul class="itemlist">
              <li><a
                href='<s:url action="GoDetailAction"><s:param name="product_id" value="itemList[#ct.index].product_id"/><s:param name="category_id" value="itemList[#ct.index].category_id"/></s:url>'>
                  <img src='<s:property value="image_file_path"/>'
                  width="250" height="250" class="imageleft">
              </a>
                <div class="textbox">
                  <dl>
                  <!-- 商品名 -->
                    <dt>
                      商品名:
                      <s:property value="product_name" />
                    </dt>
                    <!-- ふりがな -->
                    <dt>
                      ふりがな:
                      <s:property value="product_name_kana" />
                    </dt>

                    <!-- Amazonのカテゴリー表示みたいなの -->
                    <dt>
                      カテゴリ：
                      <s:if test="category_id==1">
                                        本
                                        </s:if>
                      <s:elseif test="category_id==2">
                                        家電・パソコン
                                        </s:elseif>
                      <s:elseif test="category_id==3">
                                        おもちゃ・ゲーム
                                        </s:elseif>
                    </dt>
                    <dd class="price">

                      <s:property value="price" />円

                    </dd>
                  </dl>
                </div></li>
            </ul>
          </div>
        </s:iterator>
      </div>
      <div class="boxclear"></div>
      <br>
      <s:iterator value="pages" status="it">
        <a class="space"
          href='<s:url action="IntroduceAction">
      <s:param name="SearchText" value="product_name" />
      <s:param name="category_id" value="category_id" />
      <s:param name="LimitFlag" value="1" />
      <s:param name="page" value="#it.count" />
      </s:url>'>
          <s:property value="#it.count" />
        </a>
      </s:iterator>
    </div>
  </div>
  </div>
  <div class="footer">
	<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
	<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="Content-Style-Type" content="text/css" />
	<meta http-equiv="Content-Script-Type" content="text/javascript" />
	<meta http-equiv="imagetoolbar" content="no" />
	<meta name="description" content="" />
	<meta name="keywords" content="" />
	<meta charset="utf-8">
<title>Saipass画面</title>
<link rel="stylesheet" type="text/css" href="./css/main.css">
    <style type ="text/css">
.er{
       width:100%;
       height:30%;
       color:#e2041b;
}
    .t1{
    		width:500px;
    		height:180px;
			margin:70px auto;
			border:2px solid #248;
		}

	.t2{
    		width:600px;
			margin:80px auto;
		}

		.top{
		        width:100%;
		        height:80px;
				font-size:150%;
				color:#248;
				text-align:center;
				 font-weight: bold;


      }

		.main {
			   width: 100%;
			   height: 700px;
			   text-align: center;



		   }

        .t{
	        	font-size:18px;
	   		    font-weight:bold;
	   		    color:#248;
   		    }
        .f{
        		background-color:#f5f5f5;
	        	width:250px;
	   			height:25px;
	   			color:#248;
				font-size:18px;
   			}

   		.f:hover{
   		         background-color:#fce3e9;
   				}

        .r{
		        font-size:18px;
		      font-weight:bold;
		      background-color:#248;
		      color:white;
		       padding: 8px 20px;
		       border-style: none;
		       moz-border-radius: 25px;
		     webkit-border-radius: 25px;
		       border-radius: 25px;
		       width:120px;
				margin:0px auto;
				clear:both;
        }
        .tableborder_right{

background-color:#b0e0e6;
border-right: double 5px #0000ff;
width:200px;

}

.tableborder{
padding-bottom:5px ;
    padding-top:5px ;
border-bottom: solid 1px #0000ff;

}
.table_left{
padding-left: 5px;
}

          			.t1 {
			border:solid 2px #0000ff;
			width:500px;
 			height:200px;
			text-align:left;
			margin:10px auto 0px;
			font-size:15px;
			border-collapse: collapse;
			table-layout: auto;

		}

        .r:hover{
                 background-color:#248;
                 color:white;
                 font-size:24px;
        }

        .cansell{
                 font-size:20px;
        }
a { text-decoration: none;
  color:white; }
    </style>
</head>
<body>
  <div class="header">
  <div class="top">
      <p>お客様のIDの入力と更新するパスワードの設定をお願いします。</p>
     </div>
</div>

  <div class="main">

     <s:if test="errorMessage!=''">
      <div class="er"><s:property value="errorMessage" escape="false" /></div>
     </s:if>


 <form action="SaipassComplateAction">

 <table class="t1">
	<tr class="tableborder">
         <td class="tableborder_right">
           <label>ログインID</label>
         </td>
         <td class="table_left">
         <input type="text" name="user_id" value=""  size="30" maxlength="16" class="c"/>
         </td>

      </tr>

       <tr class="tableborder">
          <td class="tableborder_right">
           <label>新しいパスワード</label>
         </td>
         <td class="table_left">
            <input  type="password" name="saipassword" value="" size="30"  maxlength="16" class="c" />
         </td>

      </tr>
       <tr class="tableborder">
          <td class="tableborder_right">
           <label>もう一度入力して下さい。</label>
         </td>
         <td  class="table_left">
            <input type="password" name="resaipassword" value="" size="30"  maxlength="16" class="c" />
         </td>

      </tr>

  </table>

  <table class="t2">
  <tr>

      <td><input type="submit" value="登録"  class="r"/></td>
       <td><div class="r"><a href='<s:url action="LoginPageAction" />' >キャンセル</a></div></td>
  </tr>
  </table>
</form>
</div>


  <div class="footer">
<!-- target="_parent" <frameset>を定義したウインドウにリンク先のページを表示する -->
<a href='<s:url action="HomeAction" />' target="_parent" >ホームに戻る✔</a>
</div>
</body>
</html>
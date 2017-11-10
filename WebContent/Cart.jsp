<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<s:if test="message != ''">
	<s:property value="message"/>
</s:if>
<s:else>
	<s:iterator value="CartAry">
		<form action="CartDellAction">
			<img src='<s:property value="image_file_path"/>'>
			<s:property value="product_name"/>
			<s:property value="product_name_kana"/>
			<s:property value="price"/>
			<s:property value="release_company"/>
			<s:property value="release_date"/>
			<s:property value="item_count"/>
			<input type="checkbox" name="dell_id" value='<s:property value="id"/>'>
			<input type="submit" value="カート削除">
		</form>
	</s:iterator>
	<s:property value="total_price"/>

	<form action="AddressAction">
		<input type="submit" value="決済">
	</form>

</s:else>

</body>
</html>
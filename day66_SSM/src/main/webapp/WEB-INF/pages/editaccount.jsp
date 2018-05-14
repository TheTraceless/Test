<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑账户</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/account/updateAccount" method="post" >
	<input type="hidden" name="id" value="${account.id}">
	账户名称：<input type="text" name="name" value="${account.name}"><br/>
	账户余额：<input type="text" name="money" value="${account.money}"><br/>
	<input type="submit" value="更新"><br/>
</form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>
<!-- 测试查询所有 -->
<a href="account/findAll">查询所有账户</a>
<hr/>
<!--保存  -->
<form action="account/saveAccount" method="POST">
	账户名称：<input type="text" name="name"><br/>
	账户金额：<input type="text" name="money"><br/>
	<input type="hidden" name="_method" value="PUT">
	<input type="submit" value="保存"><br/>
</form>
</body>
</html>
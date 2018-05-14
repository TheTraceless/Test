<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>账户列表页面</title>
</head>
<body>
查询了账户的列表${requestScope.accounts}
<table border="1" width="500px" align="center">
	<tr>
		<td>编号</td>
		<td>名称</td>
		<td>金额</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${accounts}" var="account" varStatus="vs">
		<tr>
			<td>${vs.count}</td>
			<td>${account.name}</td>
			<td>${account.money}</td>
		<td ><a href="${pageContext.request.contextPath}/account/findById/${account.id}">修改(查询详情)</a></td>
		</tr>
	</c:forEach>
</table>
</body>

</html>
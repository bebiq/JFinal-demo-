<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table align="center"  width="80%">
	<tr>
		<td>
			<a href="./gly/form">添加数据</a>
		</td>
	</tr>
</table>
<table align="center" border="1" width="80%">
	<tr>
		<th>序号</th><th>管理员名</th><th>登陆名</th><th>权限</th><th>操作</th>
	</tr>
	<c:forEach items="${list }" var="gly">	
	<tr>
		<td>${gly.guanliyuanid }</td>
		<td>${gly.guanliyuanming }</td>
		<td>${gly.dengluming }</td>
		<td>${gly.quanxian }</td>
		<td><a href="./gly/form/${gly.guanliyuanid }">修改</a> <a href="./gly/del/${gly.guanliyuanid }">删除</a></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>
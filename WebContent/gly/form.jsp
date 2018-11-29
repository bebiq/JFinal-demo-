<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="${guanliyuan==null?'./save':'../update' }" method="post">
<input type="hidden" name="guanliyuan.guanliyuanid" value="${guanliyuan.guanliyuanid }"> 
<table>
	<tr>
		<th colspan="2">添加页面</th>
	</tr>
	<tr>
		<th>管理员名</th><td><input type="text" name="guanliyuan.guanliyuanming" value="${guanliyuan.guanliyuanming }"></td>
	</tr>
	<tr>
		<th>管理员登陆名</th><td><input type="text" name="guanliyuan.dengluming" value="${guanliyuan.dengluming }"></td>
	</tr>
	<tr>
		<th>密码</th><td><input type="text" name="guanliyuan.mima" value="${guanliyuan.mima }"></td>
	</tr>
	<tr>
		<th>管理员权限</th><td><input type="text" name="guanliyuan.quanxian" value="${guanliyuan.quanxian }"></td>
	</tr>
	<tr>
		 <td colspan="2">
		 <input type="submit"  value="提交">
		 <input type="reset"  value="重置">
		 </td>
	</tr>
</table>
</form>
</body>
</html>
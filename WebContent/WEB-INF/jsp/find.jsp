<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<h3><strong>欢迎${users.userName}</strong></h3>
<a href="${pageContext.request.contextPath }">退出登录</a>
<ul>
    <li><a href="${pageContext.request.contextPath }/sale/saleadd.html">销售</a></li>
    <li><a href="${pageContext.request.contextPath }/sale">销售信息查询</a></li>
    <li><a href="${pageContext.request.contextPath }/product">查看库存</a></li>
</ul>
</body>
</html>
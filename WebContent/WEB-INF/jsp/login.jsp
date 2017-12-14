<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
     <h1><strong>小型进销存系统</strong></h1>
     <br/>
     <form action="${pageContext.request.contextPath }/users/login" method="post">
     <div>${error }</div>
         <label>用户名：</label>
         <input type="text" name="userName"/><br/>
         <label>密码：</label>
         &nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password"/><br/>
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <input type="submit" value="登陆"/> <input type="reset" value="重置"/>
     </form>
</body>
</html>
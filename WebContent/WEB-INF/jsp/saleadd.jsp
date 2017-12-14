<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ include file="find.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    <form action="${pageContext.request.contextPath }/sale" method="post">
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
        商品名称：<select name="productId">
              <c:forEach items="${productList }" var="p">
                  <option value="${p.id }">${p.productName }</option>
              </c:forEach>
        </select><br/>
        销售单价： <input type="text" name="price" value=""><br/>
        销售数量： <input type="text" name="quantity" value=""><br/>
     销售总金额：<input type="text" name="totalPrice" value=""><br/>
     销售日期   ：<input type="text" name="saleDate" value=""><br/>
     用户编号   ：<input type="text" name="userId" value=""><br/>
        <input type="submit" value="保存">
    </form>
</body>
</html>
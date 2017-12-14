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
   <form action="${pageContext.request.contextPath }/product" method="get">
   <h2><strong>查看库存</strong></h2>
   <select name="productName">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <c:if test="${productList!=null}">
            <option value="0">请选择</option>
            <c:forEach items="${productList}" var="pro">
              <option>
              ${pro.productName }
              </option>
            </c:forEach>
        </c:if>
   </select>
   <input type="submit" value="查询">
    <table align="center" border="1">
    <tr>
       <td>ID</td>
       <td>商品名称</td>
       <td>库存</td>
    </tr>
    <c:forEach items="${productList}" var="p">
    <tr>
       <td>${p.id}</td>
       <td>${p.productName}</td>
       <td>${p.quantity}</td>
    </tr>
    </c:forEach>
    </table>
        <%-- 该商品的库存量是：${productList.quantity} --%>
   </form>
</body>
</html>
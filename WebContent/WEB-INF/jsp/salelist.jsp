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
    <form action="${pageContext.request.contextPath }/sale" method="get">
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <!-- <input type="hidden" name="method" value="query"> -->
         <span>销售查询信息</span>   
                       排序方式：<select name="userId">
             <c:if test="${usersList!=null}">
                <option value="0">请选择</option>
                <c:forEach items="${usersList }" var="users">
                <option
                <c:if test="${users.id==userId }">selected="selected"</c:if>
                value="${users.id}">
                ${users.userName}
                </option>
                 
                </c:forEach> 
            </c:if>
         </select>
         <input type="hidden" name="pageIndex" value="1"/>
         <input value="查询" type="submit">
    
     <table align="center" border="1">
             <tr>
                <td>ID</td>
                <td>商品</td>
                <td>单价</td>
                <td>数量</td>
                <td>总价</td>
                <td>销售日期</td>
                <td>销售员</td>
             </tr>
             <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
             <c:forEach var="sale" items="${sale}" varStatus="sta">
                 <tr 
                  <c:if test="${sta.index%2==0}">bgcolor=yellow</c:if>
                  <c:if test="${sta.index%2==1}">bgcolor=pink</c:if>
                 >
                    <td>${sale.id }</td>
                    <td>${sale.productName }</td>
                    <td>${sale.price }</td>
                    <td>${sale.quantity }</td>
                    <td>${sale.totalPrice }</td>
                    <td>${sale.saleDate }</td>
                    <td>${sale.userName }</td>
                 </tr>
                 
             </c:forEach>
         </table>
         </form>
</body>
</html>
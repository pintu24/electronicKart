<%@page import="com.ekart.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="usernavigationbar.jsp" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="x" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3">
<tr>
<th>Id</th>
<th>Name</th>
<th>Description</th>
<th>Price</th>
<th>about product</th>
</tr>
<x:forEach items="${prolist}" var="product">
<tr>
<td>${product.productId}</td>
<td>${product.productName }</td>
<td>${product.productDescription }</td>
<td>${product.productPrice }</td>
<td><a href="info?pid=${product.productId}">more info</a></td>
</tr>
</x:forEach>
</table>
</body>
</html>
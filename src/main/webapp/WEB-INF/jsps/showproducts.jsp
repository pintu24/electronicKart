<%@page import="com.ekart.model.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="navigationbar.jsp" %>
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
</tr>
<%
ArrayList<Product> arrayList=(ArrayList)request.getAttribute("prolist");
for(Product product:arrayList)	
{
	%>
	<tr>
	<td><% out.print(product.getProductId());%></td>
	<td><%out.print(product.getProductName()); %></td>
	<td><%out.print(product.getProductDescription()); %></td>
	<td><%out.print(product.getProductPrice()); %></td>
<%	
}
%>
</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="navigationbar.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="carryproduct">
<table>
<tr><td>ProductId</td><td><input type="text" name="pid"></td></tr>
<tr><td>ProductName</td><td><input type="text" name="pname"></td></tr>
<tr><td>ProductDescription</td><td><input type="text" name="pdes"></td></tr>
<tr><td>ProductPrice</td><td><input type="text" name="ppri"></td></tr>
</table>
<input type="submit" value="Submit">
</form>
</body>
</html>
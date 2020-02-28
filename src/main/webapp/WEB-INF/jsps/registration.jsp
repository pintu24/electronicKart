<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="navigationbar.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>

<form action="carryuserinfo">
<table>
<tr><td>username</td><td><input type="text" name="us"/></td></tr>
<tr><td>password </td><td><input type="password" name="ps"/></td></tr>
<tr><td>email </td><td><input type="text" name="em"/></td></tr>
<tr><td>mobile.no </td><td><input type="text" name="mb"/></td></tr>
</table>
<input type="submit" value="SignUp">
</form>

</body>
</html>
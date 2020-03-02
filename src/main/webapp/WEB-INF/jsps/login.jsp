<!DOCTYPE html>
<%@ include file="navigationbar.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spforms" %>
<html lang="en">
<head>
  <title>Login</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Stacked form</h2>
  <spforms:form action="carrylogin" method="post" modelAttribute="log">
  
      <div class="form-group">
      <label for="username">Username:</label>
      <spforms:input type="text" class="form-control" placeholder="Enter Username" path="userName"/>

    <div class="form-group">
      <label for="pwd">Password:</label>
      <spforms:input type="password" class="form-control" placeholder="Enter password" path="password"/>
    </div>
    


    <button type="submit" class="btn btn-primary">Login</button>
  </spforms:form>
</div>

</body>
</html>

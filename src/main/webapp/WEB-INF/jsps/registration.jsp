<!DOCTYPE html>
<%@ include file="navigationbar.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spforms" %>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
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
  <spforms:form action="carryuserinfo" method="post" modelAttribute="usr">
  
      <div class="form-group">
      <label for="username">Username:</label>
      <spforms:input type="text" class="form-control" placeholder="Enter Username" path="userName"/>
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <spforms:input type="email" class="form-control" placeholder="Enter email" path="email"/>
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <spforms:input type="password" class="form-control" placeholder="Enter password" path="password"/>
    </div>
    
        <div class="form-group">
      <label for="mobile.no">Mobile.no:</label>
      <spforms:input type="text" class="form-control" placeholder="Enter mobile.no" path="mobileNo"/>
    </div>
    
    <spforms:select class="form-control" path="role">
    <spforms:option value="ROLE_USER">user</spforms:option>
    <spforms:option value="ROLE_ADMIN">Admin</spforms:option>
    </spforms:select>
    <button type="submit" class="btn btn-primary">SignUp</button>
  </spforms:form>
</div>

</body>
</html>

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
  <spforms:form action="carryproduct" method="post" modelAttribute="prolist">
  
      <div class="form-group">
      <label for="productId">ProductId:</label>
      <spforms:input type="text" class="form-control" placeholder="Enter ProductId" path="productId"/>
    </div>
    <div class="form-group">
      <label for="productName">ProductName:</label>
      <spforms:input type="text" class="form-control" placeholder="Enter productName" path="productName"/>
    </div>
    <div class="form-group">
      <label for="productDescription">Description:</label>
      <spforms:input type="text" class="form-control" placeholder="Enter Description" path="productDescription"/>
    </div>
    
        <div class="form-group">
      <label for="productPrice">Price:</label>
      <spforms:input type="text" class="form-control" placeholder="Enter Price" path="productPrice"/>
    </div>
    
    <button type="submit" class="btn btn-primary">Submit</button>
  </spforms:form>
</div>

</body>
</html>

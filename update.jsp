<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title></title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
  <style>
   
    .row.content {height: 550px}
    
   
    .sidenav {
      background-color: #f1f1f1;
      height: 100%;
    }
        
   
    @media screen and (max-width: 767px) {
      .row.content {height: auto;} 
    }
  </style>
</head>
<body>

<nav class="navbar navbar-inverse visible-xs">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">E-Commerce App</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#">Dashboard</a></li>
        <li><a href="#">Add Product</a></li>
        <li><a href="#">View Cart</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="container-fluid">
  <div class="row content">
    <div class="col-sm-3 sidenav hidden-xs">
      <h2>E-Cart</h2>
      <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="#section1">Dashboard</a></li>
        <li><a href="#section3">View Cart</a></li>
      </ul><br>
    </div>
    <br>
    
    <div class="col-sm-9">
      <div class="well">
        <h4>Welcome to Admin Page</h4>
        <p>Only Admin Should be Used..</p>
      </div>
<body>
	<form action="<%=request.getContextPath() %>/product/updateProduct" method="post">
		<label>Are you sure You Want Add the Item to Cart ?</label>
		<br>
		<br>
		<input type = "number" value = ${id} name = prodId readonly="readonly"/><br/><br/>
		<input type = "text" value = ${name} name = prodName /><br/><br/>
		<input type = "text" value = ${desc} name = prodDesc /><br/><br/>
		<input type = "number" value = ${price} name = price /><br/><br/>
		<input type = "submit" value = "Add"/ class="btn btn-warning">
	</form>
	<h3 style="color:red">${updateMsg}</h3>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
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
      <h2>Logo</h2>
      <ul class="nav nav-pills nav-stacked">
        <li class="active"><a href="#section1">Dashboard</a></li>
        <li><a href="#section2">Add Product</a></li>
        <li><a href="#section3">View Cart</a></li>
      </ul><br>
    </div>
    <br>
    
    <div class="col-sm-9">
      <div class="well">
        <h4>Welcome to Admin Page</h4>
        <p>Only Admin Should be Used..</p>
      </div>
      <div class="row">
        <div class="col-sm-3">
          <div class="well">
            <img class="card-img-top" src="watch_1.jpg" alt="Card image cap">
            <center><h4>AIR-KING</h4>
            <p>Price:568,000</p>
            <button type="button" class="btn btn-primary">Add To Cart</button></center>
          </div>
        </div>
        <div class="row">
            <div class="col-sm-3">
              <div class="well">
                <img class="card-img-top" src="watch_2.png" alt="Card image cap">
                <center><h4>GMT-MASTER</h4>
                <p>Price:1,232,000</p>
                <button type="button" class="btn btn-primary">Add To Cart</button></center>
              </div>
            </div>
            <div class="row">
                <div class="col-sm-3">
                  <div class="well">
                    <img class="card-img-top" src="img/watch_3.png" alt="Card image cap">
                    <center><h4>DAY-DATE 40</h4>
                    <p>Price:200000</p>
                    <button type="button" class="btn btn-primary">Add To Cart</button></center>
                  </div>
                </div>
       
      </div>
      
     
    
  </div>
</div>

</body>
</html>
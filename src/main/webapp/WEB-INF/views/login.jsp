<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
<p style = "color:red;">${errormessage}</p>
<div class = container>
 <form action = "login" method="POST">
 		<h2>Login Form</h2>
 		<div class="form-group">
 		<label for="name"><b>Username</b></label>
        <input name="name" type="text" /> <br> 
        <small id="emailHelp" class="form-text text-muted">We'll never share your username with anyone else.</small>
        </div>
        <div class="form-group">
        <label for="password"><b>Password</b></label>
        <input name="password" type="password" /><br> 
        </div>
        <input type="submit" class = "btn btn-primary" value = login />
    </form>
 </div>
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 </body>
</html>
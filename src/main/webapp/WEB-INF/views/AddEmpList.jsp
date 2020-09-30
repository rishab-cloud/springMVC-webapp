<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
<div class = container>
 <form:form  method="POST" commandName="employees">
 		<h2>Create New Employee</h2>
 		<form:hidden path="id"/>
 		<div class="form-group">
 		<form:label path="name"><b>Name</b></form:label>
        <form:input path="name" type="text" /> <br> 
        <small id="emailHelp" class="form-text text-muted">Name field mandatory</small>
        </div>
        <div class="form-group">
        <form:label path="role"><b>Role</b></form:label>
        <form:input path="role" type="text" /><br> 
        </div>
        <div class="form-group">
        <form:label path="project"><b>Project</b></form:label>
        <form:input path="project" type="text" /><br> 
        </div>
        <div>
        <input type="submit" class = "btn btn-success" value = Create />
        <a type="button" class = "btn btn-primary" href = "Emp-list">Cancel</a> 
        </div>
    </form:form>
 </div>
 <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
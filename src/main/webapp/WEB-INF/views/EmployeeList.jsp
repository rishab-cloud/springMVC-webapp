<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Employees</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
<p>Hi ${name} The Employees list:</p><br>
<div class="container">
<table class="table table-striped">
<caption>Employee details are</caption>
<thead>
<tr>
<th>ID</th>
<th>NAME</th>
<th>ROLE</th>
<th>PROJECT</th>
</tr>
</thead>
<tbody>
<c:forEach items="${EmpList}" var="emplist">
					<tr>
						<td>${emplist.id}</td>
						<td>${emplist.name}</td>
						<td>${emplist.role}</td>
						<td>${emplist.project}</td>
						<td><a type="button" class = "btn btn-primary" href = "UpdEmp-list?id=${emplist.id}">Modify</a></td>
						<td><a type="button" class = "btn btn-warning" href = "DelEmp-list?id=${emplist.id}">Delete</a></td>
					</tr>
				</c:forEach>
</tbody>


</table>
<div>
<a type = "button" class="btn btn-success" href = "AddEmp-list">Create</a>
</div>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>
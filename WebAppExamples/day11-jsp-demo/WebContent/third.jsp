<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>This page renders multiple employee data</h3>
	<!-- id, name and salary are the properties of Employee class, if not present you will get property not found exception-->
	<h4>Hello ${e1.name}, your id is ${e1.id} and salary is ${e1.salary}</h4>
	<h4>Hello ${e2.name}, your id is ${e2.id} and salary is ${e2.salary}</h4>
</body>
</html>
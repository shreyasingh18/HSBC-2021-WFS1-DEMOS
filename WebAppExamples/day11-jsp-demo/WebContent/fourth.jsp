<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
	<h2>This is fourth page</h2>
	<h3>Accessing data from request scope</h3>
	<c:forEach items = "${requestScope.emps}" var = "e">
		<p>Hello ${e.name}, Salary is: ${e.id}</p>
	</c:forEach>
	<hr />
	<h3>Accessing data from session scope</h3>
	<c:forEach items = "${sessionScope.emps}" var = "e">
		<p>Hello ${e.name}, Salary is: ${e.id}</p>
	</c:forEach>
	<h3>Value of x from request: ${requestScope.x}</h3>
	<h3>Value of x from session: ${sessionScope.x}</h3>
	<h3>Value of x from application: ${applicationScope.x}</h3>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<h3>This page renders multiple employee data</h3>
	<!-- id, name and salary are the properties of Employee class, if not present you will get property not found exception-->
	<h4>Hello ${e1.name}, your id is ${e1.id} and salary is ${e1.salary}</h4>
	<h4>Hello ${e2.name}, your id is ${e2.id} and salary is ${e2.salary}</h4>

	<hr />
	
	<h3>Accessing data from request scope</h3>
	<c:forEach items = "${requestScope.emps}" var = "e">
		<p>Hello ${e.name}, Salary is: ${e.id}</p>
	</c:forEach>
	<hr />
	<h3>Accessing data from session scope</h3>
	<c:forEach items = "${sessionScope.emps}" var = "e">
		<p>Hello ${e.name}, Salary is: ${e.id}</p>
	</c:forEach>
	
	<h3>This is creating table</h3>
	<table border = "1">
		<tr>
			<th>ID</th> <th>Name</th>
		</tr>
		<c:forEach items = "${sessionScope.emps}" var = "e">
			<tr>
				<td>${e.id}</td> <td>${e.name}</td>
			</tr>
		</c:forEach>
	</table>
	
	<h3>Value of x from request: ${requestScope.x}</h3>
	<h3>Value of x from session: ${sessionScope.x}</h3>
	<h3>Value of x from application: ${applicationScope.x}</h3>
	<a href = "fourth.jsp">Fourth Page</a>
</body>
</html>
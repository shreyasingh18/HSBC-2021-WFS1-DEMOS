<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello ${sessionScope.key1}, your phone number is ${sessionScope.key2}</h2>
	<h3>Session Id: <%=session.getId() %></h3>
	<a href = "LoggingOutServlet" >Logout</a>
</body>
</html>
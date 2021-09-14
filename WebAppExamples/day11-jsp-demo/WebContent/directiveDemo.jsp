<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Directive Demo</h1>
	<!-- using page to import LocalDate -->
	<%@page import = "java.time.LocalDate" %>
	<!-- using declarative element to declare some variables -->
	<%! int x = 10; %>
	<!-- using scriptlet to write java statements -->
	<%
		x++;
		int y = 10;
		y++;
	%>
	<!-- using expression element to print some expression -->
	value of x: <%=x %> <br />
	value of y: <%=y %> <br />
	value of date: <%=LocalDate.now()%>
	<br />
	<%@include file = "demo.txt" %>
	<br />
	<%@include file = "index.html" %>
</body>
</html>
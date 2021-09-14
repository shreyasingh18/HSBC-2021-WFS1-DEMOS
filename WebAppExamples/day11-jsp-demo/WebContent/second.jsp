<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>This is second JSP</h3>
	<p>Date and Time: ${abc} </p>
	<h3>Another way to print the value of abc is</h3>
	<p>Date and Time: <%=request.getAttribute("abc") %>
	
	<hr />
	<h3>Employee Form</h3>
	<form action = "SecondServlet" method = "POST">
		Id <input type = "text" name = "t1"> <br />
		Name <input type = "text" name = "t2"> <br />
		Salary <input type = "text" name = "t3"> <br />
		<input type = "submit" value = "submit">
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Welcome ${sessionScope.key1}</h2> <hr />
	
	<h3>Session Id: <%=session.getId() %></h3>
	<form action = "PhoneServlet" method = "post">
		Phone <input type = "text" name = "t2"> <br />
		<input type = "submit" value = "submit">
	</form>
	
</body>
</html>
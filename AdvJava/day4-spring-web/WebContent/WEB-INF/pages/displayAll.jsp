<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>All Employees Information</h3>
	${emps}
	<br />
	<form action = "store" method = "post">
		Name <input type = "text" name = "t1"> <br />
		Salary <input type = "text" name = "t2"> <br />
		<input type = "submit" value = "submit">
	</form>
</body>
</html>
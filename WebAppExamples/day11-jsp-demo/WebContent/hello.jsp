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
	<h1>Welcome to our first JSP program!</h1>
	<!-- out tag is used to print some expression -->
	<c:out value="Welcome to JSTL & < > ! We are using some entity character"></c:out>
	<c:if test="true">
		<p>This is inside if</p>
	</c:if>
	<c:forEach items="2,1,5,4,3" var="i">
		<p>Its iterating ${i}</p>
	</c:forEach>
</body>
</html>
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<h4>
		Welcome 2 JSP , Server TimeStamp :
		<%=LocalDateTime.now()%></h4>
	<h5>
		<a href="comments.jsp">Testing Comments</a>
	</h5>
	<h5>
		<a href="login.jsp">User Login</a>
	</h5>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	//JSP scriptlets - scripting element to add Java code in the JSP
	String email = request.getParameter("em");
	String pwd = request.getParameter("pass");
	out.print("Email " + email + " Password " + pwd);
	%>
</body>
</html>
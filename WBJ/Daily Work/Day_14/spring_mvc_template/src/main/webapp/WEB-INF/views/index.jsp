<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Server</title>
</head>
<body>
	<h5>
		Welcome to spring mvc!
	</h5>
	
	<h5>
	
	<c:url var="abc" value="/test/test1" />
	<a href="${abc}">Test Model And View for adding Model Attributes</a> </h5>
	<h5>
	
	<c:url var="abc" value="/test/test2" />
	<a href="${abc}">Test Model And View for adding Model Attributes</a> </h5>
</body>
</html>
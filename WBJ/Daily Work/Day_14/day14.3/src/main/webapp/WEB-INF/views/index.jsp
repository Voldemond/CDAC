<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--import JSTL supplied core tag library --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>Welcome to Spring MVC !!!!</h5>
	<h5>
	<%--http://host:port/ctx_path/test/test1 --%>
		<c:url var="abc" value="/test/test1" />
		<a href="${abc}">Adding Model Attributes using ModelAndView</a>
	</h5>
	<h5>
	<%--http://host:port/ctx_path/test/test2 --%>
		<c:url var="abc" value="/test/test2" />
		<a href="${abc}">Adding Model Attributes via Model Map</a>
	</h5>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p> your reservation is confirmed successfully. please,re-click the details.
	</p>
	First name:${reservation.firstName }<br>
	Last name:${reservation.lastName }<br>
	Gender:${reservation.gender }<br>
	Meals:
	<ul>
		<c:forEach var="meal" items="${reservation.food }">
		<li>${meal }</li>
		</c:forEach>
		
	</ul>
</body>
</html>
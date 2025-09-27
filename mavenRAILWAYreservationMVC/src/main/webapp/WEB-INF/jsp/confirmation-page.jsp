<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Your reservation is confirmed successfully.please, re-check the details.</p>
	First Name:${reservation.firstName }<br>
	Last Name:${reservation.lastName }<br>
	Gender: ${reservation.gender }<br>
	Meals:
	<ul>
		<c:forEach var="meal" items="${reservation.food }">
			<li>${meal }</li>
		</c:forEach>
	</ul>
	Leaving From:${reservation.cityFrom }<br>
	Going To:${reservation.cityTo }
</body>
</html>
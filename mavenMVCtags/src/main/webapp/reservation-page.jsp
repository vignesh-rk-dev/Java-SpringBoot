<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Form</title>

</head>
<body>
<h3>Railway Reservation Form</h3>

<form:form action="submitForm" modelAttribute="reservation">
	Firstname:<form:input path="firstName"/>
	<br><br>
	Lastname:<form:input path="lastName"/>
	<br><br>
	Gender:
	Male<form:radiobutton path="gender" value="male"/>
	Female<form:radiobutton path="gender" value="female"/>
	<br><br>
	<input type="submit" value="submit"/>
	</form:form>	
</body>
</html>
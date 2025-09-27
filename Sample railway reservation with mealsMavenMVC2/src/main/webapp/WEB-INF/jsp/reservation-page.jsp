<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Form</title>
</head>
<body>
<h3>Railway reservation form</h3>
<form:form action="submitForm" modelAttribute="reservation">
First name:<form:input path="firstName"/><br>
Last name:<form:input path="lastName"/><br>
Gender:
Male<form:radiobutton path="Gender" value="male"/>
Female<form:radiobutton path="Gender" value="female"/>
<br><br>
Meals:
BreakFast<form:checkbox path="Food" value="BreakFast"/>
Lunch<form:checkbox path="Food" value="Lunch"/>
Dinner<form:checkbox path="Food" value="Dinner"/><br><br>
<input type="submit" value="submit"/>
</form:form>

</body>
</html>
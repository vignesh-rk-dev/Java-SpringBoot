<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reservation Form</title>
</head>
<body>
	<form:form action="submitForm" modelAttribute="reservation">
	First name: <form:input path="firstName"/><br>
	Last name: <form:input path="lastName"/><br>
	Gender:
	Male<form:radiobutton path="gender" value="Male"/>
	Female<form:radiobutton path="gender" value="Female"/>
	<br><br>
	Meals:
	BreakFast<form:checkbox path="food" value="BreakFast"/>
	Lunch<form:checkbox path="food" value="Lunch"/>
	Dinner<form:checkbox path="food" value="Dinner"/>
	<br><br>
	Leaving from:<form:select path="cityFrom">
	<form:option value="Chennai" label="Chennai"/>
	<form:option value="Coimbatore" label="Coimbatore"/>
	<form:option value="Trichy" label="Trichy"/>
	<form:option value="Madurai" label="Madurai"/>
	<form:option value="Tenkasi" label="Tenkasi"/>
	<form:option value="Kanyakumari" label="Kanyakumari"/>
	</form:select>
	<br><br>
	Going to:<form:select path="cityTo">
	<form:option value="Chennai" label="Chennai"/>
	<form:option value="Coimbatore" label="Coimbatore"/>
	<form:option value="Trichy" label="Trichy"/>
	<form:option value="Madurai" label="Madurai"/>
	<form:option value="Tenkasi" label="Tenkasi"/>
	<form:option value="Kanyakumari" label="Kanyakumari"/>
	</form:select>
	<br><br>
	<input type="submit" value="submit"/>
	</form:form>
	
	
</body>
</html>
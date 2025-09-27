<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<style>
		.error{color:red}
	</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="helloagain" modelAttribute="temp">
	Username:<form:input path="name"/><br><br>
	Password:<form:password path="pass"/><br><br>
	
	<form:errors path="pass" cssClass="error"/><br><br>
	<input type="submit" value="submit"/>
	</form:form>
</body>
</html>
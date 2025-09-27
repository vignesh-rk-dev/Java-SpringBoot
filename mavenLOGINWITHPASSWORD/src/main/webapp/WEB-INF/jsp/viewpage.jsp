<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.error{color:red}
</style>
</head>
<body>
	<form:form action="helloagain" modelAttribute="emp">
	Username:<form:input path="name"/><br><br>
	Password:<form:input path="pass"/>
	<form:errors path="pass" cssClass="error"/><br><br>
	<input type="submit" value="submit">
	</form:form>
</body>
</html>
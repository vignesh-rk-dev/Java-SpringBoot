<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored ="false" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login page</title>
</head>
<body>
<p>******************************</p>
	<c:url value="/login" var="loginUrl"/>
	<form action="${loginUrl }" method="post">
		<c:if test="${param.error != null }">
		<p>
		Invalid username and password.
		</p>
		</c:if>
		<c:if test="${param.logout != null }">
		<p>
			You have been logged out.
		</p>
		</c:if>
		<p>
			<label for="username">Username</label>
			<input type="text" id="username" name="username"/>
		</p>
		<p>
			<label for="password">Password</label>
			<input type="password" id="password" name="password"/>
		</p>
		<p>
			<label for="remember"> Remember me</label>
			<input type="checkbox" name="remember"/>
		</p>
		<input type="hidden"
			name="${_csrf.parameterName }"
			value="${_csrf.token }"/>
			<button type="submit" class="btn">LOGIN</button>
		</form>
	</body>
</html>
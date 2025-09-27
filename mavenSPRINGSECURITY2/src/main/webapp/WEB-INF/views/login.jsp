<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginpagea</title>
</head>
<body>
	<c:url value="/login" var="loginUrl"/>
	<form action="${loginUrl}" method="post">
	<c:if test="${param.error != null }">
		<p>
			Invalid username or password.
		</p>
	</c:if>
	<c:if test="${param.logout !=null }">
		<p>
			You have successfully logged out.
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
	<input type="hidden"
	name="${_csrf.parameterName }"
	value="${_csrf.token }"/>
	<button type="submit" value="submit">Log in</button>
	</form>
</body>
</html>
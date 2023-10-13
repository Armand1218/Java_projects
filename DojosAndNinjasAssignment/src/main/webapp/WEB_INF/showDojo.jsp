<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojo Page</title>
</head>
<body>
	<h1><c:out value="${dojo.name}"></c:out> Location Ninjas</h1>
	<table>
		<tr>
			<th>First Name:</th>
			<th>Last Name:</th>
			<th>Age:</th> 	
		<tr>
			<c:forEach items="${dojo.ninjas}" var="ninja">
				<td><c:out value="${ninja.first_name}"></c:out></td>
				<td><c:out value="${ninja.last_name}"></c:out></td>
				<td><c:out value="${ninja.age}"></c:out></td>
			</c:forEach>	 
		</tr>
	</table>
</body>
</html>
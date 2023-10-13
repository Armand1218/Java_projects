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
<title>Add A Ninja</title>
</head>
<body>
	<h1>Add New Ninja!</h1>
		<form:form method="POST" action="/ninja/addNinja" modelAttribute = "ninja">
		<div>
			<form:label path="dojo">Name:</form:label>
			<form:errors path="dojo"></form:errors>
			<form:select path="dojo">
				<c:forEach items="${allDojos}" var="dojo">
					<option value="${dojo.id}">${dojo.name}</option>
				</c:forEach>
			</form:select>
		</div>
		<div>
			<form:label path="first_name">First Name:</form:label>
			<form:errors path="first_name"></form:errors>
			<form:input path="first_name"/>
		</div>
		
		<div>
			<form:label path="last_name">Last Name:</form:label>
			<form:errors path="last_name"></form:errors>
			<form:input path="last_name"/>
		</div>
		
		<div>
			<form:label path="age">Age:</form:label>
			<form:errors path="age"></form:errors>
			<form:input path="age"></form:input>
		</div>
		<button>Add Ninja</button>
	</form:form>
</body>
</html>
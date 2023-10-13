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
<title>Add a new Dojo</title>
</head>
<body>
	<h1>Create A Dojo!</h1>
	<form:form method="POST" action="/dojo/createDojo" modelAttribute = "dojo">
		<div>
			<form:label path="name">Name:</form:label>
			<form:errors path="name"></form:errors>
			<form:input path="name"/>
		</div>
		<button>Add Dojo</button>
	</form:form>
</body>
</html>
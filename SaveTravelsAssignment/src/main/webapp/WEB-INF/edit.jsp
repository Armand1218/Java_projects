<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Edit your Expenses</h1>
	<form:form action="/edit/${travel.id}" mode="post" modelAttribute="travel">
		<div>
			<form:label path="expense">Expense:</form:label><br>
			<form:errors path="expense" class="text-danger"></form:errors>
			<form:input path="expense"></form:input>
		</div>
		<div>
			<form:label path="vendor">Vendor:</form:label><br>
			<form:errors path="vendor" class="text-danger"></form:errors>
			<form:input path="vendor"></form:input>
		</div>
		<div>
			<form:label path="amount">Amount:</form:label><br>
			<form:errors path="amount" class="text-danger"></form:errors>
			<form:input path="amount"></form:input>
		</div>
		<div>
			<form:label path="description">Description:</form:label><br>
			<form:errors path="description" class="text-danger"></form:errors>
			<form:textarea path="description" rows="5"></form:textarea>
		</div>
		<div>
			<input type="submit" value="submit">
		</div>
	</form:form>
</body>
</body>
</html>
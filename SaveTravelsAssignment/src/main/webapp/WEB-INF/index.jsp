<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"crossorigin="anonymous"> 
<meta charset="UTF-8">
<title>Save Travels</title>
</head>
<body>
<h1>Save Travels</h1>
		<table class = "table">
			<thead>
				<tr>
					<th class="text-center">Expense</th>
					<th class="text-center">Vendor</th>
					<th class="text-center">Amount</th>
					<th class="text-center">Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var = "travel" items = "${travels}">
					<tr>
						<td class="text-center"><a href="/show/<c:out value="${travel.id}"></c:out>"><c:out value="${travel.expense}"></c:out></a></td>
						<td class="text-center"><c:out value="${travel.vendor}"></c:out></td>
						<td class="text-center">$<c:out value="${travel.amount}"></c:out></td>
						<td class="text-center"><a href="/edit/${travel.id}">Edit</a><a href="/travel/delete/${travel.id}"> delete</a></td>
					</tr>
				</c:forEach>
		</table>
		<h2>Add Travel</h2>
		<form:form action ="/addTravel" mode="post" modelAttribute="travel">
			<div>
				<form:label path="expense">Expense Name:</form:label><br>
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
				<form:textarea path="description"></form:textarea>
			</div>
			<div>
				<input type="submit" value="submit"></input>
			</div>
		</form:form>
</body>
</html>
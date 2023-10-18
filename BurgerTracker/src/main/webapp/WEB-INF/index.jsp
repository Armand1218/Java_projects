<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"crossorigin="anonymous"> 
<meta charset="UTF-8">
<title>Track your Burger!!</title>
</head>
<body>
	<h1>Burger Tracker</h1>
		<table class = "table">
			<thead>
				<tr>
					<th>Burger Name</th>
					<th>Restaurant Name</th>
					<th>Rating</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var = "burger" items = "${burgers}">
					<tr>
						<td><c:out value="${burger.name}"></c:out></td>
						<td><c:out value="${burger.restaurantName}"></c:out></td>
						<td><c:out value="${burger.rating}"></c:out></td>
						<td><a href="/edit/${burger.id}">Edit</a></td>
					</tr>
				</c:forEach>
		</table>
		<h2>Add Burger</h2>
		<form:form action ="/createBurger" mode="post" modelAttribute="burger">
			<div>
				<form:label path="name">Burger Name:</form:label><br>
				<form:errors path="name" class="text-danger"></form:errors>
				<form:input path="name"></form:input>
			</div>
			<div>
				<form:label path="restaurantName">Restaurant Name:</form:label><br>
				<form:errors path="restaurantName" class="text-danger"></form:errors>
				<form:input path="restaurantName"></form:input>
			</div>
			<div>
				<form:label path="rating">Rating:</form:label><br>
				<form:errors path="rating" class="text-danger"></form:errors>
				<form:input path="rating"></form:input>
			</div>
			<div>
				<form:label path="notes">Notes:</form:label><br>
				<form:errors path="notes" class="text-danger"></form:errors>
				<form:textarea path="notes"></form:textarea>
			</div>
			<div>
				<input type="submit" value="submit"></input>
			</div>
		</form:form>
</body>
</html>
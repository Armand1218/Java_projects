<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit your Entry</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css"> 
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h2><a href="/welcome">Back to Shelves</a></h2>
	<h1>Change your entry</h1>
		<div class="container">
			<form:form action="/books/${book.id}/edit" modelAttribute="book" class="form" method="put">
				<div class="form-row">			
					<form:label for="title" path="title">Title:</form:label><br>
					<form:errors path="title" class="error"></form:errors>
					<form:input path="title"></form:input>
				</div>
				<div class="form-row">
					<form:label for="author" path="author">Author:</form:label><br>
					<form:errors path="author" class="text-danger"></form:errors>
					<form:input path="author"></form:input>
				</div>
				<div class="form-row">
					<form:label for="thoughts" path="thoughts">My Thoughts:</form:label><br>
					<form:errors path="thoughts" class="text-error"></form:errors>
					<form:textarea path="thoughts"></form:textarea>
				</div>
				<div>
					<form:errors path="user" class="errors"></form:errors>
					<form:input type="hidden" path="user" value="${user.id}" class="form-control"></form:input>
				</div>
				<div class="form-row">
					<input type="submit" value="submit" class="btn-primary"></input>
				</div>
			</form:form>
			<button class="btn-warning"><a href="/books/${book.id}/delete">Delete Book</a></button>
		</div>
</body>
</html>
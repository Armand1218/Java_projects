<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Books Assignment</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/style.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
<a href="/welcome">Back to Shelves</a>
	<div class="container">
		<h1><c:out value="${book.title}"></c:out></h1>
		<h3>Books from everyone shelves:</h3>
		<div class="container">
			<p><c:out value="${book.thoughts}"></c:out></p>
		</div>
		<c:if test="${user==book.user}">
			<td><a href="books/${book.id}/edit">Edit</a> <a href="books/${book.id}/delete">Delete</a></td>
		</c:if>
	</div>
</body>
</html>
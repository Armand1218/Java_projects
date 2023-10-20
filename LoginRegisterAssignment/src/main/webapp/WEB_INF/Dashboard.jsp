<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ page isErrorPage="true" %>
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
	<div>
		<h1>Welcome, <c:out value="${user.userName}"/>!</h1>
		<a href="/logout">Logout</a>
		<a href="/addBook">Add a Book</a>
		<h3>Books from everyone shelves:</h3>
		<table>	
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author</th>
				<th>Owner</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="book" items="${books}">
				<c:if test="${user.id!=book.borrower.id}">
				<tr>
					<td><c:out value="${book.id}"></c:out></td>
					<td><a href="books/${book.id}"><c:out value="${book.title}"></c:out></a></td>
					<td><c:out value="${book.author}"></c:out></td>
					<td><c:out value="${book.user.userName}"></c:out></td>
					<c:if test="${user==book.user}">
						<td><a href="books/${book.id}/edit">Edit</a> <a href="books/${book.id}/delete">Delete</a></td>
					</c:if>
					<c:if test="${user!=book.user}">
						<td><a href="books/${book.id}/borrow">Borrow</</a></td>
					</c:if>
				</tr>
				</c:if>
			</c:forEach>
		</table>
		
		<h3>Books I'm Borrowing</h3>
		<table class="table">	
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author</th>
				<th>Owner</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="book" items="${books}">
				<c:if test="${user.id==book.borrower.id}">
				<tr>
					<td><c:out value="${book.id}"></c:out></td>
					<td><a href="books/${book.id}"><c:out value="${book.title}"></c:out></a></td>
					<td><c:out value="${book.author}"></c:out></td>
					<td><c:out value="${book.user.userName}"></c:out></td>
					<c:if test="${user!=book.user}">
						<td><a href="books/${book.id}/return">Return</a></td>
					</c:if>
				</tr>
				</c:if>
			</c:forEach>
		</table>
	</div>
</body>
</html>
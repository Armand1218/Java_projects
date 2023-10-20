<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Travels</title>
</head>
<body>
	<h1>Your Travel Expense</h1>
	<p><a href="/">Back</a></p>
	<table>
		<tbody>
			<tr>
				<td>Expense Name:</td>
				<td><c:out value="${travel.expense}"></c:out></td>
			</tr>
			<tr>
				<td>Expense Description:</td>
				<td><c:out value="${travel.description}"></c:out></td>
			</tr>
		<tr>
			<td>Vendor:</td>
			<td><c:out value="${travel.vendor}"></c:out></td>
		</tr>
		<tr>
			<td>Amount Spent:</td>
			<td>$<fmt:formatNumber type="number" minFractionDigits="2" value="${travel.amount}"/></td>
		</tr>
		</tbody>
	</table>
</body>
</html>
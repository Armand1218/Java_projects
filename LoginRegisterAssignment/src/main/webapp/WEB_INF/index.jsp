<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<h1>Book Club</h1>
<p>A place for friends to share thoughts on books.</p>

<form:form action="/register" method="post" modelAttribute="newUser">

	<table>
		<thead>
	    	<tr class="login">
	            <td colspan="2">Register</td>
	        </tr>
	    </thead>
	    <thead>
	    	<tr class="login">
	            <td class="float-left">User Name:</td>
	            <td class="float-left">
	            	<form:errors path="userName" class="text-danger"></form:errors>
					<form:input class="input" path="userName"/>
	            </td>
	        </tr>
	        <tr class="login">
	            <td class="float-left">Email:</td>
	            <td class="float-left">
	            	<form:errors path="email" class="text-danger"></form:errors>
					<form:input class="input" path="email"/>
	            </td>
	        </tr>
	        <tr class="login">
	            <td class="float-left">Password:</td>
	            <td class="float-left">
	            	<form:errors path="password" class="text-danger"></form:errors>
					<form:input type="password" class="input" path="password"/>
	            </td>
	        </tr>
	        <tr class="login">
	            <td class="float-left">Confirm PW:</td>
	            <td class="float-left">
	            	<form:errors path="confirm" class="text-danger"></form:errors>
					<form:input type="password" class="input" path="confirm"/>
	            </td>
	        </tr>
	        <tr class="login">
	        	<td colspan=2><input class="input" type="submit" value="Submit"/></td>
	        </tr>
	    </thead>
	</table>
</form:form>

<form:form action="/login" method="post" modelAttribute="newLogin">

	<table>
		<thead>
	    	<tr>
	            <td colspan="2">Log In</td>
	        </tr>
	    </thead>
	    <thead>
	        <tr>
	            <td class="float-left">Email:</td>
	            <td class="float-left">
	            	<form:errors path="email" class="text-danger"/>
					<form:input class="input" path="email"/>
	            </td>
	        </tr>
	        <tr>
	            <td class="float-left">Password:</td>
	            <td class="float-left">
	            	<form:errors path="password" class="text-danger"/>
					<form:input type="password" class="input" path="password"/>
	            </td>
	        </tr>
	        <tr>
	        	<td colspan=2><input class="input" type="submit" value="Submit"/></td>
	        </tr>
	    </thead>
	</table>
</form:form>
</body>
</html>
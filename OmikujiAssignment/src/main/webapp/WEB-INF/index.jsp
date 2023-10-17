<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji Assignment!</title>

</head>
<body>

	<h1>Send An Omikuji</h1>
	<form action="/addData" method="post">
		<div>
			<label for="anyNumber">Pick any number from 5 to 25:</label><br/>
			<input type="number" name="number"/>
		</div>
		
		<div>
			<label for="anyCity">Enter the name of any city:</label><br/>
			<input type="text" name="city"/>
		</div>

		<div>
			<label for="anyPerson">Enter the name of any real person:</label><br/>
			<input type="text" name="person"/>
		</div>
		
		<div>
			<label for="anyHobby">Enter professional endeavor or hobby:</label><br/>
			<input type="text" name="hobby"/>
		</div>
		
		<div>
			<label for="anyThing">enter any type of living thing:</label><br/>
			<input type="text" name="thing"/>
		</div>
		
		<div>
			<label for="anySay">Say something nice to someone:</label><br/>
			<textarea name="message" id="" cols="30" rows="10"></textarea><br/>
		</div>
		
		<p>Send and show a friend!</p>
		<input type="submit" value="send">
	</form>
</body>
</html>
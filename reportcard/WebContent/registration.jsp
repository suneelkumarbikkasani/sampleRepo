<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Data</title>
</head>
<style>
div.ex {
	text-align: right width:300px;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body>
	<h1>Registration Form</h1>
	<div class="ex">
		<form action="RegistrationController" method="post">
			<table style="with: 50%">
				<tr>
					<td>Full Name</td>
					<td><input type="text" name="fullname" /></td>
				</tr>
				<tr>
					<td>Telugu</td>
					<td><input type="text" name="telugu" /></td>
				</tr>
				<tr>
					<td>Hindi</td>
					<td><input type="text" name="hindi" /></td>
				</tr>
				<tr>
					<td>English</td>
					<td><input type="text" name="english" /></td>
				</tr>
				<tr>
					<td>Maths</td>
					<td><input type="text" name="maths" /></td>
				</tr>
				<tr>
					<td>Science</td>
					<td><input type="text" name="science" /></td>
				</tr>
				<tr>
					<td>Social</td>
					<td><input type="text" name="social" /></td>
				</tr>

			</table>
			<input type="submit" value="Add marks to Database" />
		</form>
		<br>

		<!-- 	create a student table in test database before registering this form -->
		<!-- 		<br> Syntax : <br> -->
		<!-- 		<i>create table student(name varchar(100), userName varchar(100), pass varchar(100), addr varchar(100), age int, qual varchar(100), percent varchar(100), year varchar(100));</i> -->


	</div>
</body>
</html>
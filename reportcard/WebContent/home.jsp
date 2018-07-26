<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display</title>
<style>
table#nat{
	width: 50%;
	background-color: #c48ec3;
}
</style>
</head>
<body>  
<% 
	String name =  request.getParameter("fullname");
	String tel = request.getParameter("telugu");
	String hin = request.getParameter("hindi");
	String eng = request.getParameter("english");
	String mat = request.getParameter("maths");
	String sci = request.getParameter("science");
	String soc = request.getParameter("social");

%>

<table id ="nat">
<tr>
	<td>Full Name</td>
	<td><%= name %></td>
</tr>
<tr>
	<td>Telugu</td>
	<td><%= tel %></td>
</tr>
<tr>
	<td>Hindi</td>
	<td><%= hin %></td>
</tr>
<tr>
	<td>English</td>
	<td><%= eng %></td>
</tr>
<tr>
	<td>Maths</td>
	<td><%= mat %></td>
</tr>
<tr>
	<td>Science</td>
	<td><%= sci %></td>
</tr>
<tr>
	<td>Social</td>
	<td><%= soc %></td>
</tr>

<!-- <tr> -->
<!-- 	<td>Total</td> -->
<%-- 	<td><%= tot %></td> --%>
<!-- </tr> -->
<!-- <tr> -->
<!-- 	<td>Average</td> -->
<%-- 	<td><%= avg %></td> --%>
<!-- </tr> -->

</table>

<br>


</body>
</html>
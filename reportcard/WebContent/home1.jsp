<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
	String id = request.getParameter("userid");
	String driver = "com.mysql.jdbc.Driver";
	String connectionUrl = "jdbc:mysql://localhost:3306/";
	String database = "sys";
	String userid = "root";
	String password = "administrator";
	try {
		Class.forName(driver);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<body>

	<h1 align="center">ALL STUDENTS RECORDS</h1>
	<table border="1">
		<tr>
			<td>NAME</td>
			<td>TELUGU</td>
			<td>HINDI</td>
			<td>ENGLISH</td>
			<td>MATHS</td>
			<td>SCIENCE</td>
			<td>SOCIAL</td>
			<td>TOTAL</td>
			<td>AVERAGE</td>

		</tr>
		<%
			try {
				connection = DriverManager.getConnection(connectionUrl + database, userid, password);
				statement = connection.createStatement();
				String sql = "select * from studentreport";
				resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
		%>
		<tr>
			<td ALIGN="center"><%=resultSet.getString("student_name")%></td>
			<td ALIGN="center"><%=resultSet.getString("telugu")%></td>
			<td ALIGN="center"><%=resultSet.getString("hindi")%></td>
			<td ALIGN="center"><%=resultSet.getString("english")%></td>
			<td ALIGN="center"><%=resultSet.getString("maths")%></td>
			<td ALIGN="center"><%=resultSet.getString("science")%></td>
			<td ALIGN="center"><%=resultSet.getString("social")%></td>
			<td ALIGN="center"><%=resultSet.getString("total")%></td>
			<td ALIGN="center"><%=resultSet.getString("average")%></td>

		</tr>
		<%
			}
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		%>
	</table>
</body>
</html>
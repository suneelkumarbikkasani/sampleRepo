
<%@page import="bean1.RegisterDao1"%>
<jsp:useBean id="obj" class="bean1.User"/>

<jsp:setProperty property="*" name="obj"/>

<%
int status=RegisterDao1.register(obj);
if(status>0)
out.print("MARKS SUCCESSFULLY STORED IN DATABASE");

%>
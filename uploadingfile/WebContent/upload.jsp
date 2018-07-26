<%@ page import="com.oreilly.servlet.MultipartRequest" %>  
<%  
MultipartRequest m = new MultipartRequest(request, "");  
out.print("successfully uploaded");  
  
%>  
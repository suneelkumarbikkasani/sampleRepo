package student;


import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Register extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sid=request.getParameter("userName");
		int t = request.getIntHeader("telugu");
		int h = request.getIntHeader("hindi");
		int e = request.getIntHeader("english");
		int m = request.getIntHeader("maths");
		int sc = request.getIntHeader("science");
		int so = request.getIntHeader("social");
		
		int tot = t+h+e+m+sc+so;
		
		float avg = tot/6;
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","administrator");
		PreparedStatement ps=con.prepareStatement("insert into studentreport values(?,?,?,?,?,?,?,?,?,?)");
		ps.setString(1,sid);
		ps.setInt(2,t);
		ps.setInt(3,h);
		ps.setInt(4,e);
		ps.setInt(5,m);
		ps.setInt(6,sc);
		ps.setInt(7,so);
		ps.setInt(8, tot);
		ps.setFloat(9, avg);;
		
		
		int i=ps.executeUpdate();
		if(i>0)
		out.print("Data successfully stored in Database");
		
			
		}catch (Exception e2) {System.out.println(e2);}
		
		out.close();
	}

}

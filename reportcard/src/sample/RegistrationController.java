package sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("fullname");
		String tel= request.getParameter("telugu");
		String hin = request.getParameter("hindi");
		String eng = request.getParameter("english");
		String mat = request.getParameter("maths");
		String sci = request.getParameter("science");
		String soc = request.getParameter("social");
		
		int t = Integer.parseInt(tel);
		int h = Integer.parseInt(hin);
		int engl = Integer.parseInt(eng);
		int m = Integer.parseInt(mat);
		int sc = Integer.parseInt(sci);
		int so = Integer.parseInt(soc);
		int tot = t+h+engl+m+sc+so;
		float avg = tot/6;
		
		if(name.isEmpty()||tel.isEmpty()||hin.isEmpty()||eng.isEmpty()||mat.isEmpty()||sci.isEmpty())
		{
			RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);
		}
		else
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "administrator"); // create new connection with test database
			
			String query="insert into studentreport values(?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(query);  
			
			ps.setString(1, name);
			ps.setInt(2, t);
			ps.setInt(3, h);
			ps.setInt(4, engl);
			ps.setInt(5, m);
			ps.setInt(6, sc);
			ps.setInt(7, so);
			ps.setInt(8, tot);
			ps.setFloat(9, avg);;
			
			
			
			ps.executeUpdate(); 
			System.out.println("successfuly inserted");
			ps.close();
			con.close();
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			} 
			RequestDispatcher rd = request.getRequestDispatcher("home2.jsp");
			rd.forward(request, response);
		}
	}
}

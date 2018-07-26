package bean1;

import java.sql.*;

public class RegisterDao1 {

	public static int register(User u){
		int status=0;
		try{
			Connection con=ConnectionProvider1.getCon();
			System.out.println(con);
            PreparedStatement ps=con.prepareStatement("insert into studentreport values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1,u.getUname());
			ps.setInt(2,u.getTel());
			ps.setInt(3,u.getHin());
			ps.setInt(4,u.getEng());
			ps.setInt(5,u.getMat());
			ps.setInt(6,u.getSci());
			ps.setInt(7,u.getSoc());
			
//			ps.setInt(8,u.getTot());
//			ps.setFloat(9, u.getAvg());
			
			status=ps.executeUpdate();
		}catch(Exception e){}
		
		return status;
	}
}

package bean;
import java.sql.*;
public class LoginDao {

	public static boolean validate(LoginBean bean){
		boolean status=false;
		try{
			Connection con=ConnectionProvider.getCon();
			System.out.println(con);
			PreparedStatement ps=con.prepareStatement("select * from sys.user432 where email=? and pass=?");
			System.out.println(bean.getEmail());
			System.out.println(bean.getPass());
			ps.setString(1,bean.getEmail());
			ps.setString(2,bean.getPass());
			
			ResultSet rs=ps.executeQuery();
			
			status=rs.next();
			System.out.println(status);
			
		}catch(Exception e){}
		return status;
	}
}

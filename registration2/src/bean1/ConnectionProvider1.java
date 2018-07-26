package bean1;

import java.sql.*;
import static bean1.Provider.*;

public class ConnectionProvider1 {
	static Connection con=null;
	static{
		try{
			Class.forName(DRIVER);
			con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);
			}catch(Exception e){}
	}
	public static Connection getCon(){
		return con;
	}
}

package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBUtil {
	public Connection createConnection() throws Exception{
		String url = "jdbc:mysql://localhost:3306/mindtree";
		String userName = "root";
		String password = "root";
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, userName, password);
	
		return con;
	}
}



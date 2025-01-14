package in.mvc.dbCon;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","password");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}

package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	static public Connection DBConnect() throws ClassNotFoundException, SQLException {
		//1.Đăng ký divew
		Class.forName("com.mysql.jdbc.Driver");
		//2. Mở kết nối
		//2.1. Chuoi két nối
		String strConn = "jdbc:mysql://localhost:3306/coffeeABC";
		 //2.2. Mớ kết nối
		Connection conn= DriverManager.getConnection(strConn, "root", "");
		return conn;		 
	}
	
}

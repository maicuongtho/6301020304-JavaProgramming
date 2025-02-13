package vn.edu.tinhoc123.CoffeeMan.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	static public Connection getConnection(String dbName, String user, String pass) {
		//1. Mở kết nối
		//1.1. Chuoi két nối
		String strConn = "jdbc:mysql://localhost:3306/"+dbName;
		 //1.2. Mớ kết nối
		Connection conn;
		try {
			conn = DriverManager.getConnection(strConn, user, pass);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;		 
	}

}

package DAL;

import java.sql.Connection;
import java.sql.SQLException;

import Model_DTO.NhanVien;
import Utils.DBUtils;

public class NhanVienDAL {
	Connection conn;
	public  NhanVienDAL() {
		try {
			conn =DBUtils.DBConnect();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	public boolean AddNew(NhanVien nv) {
		
		return true;
	}
	public  boolean Delete(int id) {
		
		return true;
	}
	public  boolean Login(String id, String pass) {
		
		return true;
	}
	
}

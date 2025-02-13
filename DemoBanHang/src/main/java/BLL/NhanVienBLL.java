package BLL;

import DAL.NhanVienDAL;
import Model_DTO.NhanVien;

public class NhanVienBLL {
	NhanVienDAL nvDAL;
	public boolean ThemMoi(NhanVien nv)
	{
		// cac xl khac o day
		boolean kq=nvDAL.AddNew(nv);
		return kq;
	}
	public boolean checkLogin(String tenDN, String matkhau) {
		// kiem tra tinh dung dan
		// vd: ten rong khong, co dung format khong, ...
		
		// thoa man roi, thi ta goi ham dich vuj o tan dal
		/// ... 
		return nvDAL.Login(tenDN, matkhau);
	}
}

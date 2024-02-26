/**
 * 
 */
package thomc;

import java.util.Scanner;

public class ChuongTrinhChinh {
	public static void main(String[] args) {
		int namSinh;
		String hoTen;
		//Chuẩn bị nhập
		Scanner banPhim = new Scanner(System.in);
		
		System.out.print("Họ và Tên:");
		hoTen= banPhim.nextLine();
		
		System.out.print("Năm sinh:");
		namSinh= banPhim.nextInt();
		
		int tuoi = 2024- namSinh +1;
		
		System.out.print("Tuổi của bạn là: " + String.valueOf(tuoi));
		
		SinhVienNTU sv1 = new SinhVienNTU();

	}

}

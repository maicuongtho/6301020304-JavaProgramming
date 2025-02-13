package ntu.maicuongtho;

import java.util.Scanner;

public class CTTinhTong {

	public static void main(String[] args) {
		//In ra một dòng tiêu đề App
		System.out.print("CT TINH TONG \n");
		
		//Chuẩn bị cho việc nhập
		Scanner banPhim = new Scanner(System.in);
		
		//In dong huong nhan Moi nhap A
		System.out.println("Mời nhập a: ");
		double a= banPhim.nextDouble();
		System.out.println("Mời nhập b: ");
		double b= banPhim.nextDouble();
		// Tín toán
		double tong = a+b;
		//
		System.out.print("Tổng là: ");
		System.out.print(tong);
		
	}

}

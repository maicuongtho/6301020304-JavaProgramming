import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		// Khai báo các biến cần thiết
		int a, b, tong;
		// Chuẩn bị cho nhập dữ liệu
		Scanner banPhim = new Scanner(System.in);
							//System.in đại diện cho thiết bị nhập chuẩn (Bàn phím)
		// Nhập dữ liệu
			//-in HD cho User
		System.out.println("---- CT TINH TONG 2 SO NGUYEN -------");
		System.out.print("a = ");
			// đợi User nhập, lấy dữ liệu và cất vào biến a
		a = banPhim.nextInt();
		System.out.print("b = ");
		// đợi User nhập, lấy dữ liệu và cất vào biến a
		b= banPhim.nextInt();
		
		// Tính tổng
		tong = a + b;
		
		// Xuất kết quả
		System.out.print("Tổng là = " + tong);
	}// end of main
}// end of class

import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		// Khai báo các biến cần thiết
		int a=0, b=0, tong=0;
		// Chuẩn bị cho nhập dữ liệu
		Scanner banPhim = new Scanner(System.in);
							//System.in đại diện cho thiết bị nhập chuẩn (Bàn phím)
		// Nhập dữ liệu
			//-in HD cho User
		System.out.println("---- CT TINH TONG 2 SO NGUYEN -------");
		while(true)
		{
			System.out.print("a = ");
			try {
				a = banPhim.nextInt();
			}catch (Exception e) {
				System.out.print("Yc nhập số nguyên [0-100]");
			}
			if ((a>0) && (a<100)) break;
		}
		
		System.out.print("b = ");
		// đợi User nhập, lấy dữ liệu và cất vào biến a
		b= banPhim.nextInt();
		banPhim.close();
		// Tính tổng
		tong = a + b;
		
		// Xuất kết quả
		System.out.print("Tổng là = " + tong);
		
		
		
	}// end of main
}// end of class

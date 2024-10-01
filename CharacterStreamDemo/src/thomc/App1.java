package thomc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App1 {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("songque.txt"); 
		char buff[] = null;
		buff= new char[10]; // mảng 10 ký tự
		fr.read(buff);      // đọc file cất vào mảng này (10 ký tự)
		fr.close();			//đóng file
		for (int i=0; i<10;i++) // in ra màn hình
			System.out.print(buff[i]);
		
								// hoặc chuyển sang kiểu chuỗi để in
		System.out.print(String.valueOf(buff));
	}

}

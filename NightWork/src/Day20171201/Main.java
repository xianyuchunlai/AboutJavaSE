package Day20171201;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		long a = System.currentTimeMillis();
		Scanner input = new Scanner(System.in);
		System.out.println("�������û���");
		String UserDate = input.nextLine();
		System.out.println("����������");
		String passWord = input.nextLine();
		
		long l = System.currentTimeMillis();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = df.format(l);
		System.out.println(time);
		
		System.out.println("�ó���������ʱ"+(float)(l-a)/1000+"��");
		
		
		
		
		
		
		
		
		
		
		
		
		
		input.close();
	}

}

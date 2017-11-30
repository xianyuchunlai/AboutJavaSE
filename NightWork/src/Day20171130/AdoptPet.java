package Day20171130;

import java.util.Scanner;

public class AdoptPet {

	public static void main(String[] args) {
		System.out.println("欢迎来到宠物商店");
		System.out.println("请给您要领养的宠物取个名字");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("请选择要领养的宠物类型：(1,狗狗 2，企鹅)");
		int type= input.nextInt();
		if (type ==1) {
			System.out.println("选择狗狗的性别");
			
			
		} else if (type==2)  {
			System.out.println("选择企鹅的性别；1.Q仔，2Q妹");
			int genderin= input.nextInt();
			if (genderin==1) {
				String gender ="Q仔";
				System.out.println("我的名字叫"+name+"健康值是100"+"和主人的亲密度是0"+"性别是"+gender);
			} else if (genderin==2) {
				String gender ="Q妹";
				System.out.println("我的名字叫"+name+"健康值是100"+"和主人的亲密度是0"+"性别是"+gender);
			} 
			
		}else {
			System.out.println("输入错误，该类型不存在");
		}
		
	}

}

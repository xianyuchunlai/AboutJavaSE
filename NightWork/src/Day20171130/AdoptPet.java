package Day20171130;

import java.util.Scanner;

public class AdoptPet {

	public static void main(String[] args) {
		System.out.println("��ӭ���������̵�");
		System.out.println("�����Ҫ�����ĳ���ȡ������");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.println("��ѡ��Ҫ�����ĳ������ͣ�(1,���� 2�����)");
		int type= input.nextInt();
		if (type ==1) {
			System.out.println("ѡ�񹷹����Ա�");
			
			
		} else if (type==2)  {
			System.out.println("ѡ�������Ա�1.Q�У�2Q��");
			int genderin= input.nextInt();
			if (genderin==1) {
				String gender ="Q��";
				System.out.println("�ҵ����ֽ�"+name+"����ֵ��100"+"�����˵����ܶ���0"+"�Ա���"+gender);
			} else if (genderin==2) {
				String gender ="Q��";
				System.out.println("�ҵ����ֽ�"+name+"����ֵ��100"+"�����˵����ܶ���0"+"�Ա���"+gender);
			} 
			
		}else {
			System.out.println("������󣬸����Ͳ�����");
		}
		
	}

}

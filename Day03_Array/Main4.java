import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		//��������ķ�ʽһ��
		int[] scores = {98,99,94,56,87};
		/*
		 * scores���Ǳ�ʶ������������������ 
		 * int��ʾ���������Դ�ŵ�����
		 * int[]��ʾ������������
		 * 
		 * {}�е����ݣ����������Ԫ��
		 * 98�������е�Ԫ�أ��������������
		 * �±꣺Ԫ���������е�λ�ã���0��ʼ����
		 * ���������һ��Ԫ�ص��±�Ϊ������ĳ��� - 1
		 */
		
		//ȡ���������±�Ϊ0��Ԫ�أ���ֵ��b
		int b = scores[0];
		System.out.println(b);
		
		//��������ķ�ʽ����
		int[] d = new int[3];
		
		Scanner input = new Scanner(System.in);
		
		//d.length��ʾ����d�ĳ���
		for (int i = 0; i < d.length; i++) {
			System.out.println("�������" + (i + 1) + "���ɼ���");
			d[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(d));
//		d[4] = 100;
		input.close();
	}
}

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������");
//		int sum = input.nextInt();
//		for (int i = 0; i <= sum; i++) {
//			System.out.println(i + "+" + (sum - i) + "=" + sum);
//		}
//		for(int i = 0; i <= sum; i++) {
//			for(int j = sum; j >= 0; j--) {
//				if(i + j == sum) {
//				System.out.println(i + "+" + j + "=" + sum);
//				}
//			}
//		}
		
//		for(int i = 0, j = sum; i <= sum; i++, j--) {
//			System.out.println(i + "+" + j + "=" + sum);
//		}
		
//		for(int i = 0; i < 5; i++) {
//			int score = input.nextInt();
//			//ѭ������ɼ�
//			//��һ�������ж��Ƿ�Ϊ����
//			if(score < 0) {
//				System.out.println("�������");
//				//ʹ��break����ѭ��
//				break;
//			}
//		}
		
		int people = 0;
		for(int i = 0; i < 10; i++) {
			//ѭ������ɼ�����ɼ�����80��people++
			int javaScore = input.nextInt();
			if(javaScore < 80) {
				continue;
			}
			people++;
		}
		System.out.println("80�����ϵ�������" + people);
		
		
		
		input.close();
	}
}

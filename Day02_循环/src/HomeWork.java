import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
			System.out.println("******************\n  ***  JAVA  ***\n    ******************");
		
		int sum = 189;
		//����189��������ٵ�100.50.30.10.5.1���
		for (int i = 1; i <= sum / 100; i++) {
			for (int j = 1; j <= sum / 50; j++) {
				for(int k = 1; k <= sum / 20; k++) {
					for(int m = 1; m <= sum / 10; m++) {
						for(int n = 1; n <= sum / 5; n++) {
							for(int r = 1; r <= sum / 1; r++) {
								if(100 * i + 50 * j + 20 * k + 10 * m + 5 * n + 1 * r == sum) {
									System.out.println("100��ֵ��" + i);
									System.out.println("50��ֵ��" + j);
									System.out.println("20��ֵ��" + k);
									System.out.println("10��ֵ��" + m);
									System.out.println("5��ֵ��" + n);
									System.out.println("1��ֵ��" + r);
								}
							}
						}
					}
				}
			}
		}
		
		//�ж���������������ż��
		if(sum % 2 == 0) {
			System.out.println("��ż��");
		}else {
			System.out.println("������");
		}
		
		if(sum <= 50) {
			System.out.println(sum * 0.15);
		}else {
			System.out.println(sum * 0.15 + (sum - 50) * 0.25);
		}
		
		//�ж�һ������Ƿ�������
//		System.out.println("������һ����ݣ�");
//		Scanner input = new Scanner(System.in);
//		int sc = input.nextInt();
//		if(sc % 4 == 0 && sc % 100 != 0 || sc % 400 == 0) {
//			System.out.println(sc + "��������");
//		}else {
//			System.out.println(sc + "�겻������");
//		}
//		input.close();
		
		//10��ÿ��ȡһ�룬ʲôʱ�����ȡ��
		int t = 1000000000;
		int count = 0;
		while(t > 0 ) {
			t /= 2;
			count++;
		}
		System.out.println(count);
	}
}

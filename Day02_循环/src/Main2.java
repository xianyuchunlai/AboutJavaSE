import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		
//		System.out.println("1");
		
		/*
		 * whileѭ��
		 * ���ж������е����ݣ��Ƿ�Ϊtrue   ���Ϊtrue��ִ�д��������������
		 * Ȼ�����ж������е������Ƿ�Ϊtrue����������ظ�ִ��
		 * �������е�����Ϊfalseʱ��ѭ��ֹͣ
		 */
		
		
//		int i = 50;
//		while(i < 50) {
//			//С������������ݽ�ѭ������
//			//��������������ݽ�ѭ����
//			System.out.println(i);		
			//ѭ��������Ϊ������ѭ������ֹ������ѭ��
//			i = i + 1;
//			i++;
//			i = i * 7;
//			i *= 7;
//		}
		
//		int progress = 1;
//		do {
//			System.out.println(progress);
//			progress += 2;
//		}while(progress < 10);
		
		/*
		 * do while��while������
		 * do while��ִ��һ��ѭ�������ж�
		 * while���ж���ִ��ѭ����
		 */
//		int a = 1;
//		int count = 0;
//		while(a <= 100) {
//			count++;
//			System.out.println("��" + count + "�Σ��ú�ѧϰ��������");
//			a++;
//		}
		
		
		/*
		 * int j = 0;���ó�ʼ����
		 * j < 100��ѭ������
		 * j++;ѭ������
		 * {}�е����ݣ�ѭ����
		 */
		for (int j = 100; j < 100; j++) {
			System.out.println("��" + (j + 1) + "�Σ��ú�ѧϰ��������");
		}
		
		/*while(true) {}
		for(;;) {
			
		}
		������������ѭ��
		*/
		
		int f = 0;
		for(; f < 10; f++) {
			
		}
		for(;f < 10; f += 5) {
			
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println("���������ſγɼ�");
		//������仰����õ�����̨��������ݣ����ǽ���һ������ȥ���ܵõ�����
		int sum = 0;
		for(int i = 0;i < 5; i++) {
			System.out.println("��" + (i + 1) + "��:");
			int sc = input.nextInt();
			System.out.println("��" + (i + 1) + "�ſεĳɼ���" + sc);
			sum = sum + sc;
		}
		int avg = sum / 5;
		System.out.println("���ſε�ƽ��ֵ��" + avg);
		input.close();
	}
}

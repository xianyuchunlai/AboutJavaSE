import java.util.Scanner;

public class Main5Sort {
	public static void main(String[] args) {
		/*
		 * ����һ�������������ճɼ�
		 */
		int[] scores = new int[5];
		Scanner input = new Scanner(System.in);
//		for (int i = 0; i < scores.length; i++) {
//			System.out.println("��" + i + "���ɼ�");
//			scores[i] = input.nextInt();
//		}
//		Arrays.sort(scores);
//		System.out.println(Arrays.toString(scores));
		
		int max = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("�������" + i + "��ѧ���ĳɼ���");
			scores[i] = input.nextInt();
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		System.out.println(max);
		input.close();
	}
	
}

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		 * ���ĸ��༶��ÿ���༶��5��ѧ��
		 * ����ÿ���༶��Ҫѭ��һ��  �ڰ༶ѭ������ȥ����û��ѧ���ĳɼ�
		 */
		
		//��һ��ѭ����ÿ��ѭ����ʾһ���༶
		for(int i = 1; i < 5; i++) {
			//�ڶ���ѭ����ʾҪ����һ��ѧ���ɼ�
			double sum = 0;
			for(int j = 1; j < 6; j++) {
				//������ѭ����ִ�����ʱ������������ִ�ж��ٴΣ�
				System.out.println("������" + i + "�࣬��" + j +"��ѧ���ĳɼ���");
				double score = input.nextInt();
				sum += score;
			}
			System.out.println(i + "���ѧ��ƽ���֣�" + (sum / 5));
		}
		input.close();
	}
}

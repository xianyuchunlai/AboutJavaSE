
public class Hello {
	public static void main(String[] args) {
		// ����ע��

		/*
		 * ���Ƕ���ע��
		 */

		/**
		 * �����ĵ�ע��
		 */
		System.out.println("�ڶ���java����");

		// ����һ������
		// ���������ֵ��18

		// 18���ڴ��еģ��������ʹ���ڴ��ַȥ��18�Ļ���̫�Ѿ�����������ʹ�ñ���ȥ�ҵ��� age���Ǳ�����
		int age = 18;
		// ��������д��룬���Ὣ�ں��е��������������̨���������18��������age����Ϊ�����age���������ҵ�18���������
		System.out.println(age);

		double score = 91.72;
		int increment = 2;
		double secondScore = score + increment;

		int d = 1;
		long l = d;
		// ǿ������ת������long���͵�lǿ��ת����int���͵�i ǿת
		int i = (int) l;

		// ����һ���ַ�
		char c = 'a';
		char e = 'A';

		// ʹ��int���͵ı���ic����c��ֵ
		int ic = c;
		System.out.println(ic);
		int i1;
		int i2 = 0;
		double d1;
		double d2 = 0.30;
		char c1;
		char c2 = 'n';

		String yourName = null;
		// ��ʼ�������Ǹ�һ��������ֵ�Ĺ��̣�
		// ���ֻ����һ������������û�и����������ֵ��ô������̽�������
		String firstName;// ���������
		System.out.println(yourName);

		int big = 5;
		/*
		 * big��int�� 2Ҳ��int�� ����big/2�õ���Ҳ����int�ͣ��ͻὫ2.5ȡ�����õ�2
		 * 
		 * big��int�� 2.0�Ǹ����� big/2.0�õ����Ǹ�����
		 */
		double result = big / 2.0;
		System.out.println(result);

		int high = 180;
		// ��high��������������Լ�1 Ч����ͬ��high = high + 1��
		high++;
		System.out.println(high);
		++high;
		System.out.println(high);
		// ++��ǰ�����Լӣ���ʹ��
		// ++�ں���ʹ�ã����Լ�
	}
}


public class Main2 {
	//main�ǳ��������ڣ���java��������ʱ���ͻ��ȴ����￪ʼִ��
	public static void main(String[] args) {
		/*
		 * ���㴴�����ۺ���Ҫ�����������ʹ��
		 */
		
		Father father = new Father();
		
		//ʹ�ö��󣬵������ķ���ȥ��Щ����
		//������.������������
		father.showInfo();
		
		
		//������.����
		System.out.println(father.name);
		
		
		Student st = new Student();
		//������.������ = ����ֵ   ����Ǹ����Ը�ֵ�Ĺ���
		st.name = "zhans";
		st.school = "lanou";
		st.id = 11111;
		System.out.println(st.name);
		
		//���������÷�����ʹ��st����������play�������
		st.play();
		st.������(10000000);
		st.add(15, 20);
		//�������ʱ�з���ֵ�ģ�����ֵ������String���������ǿ��Զ���һ��String���͵ı���ȥ������������ķ���ֵ
		String f = st.hot("����");
		System.out.println(f);
	}
}

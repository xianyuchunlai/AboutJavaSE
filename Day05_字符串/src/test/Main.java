package test;

public class Main {
	public static void main(String[] args) {
		Student stu = new Student();
		
		//sad����ִ�н�����ش�ӡ
		System.out.println(stu.sad());
		stu.angry();
		
		String name = stu.getName();
		System.out.println("��֮ǰ��" + name);
		//ͨ��getName�������õ�Stu��name����
		
		//��ִ��setName����ʱ���ͽ�����ַ��������˲����б��е�name
		stu.setName("��ʦ��");
		String name1 = stu.getName();
		System.out.println("��֮��" + name1);
	}
}

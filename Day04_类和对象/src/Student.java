
public class Student {
	//�������������ԣ�û�и�ֵ
	String name;
	String school;
	int id;
	
	public void play() {
		System.out.println(name + "����Ϸ");
	}
	
	public void goToStudy() {
		System.out.println(name + "ȥ��ѧ�ˣ�ѧУ��" + school);
	}
	
	/*
	 * public Ȩ�����η�
	 * void ����ֵ:void��ʾû�з���ֵ
	 * show ������
	 * (String str) �����б�:�����ж������
	 *              String�ǲ��������ͣ����÷���ʱ����Ҫ�����Ӧ���͵�����  
	 * 				str�ǲ��������� ������ģ������֪��
	 * {} �����壺���������������ʱ��Ҫִ�еĴ���
	 */
	public void show(String str) {
		
	}
	
	public void ������(int money) {
		System.out.println("������ʦ��ǰ" + money + "����Ϸȥ�ˡ�");
	}
	
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("��Ϊ��" + sum);
	}
	
	
	//public��������String��ʾ����ֵ������Stirng,�����ַ���
	public String hot(String food) {
		
		return "�����˵�" + food;
	}
}


class Courier {
	String id;
	double salary;
	String gender;
	int age;
	
	public void work() {
		System.out.println("�Ϳ��");
	}
	
	public int fun() {
		int a = 100;
		return a;
	}
	
	public void fun(String address) {
		System.out.println("�Ϳ�ݵ�" + address);
	}
	
	public String show(String id,double salary,String gender,int age) {
		return "���ţ�" + id + "н�ʣ�" + salary + "�Ա�" + gender + "���䣺" + age;
	}
}

class Salesclerk{
	String id;
	int age;
	String gender;
	double salary;
	
	public void work() {
		System.out.println("������");
	}
	
	public void work(int money) {
		System.out.println("����" + money);
	}
	
	public int fun() {
		int a = 50;
		return a;
	}
	
	public String fun(String goods) {
		return goods;
	}
}

class Students{
	String id;
	String name;
	int age;
	int cridit;
	
	public void study() {
		System.out.println("�ú�ѧϰ�������ϣ�����");
	}
	
	public void play(String address) {
		System.out.println("ȥ" + address + "����");
	}
	
	public int get() {
		int a = 100;
		return a;
	}
	
	public int get(String str) {
		int str1 = 100;
		return str1;
	}
}

class Teacher{
	String name;
	int age;
	String id;
	String gender;
	
	public Teacher() {}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void work() {
		System.out.println("����");
	}
	
	public String fun(String name) {
		return "��" + name;
	}
}

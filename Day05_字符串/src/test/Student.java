package test;

public class Student {
	
	//��װ
	private String name = "��ɽͯ��";
	
	//��©��һ�������ķ���ȥ����/���
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void smile() {
		System.out.println("�����ֿ��˻���");
	}
	
	private void cry() {
		System.out.println("�޵��������");
	}
	
	protected void angry() {
		System.out.println("������ֻ��");
	}
	
	String sad() {
		return "����һ����";
	}
}

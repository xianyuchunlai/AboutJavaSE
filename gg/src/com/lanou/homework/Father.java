package com.lanou.homework;

public class Father {

	/*
	 * ����������һ��������һ������ ��������û��Mother���Child�� ���Դ���һ��
	 * 
	 */
	private Mother wife;
	private Child child;

	// ��ʾ���׵�����
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setWife(Mother wife) {
		this.wife = wife;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	public void showFamily() {
		System.out.println(name + "��������" + wife.getName() + ",������" + child.getName());

	}

}

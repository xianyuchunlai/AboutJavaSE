package com.lanou3g.study;

public class Dog {

	/*
	 * ���췽�������أ� ��������ͬ(���췽�������ƶ�������) �����ĸ��������������ͣ�������˳�� ����������ֻҪ��һ����ͬ���ǲ����б���ǲ�ͬ�ġ�
	 */
	public Dog() {
		System.out.println("����Ĭ�ϵĿղι��췽��");
	} 

	public Dog(String name) {
		System.out.println("���Ǵ������Ĺ��췽��" + name);
	}

	public Dog(int age, String name) {

	}

	/*
	 * �������������� ��������ͬ�������б�ͬ �뷵��ֵ��Ȩ�����η��޹�
	 */
	public void eatBone() {
		System.out.println("����Ϊ���ڳԹ�ͷ");

	}

	public String eatBone(String n) {
		return "��ͷ";
	}
}

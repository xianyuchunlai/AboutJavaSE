package com.lanou3g.main;

public class StringDemo {
	public static void main(String[] args) {
		/*
		 * String�ࣺ��ʾ�ַ������ַ������ǻ������ݣ���������������
		 * �ַ����ǲ��ɱ�ã���һ���ַ��������������Ͳ����ٷ����仯
		 */
		String s1 = "����";
		String s2 = "����";
		String s3 = new String("����");
		String s4 = new String("����");
		
		System.out.println(s1 == s2);
		System.out.println(s3.equals(s4));
	}
}

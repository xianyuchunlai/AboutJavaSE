package com.lanou3g.study;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// ��������ã�ָ������Ķ���
		// ���Ƕ�̬��һ����
		Person person = new Teacher();
		Doctor p2 = new Doctor();
		Student p3 = new Student();

		Scanner input = new Scanner(System.in);

		System.out.println("����1����ʦ�ɻ����2 ��ҽ���ɻ�,����3ѧ���Ͽ�");

		// ��ȡ����̨���������ֵ
		// ���������������
		// ��ִ�е�����������������̨һֱ���������ݣ�����Ῠ�����

		Company company2 = new Company();

		int choice = input.nextInt();

		if (choice == 1) {
			Teacher t = new Teacher();
			company2.setT(t);
		} else if (choice == 2) {
			Doctor doc = new Doctor();
			company2.setD(doc);
		} else if (choice == 3) {
			Student stu = new Student();
			company2.setS(stu);
		}

		company2.work();
		input.close();
	}

}

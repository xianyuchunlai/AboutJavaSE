package com.lanou3g.study;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 父类的引用，指向子类的对象
		// 这是多态的一部分
		Person person = new Teacher();
		Doctor p2 = new Doctor();
		Student p3 = new Student();

		Scanner input = new Scanner(System.in);

		System.out.println("输入1，老师干活，输入2 ，医生干活,输入3学生上课");

		// 获取控制台输入的整数值
		// 这个方法有阻塞性
		// 当执行到这个方法，如果控制台一直不输入内容，程序会卡在这儿

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

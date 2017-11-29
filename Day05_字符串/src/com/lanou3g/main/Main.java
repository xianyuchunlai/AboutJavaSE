package com.lanou3g.main;

import test.Student;

public class Main {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.smile();
		
		//cry是private修饰的，只能在本类中访问，在外面是访问不到的
		//stu.cry();
		
		//angry是protected修饰的只能在本包或者子类中访问，包外是不能访问的
		//stu.angry();
		
		//sad是默认修饰的，只能在本包中访问，外部不能访问
		//stu.sad();
	}
}

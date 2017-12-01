package com.lanou3g.study;

public class Company2 {

	/*
	 * 当我声明一个父类的引用的时候 你给我一个父类的对象和子类的对象都可以
	 */

	private Person person;

//	public void work() {
//		
//	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	public void work() {
		if (person instanceof Teacher) {
			//如果person这个引用指向的对象是Teacher类型的，那么结果true
			System.out.println("laos");
		}
		if (person instanceof Student) {
			System.out.println("学生");
		}
		person.work();
	}
	
	
}

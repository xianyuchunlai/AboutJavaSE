package com.lanou3g.study.extend;

public class Animal {
	/*
	 * 什么是继承？ Java面向对象编程的三大 特性之一： 封装，继承，多态 子类是可以继承父类的属性和方法
	 * 创建一个类Pig，使用extends关键字，继承Animal这个类
	 */

	// 表示种族
	private String kind;

//	public Animal() {
//		System.out.println("animal animal");
//	}

	public Animal(String kind) {
		this.kind = kind;
		System.out.println("这个动物的种族为" + kind);
	}

	public void sleep() {
		System.out.println("睡一会");
	}
}

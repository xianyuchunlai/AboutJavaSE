package com.lanou3g.study.extend;

public class Pig extends Animal {
	/*
	 * extends关键字：继承 A extends B 就是A类继承B类，只是在类的声明时使用
	 */

	

	public Pig() {
		super("猪");
		// TODO Auto-generated constructor stub
	}

	// 子类继承了父类的属性或方法
	// 然后又定义了自己独有的属性或方法
	// 这个过程叫扩展
	// 被杀掉吃肉了
	public void beKilledToMeat() {
		System.out.println("被杀掉吃肉了");
	}

	
	
	
}

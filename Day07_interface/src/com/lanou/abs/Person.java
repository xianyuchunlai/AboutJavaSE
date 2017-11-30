package com.lanou.abs;

public abstract class Person {
	
	
	/*
	 * 虽然没有抽象方法，但是有abstract关键字修饰
	 * 所以这个Person类也是一个抽象类
	 * 这种做法的唯一意义，
	 * 就是不可用直接创建一个Person类的对象
	 */
	public void work() {
		System.out.println("work make me happy");
	}
}

package com.lanou3g.study;

public class Main {

	public static void main(String[] args) {
		// 我们一直写的 new XXX();
		// 实际上这个XXX()就是一个构造方法
		// 只不过这个构造方法是没有参数的
		// 每个类中，都会有一个
		// 默认的没有参数的构造方法
		// 以后没有参数我们就简称为空参
		// 刚刚我们自己在Cat中写了一个带参数的构造方法
		// 那么我们就会把这个默认的空参的构造方法覆盖
		// 这里new Cat()还是去找空参的构造方法
		// 就找不到了，就报错了.
		Person zhangSan = new Person();
		Cat cat = new Cat(zhangSan);

		// 这是在对象创建之后设置name属性
		cat.setName("Tom");
		// 给cat这个对象，设置一个主人
		// cat.setOwner(zhangSan);

		/*
		 * 我们的要求是每一个猫被创建出来就已经有了一个主人 而set方法是在对象被创建后才可以调用而执行的，这不符合需求
		 * 
		 * java中提供了一个叫构造方法的东西 可以帮助我们，在对象初始化时，给属性赋值
		 */
	}

}

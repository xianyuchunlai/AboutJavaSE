package com.lanou3g.study;

public class Cat {
	private String name;
	private Person owner;

	/*
	 * 构造方法： 
	 * 		1，方法名与类名相同
	 *  	2，没有返回值这一功能
	 *  有了构造方法，还要set/get干什么？
	 *  首先第一点，get方法一定要用的，否则
	 *  在类外面是无法获得私有属性的。
	 *  
	 *  关于set：
	 *  	有些属性，并不是每个对象都要具有的，
	 * 比如cat可能会有一个伴侣，但是不是每一个cat在初始化的时候，
	 * 都马上有一个伴侣
	 * 所以可以在后续的使用中通过set方法
	 * 给他设置一个
	 *	对于初始化就有这个owner属性                                                    
	 *可能猫也被卖了，那就需要更换一个
	 *主人，这时候也可以使用set方法去修改属性
	 */
	public Cat(Person owner) {
		// 将括号中的参数owner的值
		// 赋值给属性owner
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

}

package com.lanou3g.extend;

public class BigCar extends Car {
	// 定义在类中的属性
	// 叫做成员属性或者成员变量
	// show方法中定义的m叫做
	// 局部变量，只在定义它们的{}中有效
	// 这个变量的有效范围，被称为变量的作用域
	private String name = "BIGCAR";

	@Override
	public int getWheels() {
		return super.getWheels();
	}

	@Override
	public void setWheels(int wheels) {
		// TODO Auto-generated method stub
		super.setWheels(wheels);
	}

	public String getColor() {
		return super.getColor();
	}

	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("我是子类中的setColor方法" + color);
		super.setColor(color);
	}

	public void showThis() {
		/*
		 * this 是在调用本类自己的方法
		 * super是在调用父类的方法
		 * this叫本类对象
		 * 但是一般没听过叫super叫父类对象的
		 * 
		 * this可以调用本类的属性，方法
		 */
		this.setColor("子类设置颜色黑色");
		super.setColor("父类设置颜色绿色");
	}

	private void pullGods() {
		System.out.println("拉货去了");
	}

	public void shows() {
		// 因为wheels是私有的
		// 所以子类无法访问，也就无法赋值
		// wheels=4;
		int w = getWheels();
		System.out.println("轮胎个数" + w);
	}
	public void speed() {
		super.speed();
		
	}
	

}

package com.lanou3g.extend;

public class BigCar extends Car {
	public void shows() {
		// 因为wheels是私有的
		// 所以子类无法访问，也就无法赋值
		// wheels=4;

		int w = getWheels();
		System.out.println("轮胎个数" + w);
	}

}

package com.lanou3g.extend;

public class RunCar extends Car {
	// 跑车的加速，应该 比一般 的快
	// 所以我们复写父类Car中的加速度方法
	// 复写：就是把从父类中继承的方法修改
	@Override // 注解：这个注解用来帮我们检测speed方法是否从父类继承来的
	public void speed() {
		super.speed();
		System.out.println("加速度为240");
	}

}

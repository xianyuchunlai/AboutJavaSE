package com.lanou3g.inter;

/**
 * 文档注释 watchDog类，通过implements关键字 与work接口产生了关联，导致WatchDog就满足了Work这个接口的规范
 * 
 * 
 * implements关键字：实现
 * 
 * 通过implements 关键字，可以让一个类 实现多个接口，多个接口之间通过逗号分隔 这样就让这个类，满足了接口的规范 也叫做实现了接口
 * 
 * A继承了 B，那么A叫做子类，B叫做父类 A实现了C，那么A叫做实现类，C叫做借口
 * 
 * @author 0504
 *
 */

public class WatchDog implements Work {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("上岗了，谁来咬谁");
	}

	@Override
	public void goHome() {
		System.out.println("回窝吃骨头了");
	}

}

package com.lanou3g.inter;

public class Company {
	// work 是一个接口
	// 这里就是创建了一个接口的引用
	@SuppressWarnings("unused")
	private Work work;

	public void setWork(Work work) {
		this.work = work;
	}

	public void starWork() {
		// work这个接口的引用
		// 会指向一个实现类
		// 这里就是调用这个实现类对象的work方法
		this.work.work();
	}

	public void endWork() {
		this.work.goHome();
	}
}

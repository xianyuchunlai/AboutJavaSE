package com.lanou3g.inter;

public class Company {
	// work ��һ���ӿ�
	// ������Ǵ�����һ���ӿڵ�����
	@SuppressWarnings("unused")
	private Work work;

	public void setWork(Work work) {
		this.work = work;
	}

	public void starWork() {
		// work����ӿڵ�����
		// ��ָ��һ��ʵ����
		// ������ǵ������ʵ��������work����
		this.work.work();
	}

	public void endWork() {
		this.work.goHome();
	}
}

package com.lanou3g.study;

import com.lanou3g.inter.Work;

public class Doctor extends Person implements Work {

	@Override
	public void work() {
		System.out.println("�о����Ͳ���");
	}

	@Override
	public void goHome() {
		System.out.println("�ؼ�");
	}

}

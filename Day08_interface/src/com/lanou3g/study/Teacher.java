package com.lanou3g.study;

import com.lanou3g.inter.Work;

public class Teacher extends Person implements Work {

	@Override
	public void work() {
		System.out.println("ио©нак");
	}
	public void goHome() {
		System.out.println("xiabanl1"
			);
	}

}

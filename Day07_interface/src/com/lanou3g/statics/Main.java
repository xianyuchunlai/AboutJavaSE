package com.lanou3g.statics;

public class Main {

	public static void main(String[] args) {
		// 直接使用类名.变量名的方式，就可以找到静态变量
		int a = T.sore;
		T.sore = 200;

		T t1 = new T();
		t1.sore = 300;
		T t2 = new T();
		t2.show();
		// T.show();

	}

}

package com.lanou3g.change;

public class Main {

	public static void main(String[] args) {
		// 父类的引用指向子类的对象
		Father fa = new Son();
		//father = new Girl();

		// 父类的引用只能找到父类的方法
		// 找不到子类独有的方法
		fa.speakPTH();

		if (fa instanceof Son) {
			// 如果father这个引用指向的对象类型为Son
			// 那么我们可以强制类型转换

			// ()中写的就是强转的类型
			Son s = (Son) fa;
			s.speakEnglish();
		}
	}

}

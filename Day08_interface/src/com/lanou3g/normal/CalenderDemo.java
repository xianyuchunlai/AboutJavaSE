package com.lanou3g.normal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalenderDemo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println();
		System.out.println(new CalenderDemo());

		System.out.println(System.currentTimeMillis());
	System.out.println(date);

		
		// 这个类可以帮助我们将毫秒时间
		// 转换成我们能看懂的字符串
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(df.format(date));
	}

	public String toString() {
		return super.toString();

	}

	// public String toString() {
	// return "我调用了这个类的toString方法";
	// }

}

package com.lanou3g.main;

public class StringDemo {
	public static void main(String[] args) {
		/*
		 * String类：表示字符串，字符串不是基本数据，是引用数据类型
		 * 字符串是不可变得，当一个字符串被创建后，他就不能再发生变化
		 */
		String s1 = "张三";
		String s2 = "张三";
		String s3 = new String("张三");
		String s4 = new String("张三");
		
		System.out.println(s1 == s2);
		System.out.println(s3.equals(s4));
	}
}

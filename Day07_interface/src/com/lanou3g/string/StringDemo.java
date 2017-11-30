package com.lanou3g.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String a = "    abcdefg     ";

		// 去掉字符串前后的空格
		// 并不会把a改变，只是返回结果
		// 所以这里我们将结果赋值给a
		a = a.trim();

		// 获取字符串长度
		System.out.println(a.length());

		// 替换，把a替换成h
		// 只是返回替换的结果，并不会把结果赋值给a
		System.out.println(a.replace('a', 'h'));

		// 取字符串的子串
		// 0位置开始，取到1
		// 这是一个左闭右开的区间
		// [0,2) 所以就是从0取到1
		System.out.println(a.substring(0, 2));

		// 取字符串的子串
		// 从4开始取到末尾
		System.out.println(a.substring(4));

		// 分割字符串
		// 以e为条件分割字符串
		// 会得到一个字符串的数组、
		System.out.println(Arrays.toString(a.split("e")));

		// 判断俩个字符串是否相等
		System.out.println(a.equals("bcd"));

		// 判断俩个字符串的内容是否相等并且忽略大小写
		System.out.println(a == "abcdefg");

		// 获取第一个字符c在a这个字符串中的位置
		// 如果不存在c，则返回-1；
		int index = a.indexOf('c');
		System.out.println(index);

		// 获取index位置的字符串
		// 输入的index数值一定要在字符长度内
		// 否则会报错
		char ch = a.charAt(index);
		System.out.println(ch);

		// 是否以a开头，返回boolean的true或false
		a.startsWith("a");

		// 是否以a结尾
		a.endsWith("a");

		a.concat("我后是连上的");

		a.contains("abd");

		// 将字符串a中的小写字母都换成大写
		a.toUpperCase();

		// 将字符串a中的大写字母都换成小写
		a.toLowerCase();

		// 得到a字符串的字符数组

		char[] chs = a.toCharArray();
		System.out.println(Arrays.toString(chs));

		// 涉及到编码

		// 获得得到a字符串的字节数组
		byte[] bytes = a.getBytes();
		String aa = new String(bytes, "gbk");
		System.out.println(aa);
	}

}

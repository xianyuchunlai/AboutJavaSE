package com.lanou3g.normal;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// 取一个随机数
		// 需要用到Random这个工具类
		Random random = new Random();
		int r = random.nextInt();
		System.out.println(r);

		// 取一个30到45之间的随机数
		// double d = Math.random()(45-30)*30+1);
		// 取0-10之间的随机数

		// nextInt(bound)接收的参数
		// 是一个左闭右开的区间[0,bound}
		for (int i = 0; i < 10; i++) {
			int e = random.nextInt(10);
			System.out.print(e + "\t");
		}

		System.out.println();
		// 取30-45之间的随机数
		// 公式：（最大值-最小值+1）
		for (int i = 0; i < 10; i++) {
			int e = random.nextInt(45 - 30 + 1) + 35;
			System.out.print(e + "\t");
		}

		System.out.println();
		// 随机取一个true或false
		for (int i = 0; i < 10; i++) {
			boolean b = random.nextBoolean();
			System.out.print(b + "\t");
		}
	}

}

package com.lanou3g.normal;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// ȡһ�������
		// ��Ҫ�õ�Random���������
		Random random = new Random();
		int r = random.nextInt();
		System.out.println(r);

		// ȡһ��30��45֮��������
		// double d = Math.random()(45-30)*30+1);
		// ȡ0-10֮��������

		// nextInt(bound)���յĲ���
		// ��һ������ҿ�������[0,bound}
		for (int i = 0; i < 10; i++) {
			int e = random.nextInt(10);
			System.out.print(e + "\t");
		}

		System.out.println();
		// ȡ30-45֮��������
		// ��ʽ�������ֵ-��Сֵ+1��
		for (int i = 0; i < 10; i++) {
			int e = random.nextInt(45 - 30 + 1) + 35;
			System.out.print(e + "\t");
		}

		System.out.println();
		// ���ȡһ��true��false
		for (int i = 0; i < 10; i++) {
			boolean b = random.nextBoolean();
			System.out.print(b + "\t");
		}
	}

}

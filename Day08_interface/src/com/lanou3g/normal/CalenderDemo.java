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

		
		// �������԰������ǽ�����ʱ��
		// ת���������ܿ������ַ���
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(df.format(date));
	}

	public String toString() {
		return super.toString();

	}

	// public String toString() {
	// return "�ҵ�����������toString����";
	// }

}

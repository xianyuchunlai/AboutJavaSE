package com.lanou3g.normal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
	public static void main(String[] args) {

		Date date = new Date();

		System.out.println(date.toString());

		// System.out.println();
		long l = System.currentTimeMillis();

		// �������԰������ǽ������ʱ��
		// ת���������ܿ������ַ���
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = df.format(l);

		System.out.println(time);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	// public String toString(){
	// return super.toString();
	// }

	// @Override
	// public String toString() {
	// return "�ҵ�����������toString����";
	// }

}

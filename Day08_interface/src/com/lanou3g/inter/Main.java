package com.lanou3g.inter;

import com.lanou3g.study.Doctor;
import com.lanou3g.study.Teacher;

public class Main {

	public static void main(String[] args) {

		/*
		 * Interface :�ӿ� class����
		 * 
		 * 
		 * ������java����һ������� ����һ�ֲ��еĹ�ϵ
		 * 
		 * java�еĽӿڣ���ʾһ���淶���߹��� �����಻��ֱ�Ӵ������󣬵��ǿ���ʹ�ó���������á� ����ոս���person����һ�������� Person
		 * p������һ������
		 * 
		 * �ӿ�Ҳ�����Ƶģ�Ҳ����ֱ�Ӵ������� ���ǿ���ʹ�ýӿڵ�����
		 */

		// �����������־���wd,
		// ��������������ֵ�
		// ���һ������û������
		// ��ô������������
		//WatchDog wd = new WatchDog();

		Company facebook = new Company();

		// �����work��Ҫ����ȥһ��ʲô�ˣ�
		facebook.setWork(new WatchDog());
		
		facebook.starWork();
		facebook.endWork();

	}

}

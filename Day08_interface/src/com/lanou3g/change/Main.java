package com.lanou3g.change;

public class Main {

	public static void main(String[] args) {
		// ���������ָ������Ķ���
		Father fa = new Son();
		//father = new Girl();

		// ���������ֻ���ҵ�����ķ���
		// �Ҳ���������еķ���
		fa.speakPTH();

		if (fa instanceof Son) {
			// ���father�������ָ��Ķ�������ΪSon
			// ��ô���ǿ���ǿ������ת��

			// ()��д�ľ���ǿת������
			Son s = (Son) fa;
			s.speakEnglish();
		}
	}

}

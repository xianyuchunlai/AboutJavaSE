package com.lanou3g.inter;

/**
 * �ĵ�ע�� watchDog�࣬ͨ��implements�ؼ��� ��work�ӿڲ����˹���������WatchDog��������Work����ӿڵĹ淶
 * 
 * 
 * implements�ؼ��֣�ʵ��
 * 
 * ͨ��implements �ؼ��֣�������һ���� ʵ�ֶ���ӿڣ�����ӿ�֮��ͨ�����ŷָ� ������������࣬�����˽ӿڵĹ淶 Ҳ����ʵ���˽ӿ�
 * 
 * A�̳��� B����ôA�������࣬B�������� Aʵ����C����ôA����ʵ���࣬C�������
 * 
 * @author 0504
 *
 */

public class WatchDog implements Work {

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("�ϸ��ˣ�˭��ҧ˭");
	}

	@Override
	public void goHome() {
		System.out.println("���ѳԹ�ͷ��");
	}

}

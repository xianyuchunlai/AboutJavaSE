package com.lanou3g.study;

public class Company2 {

	/*
	 * ��������һ����������õ�ʱ�� �����һ������Ķ��������Ķ��󶼿���
	 */

	private Person person;

//	public void work() {
//		
//	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	public void work() {
		if (person instanceof Teacher) {
			//���person�������ָ��Ķ�����Teacher���͵ģ���ô���true
			System.out.println("laos");
		}
		if (person instanceof Student) {
			System.out.println("ѧ��");
		}
		person.work();
	}
	
	
}

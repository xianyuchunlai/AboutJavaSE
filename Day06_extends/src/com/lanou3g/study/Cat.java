package com.lanou3g.study;

public class Cat {
	private String name;
	private Person owner;

	/*
	 * ���췽���� 
	 * 		1����������������ͬ
	 *  	2��û�з���ֵ��һ����
	 *  ���˹��췽������Ҫset/get��ʲô��
	 *  ���ȵ�һ�㣬get����һ��Ҫ�õģ�����
	 *  �����������޷����˽�����Եġ�
	 *  
	 *  ����set��
	 *  	��Щ���ԣ�������ÿ������Ҫ���еģ�
	 * ����cat���ܻ���һ�����£����ǲ���ÿһ��cat�ڳ�ʼ����ʱ��
	 * ��������һ������
	 * ���Կ����ں�����ʹ����ͨ��set����
	 * ��������һ��
	 *	���ڳ�ʼ���������owner����                                                    
	 *����èҲ�����ˣ��Ǿ���Ҫ����һ��
	 *���ˣ���ʱ��Ҳ����ʹ��set����ȥ�޸�����
	 */
	public Cat(Person owner) {
		// �������еĲ���owner��ֵ
		// ��ֵ������owner
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

}

package com.lanou.homework;

public class HomeMain {

	public static void main(String[] args) {
		Father father = new Father();

		// 创建好father后，给他一个名字

		father.setName("大头");
		Mother mother = new Mother();
		mother.setName("王阿姨");
		Child child = new Child();
		child.setName("小头");

		father.setWife(mother);
		father.setChild(child);
		mother.setChild(child);
		mother.setHusband(father);
		child.setFather(father);
		child.setMother(mother);
		
		
		father.showFamily();
		mother.showFamily();
		child.showFamily();

	}

}

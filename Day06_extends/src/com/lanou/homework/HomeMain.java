package com.lanou.homework;

public class HomeMain {

	public static void main(String[] args) {
		Father father = new Father();

		// ������father�󣬸���һ������

		father.setName("��ͷ");
		Mother mother = new Mother();
		mother.setName("������");
		Child child = new Child();
		child.setName("Сͷ");

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

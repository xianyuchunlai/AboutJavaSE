package com.lanou.homework;

public class Mother {
	private String name;
	private Father husband;
	private Mother mother;
	private Child child;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHusband(Father husband) {
		this.husband = husband;
	}
	public void setChild(Child child) {
		this.child= child;
	}
	public void showFamily() {
		System.out.println(name + "���ɷ���" + husband.getName() + ",������" + child.getName());
	}
}

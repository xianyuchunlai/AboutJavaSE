package com.lanou.NightWork;

public class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showName() {
		System.out.println("name is \t" + name);

	}

	public void showAge() {
		System.out.println("age is \t" + age);
	}

	public void showPeople() {
		System.out.println("name is \t" + name+"\tage is \t" + age);
		
	}

}

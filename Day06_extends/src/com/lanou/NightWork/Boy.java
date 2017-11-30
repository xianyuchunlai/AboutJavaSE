package com.lanou.NightWork;

public class Boy extends Person {
	private String name;
	private int age;
	private String School;

	public Boy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSchool(String school) {
		School = school;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSchool() {
		return School;
	}

	public void getSchoolName() {
		System.out.println("SchoolName is \t" + School);
	}

}

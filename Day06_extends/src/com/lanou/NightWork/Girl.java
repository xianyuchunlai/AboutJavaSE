package com.lanou.NightWork;

public class Girl extends Person {
	private String name;
	private int age;
	private String friend;
	
	public Girl() {
		super();
	}

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

	public String getFriend() {
		return friend;
	}

	public void setFriend(String friend) {
		this.friend = friend;
	}

	
	public void getGirlsFriend() {
		System.out.println("Girl's friend is \t"+friend);
	}
	

}

package com.lanou.NightWork02;

public class Contact {
	private String name;
	private String gender;
	private String phonenumber;
	private String home;
	private String group;

	public Contact(String name,String phonenumber) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	public void showContact() {
		System.out.println(name+ gender+ phonenumber+home+group);
		
	}
}

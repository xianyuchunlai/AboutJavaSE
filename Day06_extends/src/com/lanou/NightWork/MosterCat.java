package com.lanou.NightWork;

public class MosterCat {
private String name;
private String color;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}


public void Catch() {
	System.out.println("MosterCat的捕食方法");
}
private void ClimbTree() {
	System.out.println("MosterCat的爬树方法");
	
}
}

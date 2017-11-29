package test;

public class Student {
	
	//封装
	private String name = "天山童姥";
	
	//爆漏出一个公共的方法去设置/获得
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void smile() {
		System.out.println("心里乐开了花儿");
	}
	
	private void cry() {
		System.out.println("哭的像个孩子");
	}
	
	protected void angry() {
		System.out.println("气得像只狗");
	}
	
	String sad() {
		return "爱是一道光";
	}
}

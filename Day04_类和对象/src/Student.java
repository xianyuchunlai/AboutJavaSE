
public class Student {
	//这三个叫做属性，没有赋值
	String name;
	String school;
	int id;
	
	public void play() {
		System.out.println(name + "玩游戏");
	}
	
	public void goToStudy() {
		System.out.println(name + "去上学了，学校是" + school);
	}
	
	/*
	 * public 权限修饰符
	 * void 返回值:void表示没有返回值
	 * show 方法名
	 * (String str) 参数列表:可以有多个参数
	 *              String是参数的类型，调用方法时，需要传入对应类型的内容  
	 * 				str是参数的名字 是任意的，需见名知意
	 * {} 方法体：当这个方法被调用时，要执行的代码
	 */
	public void show(String str) {
		
	}
	
	public void 买外卖(int money) {
		System.out.println("拿着老师的前" + money + "打游戏去了。");
	}
	
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("和为：" + sum);
	}
	
	
	//public后面的这个String表示返回值类型是Stirng,就是字符串
	public String hot(String food) {
		
		return "加热了的" + food;
	}
}


class Courier {
	String id;
	double salary;
	String gender;
	int age;
	
	public void work() {
		System.out.println("送快递");
	}
	
	public int fun() {
		int a = 100;
		return a;
	}
	
	public void fun(String address) {
		System.out.println("送快递到" + address);
	}
	
	public String show(String id,double salary,String gender,int age) {
		return "工号：" + id + "薪资：" + salary + "性别：" + gender + "年龄：" + age;
	}
}

class Salesclerk{
	String id;
	int age;
	String gender;
	double salary;
	
	public void work() {
		System.out.println("卖东西");
	}
	
	public void work(int money) {
		System.out.println("收了" + money);
	}
	
	public int fun() {
		int a = 50;
		return a;
	}
	
	public String fun(String goods) {
		return goods;
	}
}

class Students{
	String id;
	String name;
	int age;
	int cridit;
	
	public void study() {
		System.out.println("好好学习天天向上！！！");
	}
	
	public void play(String address) {
		System.out.println("去" + address + "玩了");
	}
	
	public int get() {
		int a = 100;
		return a;
	}
	
	public int get(String str) {
		int str1 = 100;
		return str1;
	}
}

class Teacher{
	String name;
	int age;
	String id;
	String gender;
	
	public Teacher() {}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void work() {
		System.out.println("教书");
	}
	
	public String fun(String name) {
		return "教" + name;
	}
}

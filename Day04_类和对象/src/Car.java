
public class Car {
	/*
	 * 现实生活中的车可以加速，减速，转弯，有车牌号，有重量，有生产商等信息
	 * 
	 * 在java的编程世界里，我们可以创建一个类，起名叫Car来表示生活中的车，那么车可以做的事和信息Car
	 * 都有。
	 * 
	 * 当我们与车有关的内容，写在Car这个类中时。我们就可以说把车抽象成了Car这个类  因为车市真实存在的
	 * Car是我们编程中的语言
	 */

	/*
	 * 生活中的信息——>类中的属性
	 * 生活中的动作——>类中的方法
	 */
	
	String mark;//车牌  没有值，只是定义了一个mark
	String color = "yellow";//颜色
	
	
	//showInfo就是这个类的行为：所以根据这个类创建出来的对象都会有这个行为。在java中把行为叫做方法
	public void showInfo() {
		System.out.println("车牌号是：" + mark + " 颜色是：" + color);
	}
}

class Father{
	String name;
	int age;
	double salary;
	
	public void showInfo() {
		System.out.println("Father：" + "  姓名：" + name + "  年龄：" + age + "  工资：" + salary);
	}
}

class Mother{
	String name;
	int age;
	String bestFood;
	
	public void showInfo() {
		System.out.println("Mother:" + "  姓名：" + name + "  年龄：" + age + "  拿手菜：" + bestFood);
	}
}

class Child{
	String name;
	String school;
	boolean grilFriend;
	
	public void showIofo() {
		System.out.println("Child:" + "  姓名：" + name + "  学校：" + school + "  是否有对象：" + grilFriend);
	}
}

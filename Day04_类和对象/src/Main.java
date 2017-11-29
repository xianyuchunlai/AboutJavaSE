
public class Main {
	public static void main(String[] args) {
		//这就是创建对象的过程
		Car car = new Car();
		//将car的地址传给了c2
		Car c2 = car;
		c2.showInfo();
		
		//Car 就是类
		//car 就是对象，是根据Car这个类创建出来
//		car.showInfo();
		
		//属性初始化的顺序：默认初始化，显示初始化，构造代码块初始化，构造方法初始化
		System.out.println(car == c2);
		
		Father f = new Father();
		Mother m = new Mother();
		Child c = new Child();
		
		f.showInfo();
		m.showInfo();
		c.showIofo();		
	}
}

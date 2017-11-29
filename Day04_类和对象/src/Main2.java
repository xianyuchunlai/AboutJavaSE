
public class Main2 {
	//main是程序的主入口，当java程序运行时，就会先从这里开始执行
	public static void main(String[] args) {
		/*
		 * 当你创建好累后，需要创建对象才能使用
		 */
		
		Father father = new Father();
		
		//使用对象，调用它的方法去做些事情
		//对象名.方法名（）；
		father.showInfo();
		
		
		//对象名.属性
		System.out.println(father.name);
		
		
		Student st = new Student();
		//对象名.属性名 = 属性值   这就是给属性赋值的过程
		st.name = "zhans";
		st.school = "lanou";
		st.id = 11111;
		System.out.println(st.name);
		
		//对象名调用方法：使用st这个对象调用play这个方法
		st.play();
		st.买外卖(10000000);
		st.add(15, 20);
		//这个方法时有返回值的，返回值类型是String，所以我们可以定义一个String类型的变量去接收这个方法的返回值
		String f = st.hot("冷面");
		System.out.println(f);
	}
}

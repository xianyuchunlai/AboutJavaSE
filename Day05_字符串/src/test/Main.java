package test;

public class Main {
	public static void main(String[] args) {
		Student stu = new Student();
		
		//sad方法执行结果返回打印
		System.out.println(stu.sad());
		stu.angry();
		
		String name = stu.getName();
		System.out.println("改之前：" + name);
		//通过getName方法，拿到Stu的name属性
		
		//当执行setName方法时，就将这个字符串传给了参数列表中的name
		stu.setName("她师妹");
		String name1 = stu.getName();
		System.out.println("改之后：" + name1);
	}
}

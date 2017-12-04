package 周总结;

import java.util.Arrays;

public class 周总结 {
	public static void main(String[] args) {
		/**
		 * 数组
		 */
		// 数组的声明方式
		// 一共3种
		// 静态数组声明
		int[] array01 = { 3, 9, 5, 8 };
		int[] array03 = new int[] { 2, 9, 1, 8 };
		// 动态数组声明
		int[] array02 = new int[5];

		// 1，数组一旦声明长度不可变，即array.length不可改变
		// 2，数组有顺序 ：脚标 index 即数组的索引，索引从0开始，最大索引=数组长度-1；

		// 数组常见方法
		// 数组排序
		Arrays.sort(array01);
		// 数组的遍历打印
		System.out.println(Arrays.toString(array01));

		/**
		 * 类和对象 类一个抽象的概念，一类事物的共有特征。
		 */

		Car car = new Car();
		// 对象名.方法名
		car.speed();
		// 对象名.属性名 = 属性值 这就是给属性赋值的过程

	}

}

class Car {
	// 属性初始化的顺序：默认初始化，显示初始化，构造代码块初始化，构造方法初始化
	// 要使用一个类必须实例化一个类的对象
	// Car car = new Car();

	public void speed() {
		System.out.println("属于类的方法被调用了");
	}
}
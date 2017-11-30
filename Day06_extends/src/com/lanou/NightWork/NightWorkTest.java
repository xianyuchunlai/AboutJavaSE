package com.lanou.NightWork;

public class NightWorkTest {

	public static void main(String[] args) {
		Person father = new Person();
		
		father.setAge(66);
		father.setName("jame");
		Boy son= new Boy();
		son.setAge(10);
		son.setName("little Boy ");
		son.setSchool("the first high school");
		Girl sister = new Girl();
		sister.setAge(18);
		sister.setName("june");
		sister.setFriend("Toms");
		
		//父类的方法
		father.showPeople();
		//子类独有的方法
		sister.getGirlsFriend();
		son.getSchoolName();
		//继承来的方法
		sister.showName();
		
		
		Tiger littleTiger =new Tiger();
		MosterCat oldCat= new MosterCat();
		//父类的方法
		littleTiger.Catch();
		//父类不能被继承的方法
		/**littleTiger.ClimbTree() ;
		*/
		littleTiger.swimming();
	}

}

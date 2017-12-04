package Day20171201;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		long lon = System.currentTimeMillis();
		Scanner input = new Scanner(System.in 

);
		String user = null;
		System.out.println("请输入用户名！");
		user = input.nextLine();
		System.out.println("请输入密码!");
		String password = input.nextLine();
		Person person = Login.valueIn(user, password);
		isWho(person);
		//System.out.println("当前登录的用户姓名为：" + person.getName() + "，职业为：" + person.getProfession() + "。 当前系统的时间为：" + new SimpleDateFormat("yyyy-MM-dd hh:ss:mm").format(System.currentTimeMillis()));
		System.out.println("1.开始 2.不工作");
		int choose = 0;
		String works = input.nextLine();
		try {
			choose = Integer.parseInt(works);
		} catch (Exception a) {
			if (works.equals("开始")) {
				choose = 1;
			} else if (works.equals(work)) {
				choose = 2;
			} else {
				choose = 3;
			}
		}
		work(choose);
		/*1，创建一个UserData类，通过二维数组存储姓名，用户名，密码，职业四个信息。
		姓名		用户名		密码			职业
		张三		zhangSan	111111		Worker
		李四		liSi666		222222		Doctor
		王五		wangWu888	333333		Cooker
		赵六		zhaoLiu999	444444		Boss
	2，	创建一个Login类，里面有登录方法，接收一个用户名和密码，返回一个
	UserInter接口类型的实现类对象。
		在登录方法中，与UserData中的数据进行匹配，如果匹配失败则提示错误信息，如果成功则返回对应职业类型的实现类对象。

	3，UserInter接口中的方法：
			void onLine();
			void offLine();
	4，四种职业类型都实现这个User接口并且复写方法，
	比如：	onLine：工人开始干活了，厨师开始做菜了等等
			offLine：工人干完了回家了，厨师做完了

	5，创建一个类Person，类中有姓名，用户名，密码，职业四个属性，及其set/get方法
			四种职业类型都继承Person。

	6，四种职业类型，都有符合自己职业的独有的方法，比如厨师有颠勺()，工人有罢工()等。
		在onLine中调用自己的独有的方法。


	7，在Main类中，主入口中，使用Scanner接收用户输入的用户名和密码
		然后使用Login中的登录方法登录。
		登录成功后提示用户当前登录的用户的姓名及职业，当前系统时间
		提示是否开始工作：1，是 2，否
		如果输入1，则调用onLine方法
		输入2，则调用offLine方法
*/
		long l = System.currentTimeMillis();
		System.out.println("程序运行用时"+(float)(l-lon)/1000+"秒");
		System.out.println("鲜于春来");
	}
	
	public static void isWho(Person person) {
		if (person instanceof Worker) {
			work = (Worker) person;
			num = 1;
		} else if (person instanceof Doctor) {
			doctor = (Doctor) person;
			num = 2;
		} else if (person instanceof Cooker ) {
			cooker = (Cooker) person;
		} else if (person instanceof Boss) {
			boss = (Boss) person;
		}
	}
	
	public static void work(int choose) {
		if (choose == 1) {
			if (work != null) {
				work.onLine();
			} else if (doctor != null) {
				doctor.onLine();
			} else if (cooker != null) {
				cooker.onLine();
			} else if (boss != null) {
				boss.onLine();
			}
		} else if (choose == 2) {
			if (work != null) {
				work.offLine();
			} else if (doctor != null) {
				doctor.offLine();
			} else if (cooker != null) {
				cooker.offLine();
			} else if (boss != null) {
				boss.offLine();
			}
		} else {
			System.out.println("错误,用户将随机行动！");
			int nuc = (int) (Math.random()*3 +1);
			if (nuc == 1) {
				if (work != null) {
					work.onLine();
				} else if (doctor != null) {
					doctor.onLine();
				} else if (cooker != null) {
					cooker.onLine();
				} else if (boss != null) {
					boss.onLine();
				}
			} else if (nuc == 2) {
				if (work != null) {
					work.offLine();
				} else if (doctor != null) {
					doctor.offLine();
				} else if (cooker != null) {
					cooker.offLine();
				} else if (boss != null) {
					boss.offLine();
				}
			} else {
				if (work != null) {
					work.offWork();
				} else if (doctor != null) {
					doctor.operation();
				} else if (cooker != null) {
					cooker.offWork();
				} else if (boss != null) {
					boss.offWork();
				}
			}
			
		}
	}
		private static Worker work;
		private static Doctor doctor;
		private static Cooker cooker;
		private static Boss boss;
		private static int num = 0;
}

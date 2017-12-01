package Day20171201;

public class Boss extends Person {
	@Override
	public void work() {
		System.out.println("搞事情");
	}

	public void bossCanDo() {
		System.out.println("不发工资");
	}

}

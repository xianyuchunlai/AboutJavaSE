package Day20171201;

public class Worker extends Person {
	@Override
	public void work() {
		System.out.println("搞事情");
	}

	public void workerCanDo() {
		System.out.println("罢工");
	}
}

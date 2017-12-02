package Day20171201;

public class Doctor extends Person {
	@Override
	public void work() {
		System.out.println("搞事情");
	}

	public void doctorCanDo() {
		System.out.println("治病");
	}
}

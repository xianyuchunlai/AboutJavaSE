import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfLnteger {
	public static void main(String args) {
		Random rand = new Random(47);
		Set<Integer> inSet = new HashSet<>();
		for (int i = 0; i < 10000; i++) {

			inSet.add(rand.nextInt(30));
		}
		System.out.println(inSet);
	}

}

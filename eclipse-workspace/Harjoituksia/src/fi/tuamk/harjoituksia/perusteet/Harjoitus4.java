package fi.tuamk.harjoituksia.perusteet;
import java.util.Random;

public class Harjoitus4 {

	public static void main(String[] args) {
		Random r = new Random();
		//r.setSeed(Long.parseLong(args[0]));

		for (int i = 0; i < 5; i++) {
			int n = r.nextInt(15) + 3;
			System.out.println("Luku " + n + " potenssin kaksi on " + nelio(n));
		}

	}
	
	public static int nelio(int n) {
		return n*n;
	}
}

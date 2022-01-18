package fi.tuamk.harjoituksia.perusteet;
import java.util.Random;

public class Harjoitus3 {

	public static void main(String[] args) {
		Random r = new Random();

		int start = r.nextInt(10) + 1;
		int end = start + 2 + r.nextInt(10);

		System.out.println("start:" + start + ", end:" + end);
		for (int i = start; i <= end; i++) {
			System.out.println(i);
			
		}
	}
}
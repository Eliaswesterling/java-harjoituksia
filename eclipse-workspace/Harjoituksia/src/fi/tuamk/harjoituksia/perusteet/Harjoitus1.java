package fi.tuamk.harjoituksia.perusteet;

public class Harjoitus1 {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		while (a + b < 12) {
			System.out.print(a);
			System.out.print(" * ");
			System.out.print(b + " = ");
			System.out.println(a * b);
			a = a + 1;
			b = b * 2;
		}
	}
}

package fi.tuamk.harjoituksia.perusteet;

public class Harjoitus2 {

	public static void main(String[] args) {
		String s = "saippua";
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			r = r + s.charAt(i);
		}
		r = r + "k";
		for (int j = s.length() - 1; j >= 0; j--) {
			r = r + s.charAt(j);
		}
		System.out.println(r);
	}
}

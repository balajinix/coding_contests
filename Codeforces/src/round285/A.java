package round285;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a = (double) s.nextInt();
		double b = (double) s.nextInt();
		double c = (double) s.nextInt();
		double d = (double) s.nextInt();
		s.close();
		double ascore = Math.max((3 * a)/10, a - (a/250 * c));
		double bscore = Math.max((3 * b)/10, b - (b/250 * d));
		if (ascore == bscore) {
			System.out.println("Tie");
		} else if (ascore > bscore) {
			System.out.println("Misha");
		} else {
			System.out.println("Vasya");
		}
	}

}

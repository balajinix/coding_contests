package practice;

import java.util.Scanner;

public class HalloweenParty {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for (int t=0;t<T;t++) {
			long n = scanner.nextInt();
			long a = n/2;
			long b = n - a;
			long output = a * b;
			System.out.println(output);
		}
	}
}

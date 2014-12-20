package PrathamahAbhikalan;

import java.util.Scanner;

public class Abhajya {
	public static String isPrime(long num) {
		if (num <= 1) return "NO";
		if (num <= 3) return "YES";
		
		for (long divisor=2;divisor * divisor <= num;divisor++) {
			if (num % divisor == 0) return "NO";
		}
		return "YES";
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for (int t=0;t<T;t++) {
			long num = scanner.nextLong();
			System.out.println(isPrime(num));
		}
	}
}

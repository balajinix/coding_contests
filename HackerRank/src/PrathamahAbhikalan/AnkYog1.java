package PrathamahAbhikalan;

import java.util.Scanner;

public class AnkYog1 {
	public static String recursiveSum(String input) {
		long digitsSum = 0;
		for (int i=0;i<input.length();i++) {
			digitsSum += input.charAt(i) - '0';
		}
		if (digitsSum == 0) return "9";
		if (digitsSum < 10) return Long.toString(digitsSum);
		return recursiveSum(Long.toString(digitsSum));
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		for (int t=0;t<T;t++) {
			String s = scanner.nextLine();
			System.out.println(recursiveSum(s));
		}
	}

}

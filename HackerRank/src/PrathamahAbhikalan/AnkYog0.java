package PrathamahAbhikalan;

import java.util.Scanner;

public class AnkYog0 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		for (int t=0;t<T;t++) {
			String s = scanner.nextLine();
			long digitsSum = 0;
			for (int i=0;i<s.length();i++) {
				digitsSum += s.charAt(i) - '0';
			}
			System.out.println(digitsSum);
		}
	}

}

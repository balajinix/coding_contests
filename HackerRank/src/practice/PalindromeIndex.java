package practice;

import java.util.Scanner;

public class PalindromeIndex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		for (int t=0;t<T;t++) {
			int index = -1;
			String s = scanner.nextLine();
			int i=0;
			int j=s.length()-1;
			while (i<j) {
				if (s.charAt(i) == s.charAt(j)) {
					i++;
					j--;
				} else {
					if (s.charAt(i+1) == s.charAt(j)) {
						index = i; i++;
					} else if (s.charAt(i) == s.charAt(j-1)) {
						index = j; j--;
					}
				}
			}
			System.out.println(index);
		}
	}
}

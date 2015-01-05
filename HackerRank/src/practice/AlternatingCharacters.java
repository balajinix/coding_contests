package practice;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		for (int t=0;t<T;t++) {
			String str = scanner.nextLine();
			int i=0, j=1, count=0;
			while (i<j && j < str.length()) {
				if (str.charAt(i) != str.charAt(j)) {
					i=j; j++;
				} else {
					count++; j++;
				}
			}
			System.out.println(count);
		}
		scanner.close();
	}

}

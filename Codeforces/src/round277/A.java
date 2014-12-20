package round277;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = Long.parseLong(scanner.nextLine());
		if (n % 2 == 0) {
			System.out.println(n/2);
		} else {
			System.out.println(n/2 - n);
		}
	}

}

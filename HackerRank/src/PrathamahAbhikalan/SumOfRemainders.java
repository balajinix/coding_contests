package PrathamahAbhikalan;

import java.util.Scanner;

public class SumOfRemainders {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		for (int t=0;t<T;t++) {
			long N = scanner.nextLong();
			long D = scanner.nextLong();
			long sum=0;
			for (int i=1;i<=N;i++) {
				sum += (i % D);
			}
			System.out.println(sum);
		}
	}

}

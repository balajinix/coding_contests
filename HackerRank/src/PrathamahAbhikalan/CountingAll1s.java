package PrathamahAbhikalan;

import java.util.Scanner;

public class CountingAll1s {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		for (int t=0;t<T;t++) {
			int N = scanner.nextInt();
			int count = 0;
			while (N > 0) {
				if ((N & 1) == 1) count++;
				N = N>>1;
			}
			System.out.println(count);
		}
	}
}

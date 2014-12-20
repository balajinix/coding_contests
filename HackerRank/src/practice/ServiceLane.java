package practice;

import java.util.Scanner;

public class ServiceLane {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int T = scanner.nextInt();
		int[] widths = new int[N];
		for (int n=0;n<N;n++) {
			widths[n] = scanner.nextInt();
		}
		for (int t=0;t<T;t++) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			int min=3;
			while (i<=j) {
				if (min > widths[i]) min = widths[i];
				i++;
			}
			System.out.println(min);
		}
	}
}

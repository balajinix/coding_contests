package practice;

import java.util.Arrays;
import java.util.Scanner;

public class AngryChildren {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int[] a = new int[N];
		for (int i=0;i<N;i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		int min= (int) Math.pow(2.0, 32.0) - 1;
		int diff=0;
		for (int i=0, j=K-1;i<(N-K+1) && j < N;i++, j++) {
			diff = a[j] - a[i];
			if (diff < min)
				min = diff;
		}
		System.out.println(min);
	}

}

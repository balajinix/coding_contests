package practice;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrays3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		for (int t=0;t<T;t++) {
			int N = scanner.nextInt();
			long K = scanner.nextLong();
			long[] a = new long[N];
			long[] b = new long[N];
			for (int i=0;i<N;i++) {
				a[i] = scanner.nextLong();
			}
			for (int j=0;j<N;j++) {
				b[j] = scanner.nextLong();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			boolean flag = true;
			for (int i=0;i<N;i++) {
				if (a[i] + b[N-(1+i)] < K) {
					System.out.println("NO");
					flag = false;
					break;
				}
			}
			if (flag == true)
				System.out.println("YES");
		}
	}
}

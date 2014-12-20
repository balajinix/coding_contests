package practice;

import java.util.Arrays;
import java.util.Scanner;

public class PickingCards2 {
	
	public static long count(int[] a) {
	
		// find eligibility per slot
		int[] eligible = new int[a.length];
		for (int i=0;i<a.length;i++) {
			if (a[i] > i) return 0;
			eligible[a[i]]++;
		}
		
		// main loop
		long ways = 1;
		int spare = 0;
		for (int i=0;i<a.length;i++) {
			long iways = eligible[i] + spare;
			if (eligible[i] > 0) {
				spare += eligible[i] - 1;
			}
			if (eligible[i] == 0) {
				if (spare <= 0) return 0;
				spare--;
			}
			ways = (ways * iways) % 1000000007;
		}
		return ways;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for (int t=0;t<T;t++) {
			int N = scanner.nextInt();
			int[] a = new int[N];
			for (int i=0;i<N;i++) {
				a[i] = scanner.nextInt();
			}
			Arrays.sort(a);
			System.out.println(count(a));
		}
	}

}

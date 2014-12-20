package practice;

import java.util.Arrays;
import java.util.Scanner;

public class PickingCards {

	static long count(int[] a) {
		
		int[] eligible = new int[a.length];
		for (int k=0;k<a.length;k++) {
			if (a[k] >= a.length) return 0;
			eligible[a[k]]++;
		}
		int el_count = 0;
		int next_el_count = 0;
		for (int k=0;k<a.length;k++) {
			next_el_count = eligible[k];
			eligible[k] += el_count;
			el_count += next_el_count;
		}
		
		int i=0;
		int ways=1;
		while (i < a.length) {
			if (i == a.length) return ways;
			if (a[i] > i)
				return 0;
			ways = (ways * eligible[i]) % 1000000007;
			i++;
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

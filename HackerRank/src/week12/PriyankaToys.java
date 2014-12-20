package week12;

import java.util.Arrays;
import java.util.Scanner;

public class PriyankaToys {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] a = new int[N];
		for (int i=0;i<N;i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		
		int count = 1;
		int start = 0;
		for (int i=1;i<N;i++) {
			if ((a[i]-a[start]) <= 4) {
				continue;
			} else {
				count++;
				start = i;
			}
		}
		System.out.println(count);
	}

}

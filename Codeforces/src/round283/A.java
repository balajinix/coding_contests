package round283;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		s.close();
		int min_diff=Integer.MAX_VALUE; int diff=0;
		int min_index = -1;
		for (int i=1;i<n-1;i++) {
			diff = (a[i]-a[i-1]) + (a[i+1]-a[i]);
			if (diff < min_diff) { min_diff = diff; min_index = i; }
		}
		int max_diff = Integer.MIN_VALUE;
		for (int i=1;i<n;i++) {
			if (i==min_index) {
				i++; diff = a[i]-a[i-2];}
			else {
				diff = a[i]-a[i-1];
			}
			if (diff > max_diff) max_diff = diff;
		}
		System.out.println(max_diff);
	}

}

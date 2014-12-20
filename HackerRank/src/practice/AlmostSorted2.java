package practice;

import java.util.Scanner;

public class AlmostSorted2 {

	public static boolean isSorted(int[] a, int i, int j, boolean reverseOrder) {
		if (reverseOrder) {
			for (int k=j;k>i;k++) {
				if (a[k] > a[k-1]) return false;
			}
		} else {
			for (int k=i;k<j;k++) {
				if (a[k] > a[k+1]) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// get the input
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] a = new int[N];
		for (int n=0;n<N;n++) {
			a[n] = scanner.nextInt();
		}
		scanner.close();
		System.out.println(checkAlmostStarted(a));
	}
	
	public static String checkAlmostStarted(int a[]) {
		// shrink the problem
		int i=0;
		int j=a.length-1;
		
		while (i<j && a[i] < a[i+1]) i++;
		
		if (i+1 == a.length)
			return "yes";
		
		while (i<j && a[j] > a[j-1]) j--;
		
		if (j<i) {
			//System.out.println(i + " " + j);
			if (i+1 != a.length && a[j] > a[i+1]) return "no";
			if (j != 0 && a[i] < a[j-1]) return "no";
			String str = "yes\nswap " + (j+1) + " "+ (i+1);
			return str;
		}
		
		// assert the following
		if (j+1 != a.length && a[i] > a[j+1]) {
			return "no 1 " + a[i] + " >" + a[j+1];
		}
		
		if (i != 0 && a[j] < a[i-1]) {
			return "no 2";
		}
		
		// now i and j are the elements to be swapped, assert this
		if (a[i] < a[j]) {
			return "no 3";
		}
		
		if (isSorted(a, i+1, j-1, true)) {
			String str = "yes\nreverse " + (i+2) + " " + (j);	
			return str;
		}
		
		if (isSorted(a, i+1, j-1, false)) {
			String str = "yes\nswap " + (i+2) + " " + (j);
			return str;
		}
		
		return "no 4";
	}

}

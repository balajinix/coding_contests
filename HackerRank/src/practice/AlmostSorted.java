package practice;

import java.util.Scanner;

public class AlmostSorted {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int i=0, j=0, l=-1,r=n;
		int[] a = new int[n];
		for (i=0;i<n;i++) a[i] = scanner.nextInt();
		scanner.close();
		i=0;
		j=n-1;
		int swap_count = 0;
		while (i<j) {
			while (i<j && a[i] < a[i+1]) {
				i++;
			}
			if (i>=j) break;
			while (i<j && a[j-1] < a[j]) {
				j--;
			}
			if (i>=j) break;
			if (a[i] > a[j]) {
				int s = a[i];
				a[i] = a[j];
				a[j] = s;
				if (l == -1) l=i+1;
				if (r == n) r=j+1;
				i++;
				j--;
				swap_count++;
			}
		}
		i=0; j=n-1;
		while (i < j && a[i] < a[i+1]) {
			i++;
		}
		if (i!=j) {
			System.out.println("no");
			return;
		} else {
			System.out.println("yes");
		}
		if (swap_count == 1)
			System.out.println("swap " + l + " " + r);
		else if (swap_count > 1)
			System.out.println("reverse " + l + " " + r); 
	}
}

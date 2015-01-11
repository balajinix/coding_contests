package practice;

import java.util.Scanner;

public class Partition {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for (int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		s.close();
		partition(a,0,n-1);
		for (int i=0;i<a.length;i++)
			System.out.print(a[i] + " ");
	}
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void partition(int[] a, int i, int j) {
		int lesser = i+1;
		int greater = j;
		while (lesser <= greater) {
			if (a[greater] < a[i]) {
				swap(a, greater, lesser);
				lesser++;
			} else {
				greater--;
			}
		}
		swap(a, i, lesser-1);
	}

}

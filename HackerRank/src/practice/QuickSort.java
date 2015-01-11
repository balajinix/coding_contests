package practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {

	public static void shuffle(int a[]) {
		Random rand = new Random();	
		for (int i = 0; i <a.length;i++) {
			int j = i + rand.nextInt(a.length-i);
			swap(a[i], a[j]);
		}
	}
	
	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}
	
	public static int partition(int[] a, int n, int m) {
		if (n < 0 || m >= a.length) return -1;
		int p = a[n];
		int i = n+1;
		int j = m;
		while (i<j) {
			if (a[j] < p) {
				swap(a[i], a[j]);
				i++;
			}
			j--;
		}
		if (i < 0 || i > m) return -1;
		swap(a[i], a[n]);
		return i;
	}
	
	public static void quickSort(int[] a, int i, int j) {
		int mid = partition(a, i, j);
		if (mid != -1) {
			quickSort(a, i, mid-1);
			quickSort(a, mid+1, j);
		} else {
			return;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i] = s.nextInt();
		}
		s.close();
		System.out.println(Arrays.toString(a));
		shuffle(a);
		quickSort(a, 0, n-1);
		System.out.println(Arrays.toString(a));
	}

}

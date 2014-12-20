package practice;

import java.util.Scanner;

public class AlmostSortedInterval {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		int[] a = new int[1000001];
		for (int n=0;n<N;n++) {
			a[n] = scanner.nextInt();			
		}
		a[N] = 0;
		int i=0; int count=1;
		int sum=0;
		while (i<N) {
			count = 1;
			while (a[i] < a[i+1]) {
				count++;
				i++;
			}
			if (count==1) {
				sum += 1;
			} else {
				sum += ((count * (count + 1))/2);
			}
			i++;
		}
		System.out.println(sum);
	}

}

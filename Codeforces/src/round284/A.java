package round284;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x = s.nextInt();
		int[] start = new int[n];
		int[] end = new int[n];
		for (int i=0;i<n;i++) {
			start[i] = s.nextInt();
			end[i] = s.nextInt();
		}
		s.close();
		int k = 1; int count = 0;
		for (int j=0;j<n;j++) {
			count += (((start[j]-1)-k)+1) % x;
			count += ((end[j]-start[j])+1);
			k = end[j]+1;
		}
		System.out.println(count);
	}

}

package practice;

import java.util.Scanner;

public class Cipher {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		String input = scanner.next();
		//int[] o = new int[input.length()]; 
		int a[][] = new int[K][input.length()];

		for (int i=0;i<N;i++) {
			char ch = input.charAt(i);
			int chi = (int) (ch - '0');
			int j=1;
			int xor_sum=a[j][i];
			for (j=i-1;j>0;j--) {
				xor_sum = xor_sum ^ a[j][i];
			}
			chi = chi ^ xor_sum; 
			for (int k=0;k<K;k++) {
				a[k][i+k] = chi;
			}
		}
		for (int i=0;i<K;i++) {
			for (int j=0;j<input.length();j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}

package practice;

import java.util.Scanner;

public class SherlockAndWatson {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n=0, k=0, q=0;
	        n = scanner.nextInt();
	        k = scanner.nextInt();
	        q = scanner.nextInt();
	        int a[] = new int[2*n];
	        for (int i=0;i<n;i++) {
	            a[i] = scanner.nextInt();
	        }
	        int r = n % k;
	        for (int j=0;j<r;j++) {
	            a[n+j] = a[j];
	        }
	        for (int m=0;m<q;m++) {
	            int y = scanner.nextInt();
	            System.out.println(a[r+y]);
	        }
	    }
	
}

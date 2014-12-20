package practice;

//import java.util.Arrays;
import java.util.Scanner;

public class SherlockAndQueries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		long[] A = new long[N];
		for (int n=0;n<N;n++) {
			A[n] = scanner.nextLong();
		}
		//System.out.println(Arrays.toString(A));
		long[] B = new long[M];
		for (int m=0;m<M;m++) {
			B[m] = scanner.nextLong();
		}

		//System.out.println(Arrays.toString(B));
		long[] C = new long[M];
		for (int m=0;m<M;m++) {
			C[m] = scanner.nextLong();
		}

		//System.out.println(Arrays.toString(C));
		for (int i = 1; i <= M ; i++) {
		    for (int j = 1; j <= N ; j++) {
		        if (j % B[i-1] == 0)
		            A[j-1] = A[j-1] * C[i-1];
		    }
		}

		//System.out.println(Arrays.toString(A));
		for (int j=0;j<N;j++) {
			System.out.print(A[j] % 1000000007 + " ");
		}
		System.out.println();
	}
}

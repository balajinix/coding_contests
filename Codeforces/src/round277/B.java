package round277;

import java.util.Scanner;

public class B {
	public static int validate(int a[][], int m, int n, int i, int j) {
		int valid = 0;
		boolean flag = true;
		for (int k=0;k<n;k++) {
			if (a[i][k] != 1) {
				flag = false;
				break;
			}
		}
		if (flag) valid = 1;
		flag = true;
		for (int k=0;k<m;k++) {
			if (a[k][j] != 1) {
				flag = false;
				break;
			}
		}
		if (flag) {
			if (valid == 1)
				valid = 3;
			else
				valid = 2;
		}
		return valid;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		int[][] b = new int[M][N];
		for (int m=0;m<M;m++) {
			for (int n=0;n<N;n++) {
				b[m][n] = scanner.nextInt();
			}
		}
		
		boolean[] fullRow = new boolean[M];
		boolean[] fullCol = new boolean[N];
		for (int i=0;i<M;i++) {
			for (int j=0;j<N;j++) {
				if (b[i][j] == 1) {
					int valid = validate(b, M, N, i, j);
					if (valid == 0) {
						System.out.println("NO");
						return;
					} else if (valid == 1) {
						// row full
						fullRow[i] = true;
					} else if (valid == 2) {
						fullCol[j] = true;
					} else if (valid == 3) {
						fullRow[i] = true;
						fullCol[j] = true;
					}
				}
			}
		}
		System.out.println("YES");
		int[][] a = new int[M][N];
		for (int i=0;i<M;i++) {
			for (int j=0;j<N;j++) {
				if (fullRow[i] && fullCol[j]) {
					a[i][j] = 1; 
				} else {
					a[i][j] = 0;
				}
			}
		}
		
		int j=0;
		for (int i=0;i<M;i++) {
			for (j=0;j<N-1;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(a[i][j]);
		}
	}
}

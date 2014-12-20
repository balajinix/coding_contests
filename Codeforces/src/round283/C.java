package round283;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		char[][] a = new char[n][m];
		for (int i=0;i<n;i++) {
			String str = s.next();
			for (int j=0;j<str.length();j++)
				a[i][j] = str.charAt(j);
		}
		s.close();
		int cols = 0;
		for (int j=0;j<m;j++) {
			boolean flag = false;
			for (int i=0;i<n-1;i++) {
				if (a[i][j] > a[i+1][j]) {
					boolean f2 = false;
					for (int k=j-1;k>=0;k--) {
						if (a[i][k] < a[i+1][k]) {
							f2 = true;
							break;
						}
					}
					if (!f2) {
						cols++; flag = true;
						break;
					}
				}
			}
			if (flag) {
				for (int i=0;i<n;i++) {
					a[i][j] = '{';
				}
			}
		}
		System.out.println(cols);
	}

}

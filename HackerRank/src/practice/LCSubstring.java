package practice;

import java.util.Scanner;

public class LCSubstring {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String line = scanner.nextLine();
		String[] inputs = line.split(" ");
		scanner.close();
		if (inputs.length != 3) return;
		//int l = Integer.parseInt(inputs[0]);
		String s1 = inputs[1];
		String s2 = inputs[2];
		
		int maxLen = 0;
		int[][] a = new int[s1.length()+1][s2.length()+1];
		String sub = "";
		for (int i=1;i<=s1.length();i++) {
			for (int j=1;j<=s2.length();j++) {
				if (s1.charAt(i-1) == s2.charAt(j-1)) {
					if (i==1 || j == 1) {
						a[i][j] = 1;
					} else {
						a[i][j] = a[i-1][j-1] + 1;
					}
					if (a[i][j] > maxLen) {
						maxLen = a[i][j];
						sub = s1.substring((i-maxLen+1)-1, i);
					} else if (a[i][j] == maxLen) {
						sub = sub + s1.charAt(i-1);
					}
				}
			}
		}

		for (int i=0;i<=s1.length();i++) {
			if (i==0) {
				System.out.print("    ");
				for (int j=0;j<s2.length();j++) {
					System.out.print(s2.charAt(j) + " ");
				}
				System.out.println();
			}
			if (i > 0) {
				System.out.print(s1.charAt(i-1) + " ");
			} else {
				System.out.print("  ");
			}
			for (int j=0;j<=s2.length();j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(maxLen);
		System.out.println(sub);
	}

}

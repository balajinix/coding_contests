package round2775;

import java.util.Arrays;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] boys = new int[n];
		for (int i=0;i<n;i++) {
			boys[i] = scanner.nextInt();
		}
		int m = scanner.nextInt();
		int[] girls = new int[m];
		for (int j=0;j<m;j++) {
			girls[j] = scanner.nextInt();
		}
		Arrays.sort(boys);
		Arrays.sort(girls);
		int i=0, j=0;
		int count = 0;
		while (i<n && j<m) {
			if (Math.abs(boys[i] - girls[j]) < 2) {
				count++;
				i++; j++;
			} else {
				if (boys[i] < girls[j]) i++;
				else j++;
			}
		}
		System.out.println(count);
	}

}

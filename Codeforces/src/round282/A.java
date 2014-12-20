package round282;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		int[][] a = {{0,8},
					{1,3,4,7,8,9,0},
					{2,8},
					{3,9,8},
					{4,9,8},
					{5,6,8,9},
					{6,8},
					{7,0,3,8,9},
					{8},
					{9,8}};
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		int f = num / 10;
		int s = num % 10;
		int count = (a[f].length * a[s].length);
		System.out.println(count);
	}

}

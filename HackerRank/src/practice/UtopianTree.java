package practice;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int T = userInput.nextInt();
		int N = 0;
		int t = 0;
		int rem = -1;
		int x = 1;
		while (userInput.hasNextInt()) {
			N = userInput.nextInt();
			rem = N % 2;
			x = 1;
			N = N/2;
			for (int i=1;i<=N;i++) {
				x = 2 * x + 1;
			}
			if (rem == 1) x = 2 * x;
			System.out.println(x);
			t++;
			if (t == T) break;
		}
	}

}

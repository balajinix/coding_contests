package practice;

import java.util.Scanner;

public class Pairs {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		if (!userInput.hasNext()) {
			return;
		}
		int N = userInput.nextInt();
		long K = userInput.nextLong();
		long[] nums = new long[N];
		int n = 0;
		while (userInput.hasNext()) {
			nums[n] = userInput.nextLong();
			n++;
			if (n == N)
				break;
		}
		int count = 0;
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				if (i == j) {
					continue;
				}
				if (Math.abs(nums[i] - nums[j]) == K) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

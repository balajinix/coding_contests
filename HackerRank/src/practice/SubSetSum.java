package practice;

import java.util.Scanner;

public class SubSetSum {

	public static long countSets(int[] arr, int i, long sum) {
		if (i == arr.length) {
			if (sum != 0 && sum%2 == 0) return 1;
			else return 0;
		}
		long count = 0;
		count = (count + countSets(arr, i+1, sum)) % (1000000007);
		count = (count + countSets(arr, i+1, sum + arr[i])) % (1000000007);
		return count;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		System.out.println(countSets(arr, 0, 0));
	}

}

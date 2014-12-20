package practice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class powerSet {

	public static long countSets(int[] arr, int i, long sum, List<Integer> list) {
		if (i == arr.length) {
			if (sum != 0 && sum%2 == 0) return 1;
			else return 0;
		}
		long count = 0;
		List<Integer> new_list1 = new LinkedList<Integer>(list);
		count = (count + countSets(arr, i+1, sum, new_list1)) % (1000000007);
		List<Integer> new_list2 = new LinkedList<Integer>(list);
		new_list2.add(arr[i]);
		count = (count + countSets(arr, i+1, sum + arr[i], new_list2)) % (1000000007);
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
		List<Integer> list = new LinkedList<Integer>();
		System.out.println(countSets(arr, 0, 0, list));
	}
	
}

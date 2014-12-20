package practice;

import java.util.Scanner;

public class PalindromeIndex2 {
	
	public static boolean isPalindrome(String str, int i, int j) {
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static int getPalindromeIndex(String str, int index, int i, int j) {
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				if (str.charAt(i+1) == str.charAt(j)) {
					if (isPalindrome(str, i+1, j)) return i;
				}
				if (str.charAt(i) == str.charAt(j-1)) {
					if (isPalindrome(str, i, j-1)) return j;
				} 
				return -2;
			} else {
			  i++;
			  j--;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		for (int t=0;t<T;t++) {
			String str = scanner.nextLine();
			System.out.println(getPalindromeIndex(str, -1, 0, str.length()-1));
		}
	}
}

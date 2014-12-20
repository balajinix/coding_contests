package practice;

import java.util.Scanner;

public class MakeItAnagram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		int i=0;
		int[] charCount1 = new int[26];
		int[] charCount2 = new int[26];
		for (i=0;i<26;i++) charCount1[i] = 0;
		for (i=0;i<26;i++) charCount2[i] = 0;
		for (i=0;i<str1.length();i++) {
			charCount1[str1.charAt(i) - 'a']++;
		}
		for (i=0;i<str2.length();i++) {			
			charCount2[str2.charAt(i) - 'a']++;
		}
		int count = 0;
		for (i=0;i<26;i++) {
			count += Math.abs(charCount1[i] - charCount2[i]);
		}
		System.out.println(count);
	}
}

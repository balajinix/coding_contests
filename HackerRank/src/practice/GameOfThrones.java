package practice;

import java.util.Scanner;

public class GameOfThrones {
	
	public static String isPalindromeAnagram(String input) {
	
		int ascii_array[] = new int[26];
		for (int i=0;i<26;i++)
			ascii_array[i] = 0;
		int char_num=0;
		for (int i=0;i<input.length();i++) {
			char_num = input.charAt(i);
			char_num -= 97;
			ascii_array[char_num]++;
		}
		
		boolean singleOddChar = true;
		for (int i=0;i<26;i++) {
			if ((ascii_array[i] % 2) != 0) {
				if (!singleOddChar) {
					return "NO";
				} else {
					singleOddChar = false;
				}
			}
		}
		return "YES";
		
	}
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		if (!userInput.hasNextLine())
			return;
		String input = userInput.nextLine();
		System.out.println(isPalindromeAnagram(input));
	}

}

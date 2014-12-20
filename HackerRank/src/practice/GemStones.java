package practice;

import java.util.BitSet;
import java.util.Scanner;

public class GemStones {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int N = Integer.parseInt(userInput.nextLine());
		int[] array = new int[26];
		for (int i=0;i<26;i++) array[i] = 0;
		BitSet bs = new BitSet(26);
		for (int n=0;n<N;n++) {
			String s = userInput.nextLine();
			bs.clear();
			for (int i=0;i<s.length();i++) {
				int char_num = s.charAt(i) - 'a';
				bs.set(char_num);
			}
			for (int i =0;i<26;i++) {
				if (bs.get(i)) {
					array[i]++;
				}
			}
		}
		int count=0;
		for (int i=0;i<26;i++) {
			if (array[i] == N)
				count++;
		}
		System.out.println(count);
	}
}

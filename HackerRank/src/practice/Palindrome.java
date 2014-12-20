package practice;

import java.util.Scanner;

public class Palindrome {
	
	static Double d =0.0;
	
	public static void main(String[] args) {
		//
		
		Scanner userInput = new Scanner(System.in);
		long l = Long.parseLong(userInput.nextLine());
		d = new Double(l);
		String s = userInput.nextLine();
		for (int i=0;i<s.length()/2;i++) {
			if (s.charAt(i) == s.charAt(i+s.length()-1)) {
				continue;
			} else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		userInput.close();
	}

}

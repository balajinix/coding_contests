package PrathamahAbhikalan;

import java.io.IOException;
import java.io.InputStreamReader;

public class AnkYog22 {
	
	public static String recursiveSum(String input) {
		long digitsSum = 0;
		for (int i=0;i<input.length();i++) {
			digitsSum += input.charAt(i) - '0';
		}
		if (digitsSum == 0) return "9";
		if (digitsSum < 10) return Long.toString(digitsSum);
		return recursiveSum(Long.toString(digitsSum));
	}
	
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		int a=0;
		long digitsSum = 0;
		while ((a = isr.read()) != -1) {
			if (a == 10) break;
			if (a < 48 || a > 57) System.out.println("Error");
			digitsSum += a - 48;
		}
		if (digitsSum == 0) System.out.println("9");
		else if (digitsSum < 10)
			System.out.println(digitsSum);
		else
			System.out.println(recursiveSum(Integer.toString((int)digitsSum)));
	}

}

package PrathamahAbhikalan;

import java.math.BigInteger;
import java.util.Scanner;

public class AnkYog2 {
	public static BigInteger nonRecursiveSum(BigInteger input) {
		if (input.compareTo(BigInteger.ZERO) == 0) return BigInteger.valueOf(9);

		while (input.compareTo(BigInteger.ZERO) > 0) {
			BigInteger digitsSum = BigInteger.ZERO;
			while (input.compareTo(BigInteger.ZERO) > 0) {
				digitsSum = digitsSum.add(input.mod(BigInteger.TEN));
				input = input.divide(BigInteger.TEN);
			}
			if (digitsSum.compareTo(BigInteger.TEN) < 1) return digitsSum;
			input = digitsSum;
		}
		return BigInteger.ONE;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		for (int t=0;t<T;t++) {
			BigInteger s = scanner.nextBigInteger();
			System.out.println(nonRecursiveSum(s));
		}
	}

}

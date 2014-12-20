package PrathamahAbhikalan;

import java.math.BigInteger;
import java.util.Scanner;

public class AnkYog23 {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int T = Integer.parseInt(scanner.nextLine());
			for (int t=0;t<T;t++) {
				BigInteger s = scanner.nextBigInteger();
				BigInteger value = s.mod(BigInteger.valueOf(9));
				if (value.compareTo(BigInteger.ZERO) == 0) value = BigInteger.valueOf(9);
				System.out.println(value);
			}
		}
}

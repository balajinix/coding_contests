package round282;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a = s.nextLong();
		long b = s.nextLong();
		long r = a - b;
		s.close();
		if (r <= 0) {
			System.out.println("infinity");
			return;
		}
		long count = 0;
		for (long i=b+1;i<=r;i++) {
			if ((r % i) == 0) count++;
		}
		System.out.println(count);
	}

}

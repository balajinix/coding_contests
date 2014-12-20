package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TwoArrays2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = Integer.parseInt(scanner.nextLine());
		for (int t=0;t<T;t++) {
			int N = scanner.nextInt();
			long K = scanner.nextLong();
			List<Long> a = new ArrayList<Long>(N);
			List<Long> b = new ArrayList<Long>(N);
			for (int i=0;i<N;i++) {
				a.add(scanner.nextLong());
			}
			for (int j=0;j<N;j++) {
				b.add(scanner.nextLong());
			}
			Collections.sort(a, Collections.reverseOrder());
			for (int i=0;i<N;i++) {
				if ((a.get(i) + b.get(i)) < K) {
					System.out.println("NO");
					return;
				}
			}
			System.out.println("YES");
		}
	}

}

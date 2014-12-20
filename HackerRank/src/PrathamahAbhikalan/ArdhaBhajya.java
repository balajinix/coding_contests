package PrathamahAbhikalan;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ArdhaBhajya {
	
	public HashSet<Integer> primes;
	
	public void findPrimes(int n) {
		// implement sieve of eratosthenes
		boolean[] isNotPrime = new boolean[n+1];
		for (int num=2; num <= n; num++) {
			if (isNotPrime[num] == true)
				continue;
			for (int divisor=2;divisor * divisor <= num;divisor++) {
				if (num % divisor == 0)
					isNotPrime[num] = true;
			}
			if (isNotPrime[num] == true) {
				for (int i=2*num;i<=n;i=i+num) {
					isNotPrime[num] = true;
				}
			}
		}
		for (int i=2;i<=n;i++) {
			if (isNotPrime[i]==false)
				primes.add(i);
		}
	}
	
	public ArdhaBhajya() {
		primes = new LinkedHashSet<Integer>();
		//int n = (int) Math.pow(2.0, 16.0);
		int n = 65535;
		findPrimes(n);
		//for (Integer i : primes)
		//	System.out.println(i + " ");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		ArdhaBhajya ab = new ArdhaBhajya();
		for (int t=0;t<T;t++) {
			int num = scanner.nextInt();
			boolean flag = false;
			for (Integer p : ab.primes) {
				if (p >= num) break;
				int q = num / p;
				int r = num % p;
				if (r == 0) {
					if (ab.primes.contains(q)) {
						flag = true;
					}
					break;
				}
			}
			if (flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}

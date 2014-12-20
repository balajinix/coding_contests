package practice;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TwoArrays {
	
	// this will take an arrayList and a search key
	// returns the element closest <= to search key  
	public static int binSearch(List<Integer> list, BitSet bitset, int key) {
		int l = 0;
		int r = list.size() - 1;
		int m = -1;
		while (l<=r) {
			m = (l+r)/2;
			if (list.get(m) == key) {
				// if the key is found, we have to check if its already taken
				if (bitset.get(m) == false) {
					bitset.set(m);
					return list.get(m);
				}
				break;
			} else if (list.get(m) < key) {
				l = m+1;
			} else {
				r = m-1;
			}
		}
		m++;
		while (m<=list.size()-1) {
			if (bitset.get(m) == false) {
				bitset.set(m);
				return list.get(m);
			} else {
				m++;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		for (int t=0; t<T; t++) {
			int N = scanner.nextInt();
			int K = scanner.nextInt();
			List<Integer> a = new ArrayList<Integer>(N);
			List<Integer> b = new ArrayList<Integer>(N);
			for (int i=0;i<N;i++) {
				a.add(scanner.nextInt());
			}
			for (int j=0;j<N;j++) {
				b.add(scanner.nextInt());
			}
			Collections.sort(a, Collections.reverseOrder());
			Collections.sort(b);
			BitSet bitset = new BitSet(N);
			int val1=0, val2=0;
			for (int i=0;i<N;i++) {
				val1 = a.get(i);
				val2 = K-val1;
				int ret = binSearch(b, bitset, val2);
				if (ret == -1) {
					System.out.println("NO");
					return;
				}
			}
			System.out.println("YES");
		}
	}
}

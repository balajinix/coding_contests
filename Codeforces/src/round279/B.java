package round279;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		HashMap<Integer, Integer> pos = new HashMap<Integer, Integer>(n);
		for (int i=0;i<n;i++) {
			int f = scanner.nextInt();
			int s = scanner.nextInt();
			map.put(f,s);
			if (f==0) {
				pos.put(s, 2);
			} else if (s == 0) {
				pos.put(f, n-1);
			}
		}

		scanner.close();
		
		// populate hash
		while (pos.size() <= n) {
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				int f = entry.getKey();
				int s = entry.getValue();
				if (!pos.containsKey(f)) {
					if (pos.containsKey(s)) {
						int j = pos.get(s);
						pos.put(f, j-2);
						continue;
					}
				}
				if (!pos.containsKey(s)) {
					if (pos.containsKey(f)) {
						int j = pos.get(f);
						pos.put(s, j+2);
					}
				}
			}
		}
		
		// order
		int[] a = new int[n];
		for (Map.Entry<Integer, Integer> entry : pos.entrySet()) {
			int f = entry.getKey();
			int s = entry.getValue();
			if (s > 0 && s <= n) {
				a[s-1] = f;
			}
		}
		for (int i=0;i<n-1;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[n-1]);
	}

}

package round285;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
//import java.util.Map;
import java.util.Scanner;

public class C {

	public static void findSubsets(int[] a, int len, List<Integer> list, HashMap<Integer, List<Integer>> subsets) {
		if (len >= a.length) {
			if (list.size() != 0) {
				int xor = list.get(0);
				for (int i=1;i<list.size();i++) {
					xor ^= list.get(i);
				}
				subsets.put(xor, list);
			}
			return;
		}
		findSubsets(a, len+1, list, subsets);
		List<Integer> new_list = new ArrayList<Integer>(list);
		new_list.add(a[len]);
		findSubsets(a, len+1, new_list, subsets);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] degree = new int[n];
		int[] sum = new int[n];
		for (int i=0;i<n;i++) {
			degree[i] = s.nextInt();
			sum[i] = s.nextInt();
		}
		s.close();
		HashMap<Integer, List<Integer>> subsets = new HashMap<Integer, List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i] = i;
		}
		findSubsets(a, 0, list, subsets);
		/*
		for (Map.Entry<Integer, List<Integer>> entry : subsets.entrySet()) {
			int key = entry.getKey();
			List<Integer> val = entry.getValue();
			System.out.println("Subset length :" + key);
			for (Integer val1 : val) {
				System.out.print(val1);
			}
			System.out.println();
		}*/
		HashSet<String> edges = new HashSet<String>();
		for (int i=0;i<n;i++) {
			if (subsets.containsKey(sum[i])) {
				List<Integer> val = subsets.get(sum[i]);
				if (!val.contains(i)) continue;
				//if ((degree[i] + 1) != val.size()) continue;
				//System.out.println(sum[i] + " = " + val.toString());
				for (Integer val1 : val) {
					if (val1 == i) continue;
					if (i < val1) {
						String str = new String(i + " " + val1);
						edges.add(str);
					} else {
						String str = new String(val1 + " " + i);
						edges.add(str);
					}
				}	
			}
		}
		System.out.println(edges.size());
		for (String str : edges) {
			System.out.println(str);
		}
	}

}

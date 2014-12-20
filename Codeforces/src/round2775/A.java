package round2775;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A {

	public static class Item implements Comparable<Item> {
		int value;
		int index;
		public Item(int v, int i) {
			value = v;
			index = i;
		}
		public int compareTo(Item i1) {
			if (value > i1.value) return 1;
			if (value < i1.value) return -1;
			return 0;
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		ArrayList<Item> alist = new ArrayList<Item>(N);
		ArrayList<Item> blist = new ArrayList<Item>(N);
		for (int i=0;i<N;i++) {
			int input = scanner.nextInt();
			Item item = (Item) new Item(input, i);
			alist.add(item);
			blist.add(item);
		}
		Collections.sort(blist);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0;i<N;i++) {
			if (alist.get(i).index != blist.get(i).index) {
				if (!map.containsKey(blist.get(i).index)) {
					map.put(alist.get(i).index, blist.get(i).index);
				}
			}
		}
		System.out.println(map.size());
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}

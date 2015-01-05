package practice;

import java.util.Collections;
import java.util.PriorityQueue;

public class LIS {

	public static class Node implements Comparable<Node> {
		public int value;
		public int index;
		public Node(int v, int i) {
			value = v;
			index = i;
		}
		@Override
		public int compareTo(Node other) {
			if (value == other.value)
				return 0;
			if (value < other.value)
				return -1;
			else
				return 1;
		}
	}
	
	public static void main(String[] args) {
		PriorityQueue<Node> queue = new PriorityQueue<Node>(10, Collections.reverseOrder());
		queue.add(new Node(10,0));
		queue.add(new Node(12,1));
		queue.add(new Node(7,2));
		System.out.println(queue.peek().value);
		System.out.println(queue.poll().value);
		System.out.println(queue.peek().value);
	}

}

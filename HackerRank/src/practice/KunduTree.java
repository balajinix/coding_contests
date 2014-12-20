package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class KunduTree {
	public static class Node {
		public int edge;
		public boolean isRed;
		public Node(int v, boolean isRed) {
			this.edge = v;
			this.isRed = isRed;
		}
	}
	public static boolean pathExists(List<ArrayList<Node>> adjList, int s, int t) {
		Queue<Integer> queue = new LinkedList<Integer>();
		boolean[] visited = new boolean[adjList.size() + 1];
		Node[] edgeTo = new Node[adjList.size() + 1];
		queue.add(s);
		boolean red = false;
		while (!queue.isEmpty()) {
			int current = queue.remove();
			if (visited[current]) continue;
			for (Node n : adjList.get(current)) {
				if (visited[n.edge]) continue;
				edgeTo[n.edge] = new Node(current, n.isRed);
				if (n.edge == t) {
					int temp = t;
					while (temp != s) {
						if (edgeTo[temp].isRed) red = true;
						temp = edgeTo[temp].edge;
					}
					if (red) {
						//System.out.println("Red Path between " + s + " and " + t);
						return true;
					}
					//System.out.println("Black Path between " + s + " and " + t);
					return false;
				}
				queue.add(n.edge);
			}
			visited[current] = true;
		}
		return false;
	}
	public static final long LARGE_NUM = ((long) Math.pow(10,9)) + 7;
	public static void main(String[] args) {

		List<ArrayList<Node>> adjList = new ArrayList<ArrayList<Node>>(10001);
		for (int i = 0;i<10001;i++) {
			ArrayList<Node> alist = new ArrayList<Node>();
			adjList.add(alist);
		}
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for (int i=0;i<n-1;i++) {
			int from = s.nextInt();
			int to = s.nextInt();
			String str = s.next();
			Node node1, node2;
			if (str.equals("r")) {
				node1 = new Node(to, true);
				node2 = new Node(from, true);
			} else {
				node1 = new Node(to, false);
				node2 = new Node(from, false);
			}
			adjList.get(from).add(node1);
			adjList.get(to).add(node2);
		}
		s.close();
		long count = 0;
		for (int i=1;i<=n;i++) {
			for (int j=i+1;j<=n;j++) {
				if (!pathExists(adjList, i, j)) continue;
				for (int k=j+1;k<=n;k++) {
					if (pathExists(adjList,i,k) && pathExists(adjList, j, k)) {
						//System.out.println(i + " " + j + " " + k);
						count = (count + 1) % LARGE_NUM;
					}
				}
			}
		}
		System.out.println(count);
	}

}

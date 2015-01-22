package round286;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B {

	public static boolean DFS(ArrayList<ArrayList<Integer>> adjList, boolean[] visited, int s, int d) {
		if (s == d) return true;
		if (visited[s]) return false;
		visited[s] = true;
		ArrayList<Integer> alist = adjList.get(s);
		for (Integer n : alist) {
			if (DFS(adjList, visited, n, d)) return true;
		}
		return false;
	}
	
	public static void populate(ArrayList<ArrayList<Integer>> adjList, int s, int d) {
		adjList.get(s).add(d);
		adjList.get(d).add(s);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		List<ArrayList<ArrayList<Integer>>> colorList = new ArrayList<ArrayList<ArrayList<Integer>>>();
		for (int j=0;j<=m;j++) {
			ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
			for (int i=0;i<=n;i++) {
				ArrayList<Integer> alist = new ArrayList<Integer>();
				adjList.add(alist);
			}
			colorList.add(adjList);
		}
		for (int i=0;i<m;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = s.nextInt();
			populate(colorList.get(c), a, b);
		}
		int q = s.nextInt();
		for (int i=0;i<q;i++) {
			int u = s.nextInt();
			int v = s.nextInt();
			int count = 0;
			for (int j=1;j<=m;j++) {
				boolean[] visited = new boolean[n+1];
				if (DFS(colorList.get(j), visited, u, v)) {
					count++;
				}
			}
			System.out.println(count);
		}
		s.close();
	}

}

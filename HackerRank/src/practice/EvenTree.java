package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenTree {

	public static class Graph {
		private List<ArrayList<Integer>> adjList;
		int[] children;
		int N;

		public Graph(int N) {
			this.N = N;
			adjList = new ArrayList<ArrayList<Integer>>(N + 1);
			for (int i = 0; i <= N; i++) {
				ArrayList<Integer> alist = new ArrayList<Integer>();
				adjList.add(alist);
			}
			children = new int[N + 1];
		}

		public int recursiveDFS(int s) {
			if (children[s] != 0)
				return children[s];
			int childCount = 1;
			for (Integer i : adjList.get(s)) {
				childCount += recursiveDFS(i);
			}
			children[s] = childCount;
			return childCount;
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int M = scanner.nextInt();

		Graph g = new Graph(N);
		for (int m = 0; m < M; m++) {
			int j = scanner.nextInt();
			int i = scanner.nextInt();
			g.adjList.get(i).add(j);
		}

		for (List<Integer> a : g.adjList) {
			for (Integer i : a) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		for (int i = 1; i <= N; i++) {
			g.children[i] = g.recursiveDFS(i);
		}

		int treeCount = 0;
		for (int i = 1; i <= N; i++) {
			if (g.children[i] % 2 == 0)
				treeCount++;
		}
		System.out.println(treeCount - 1);
	}
}

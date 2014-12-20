package practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class CopyOfEvenTree {
	
	public static class Graph {
		private ArrayList<ArrayList<Integer>> adjList;
		int[] children;
		int N;
		public Graph(int N) {
			this.N = N;
			adjList = new ArrayList<ArrayList<Integer>>(N+1);
			for (int i=0;i<=N;i++) {
				ArrayList<Integer> alist = new ArrayList<Integer>();
				adjList.add(alist);
			} 
		}
		
		public void BFS(int s) {
			boolean[] visited = new boolean[N+1];
			Queue<Integer> queue = new LinkedList<Integer>();
			queue.add(s);
			visited[s] = true;
			while (!queue.isEmpty()) {
				int current = queue.poll();
				System.out.println(current);
				ListIterator<Integer> iter = adjList.get(current).listIterator();
				while (iter.hasNext()) {
					int neighbor = iter.next();
					if (visited[neighbor]) continue;
					visited[neighbor] = true;
					queue.add(neighbor);
				}
			}
		}
		
		public void DFS(int s) {
			Deque<Integer> stack = new ArrayDeque<Integer>();
			boolean[] visited = new boolean[N+1];
			stack.add(s);
			visited[s] = true;
			while (!stack.isEmpty()) {
				int current = stack.pop();
				System.out.println(current);
				ListIterator<Integer> iter = adjList.get(current).listIterator();
				while (iter.hasNext()) {
					int neighbor = iter.next();
					if (visited[neighbor]) continue;
					visited[neighbor] = true;
					stack.push(neighbor);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		Graph g = new Graph(N);
		for (int m=0;m<M;m++) {
			int j = scanner.nextInt();
			int i = scanner.nextInt();
			g.adjList.get(i).add(j);
		}
		System.out.println("BFS");
		g.BFS(1);
		System.out.println("DFS");
		g.DFS(1);
	}
}

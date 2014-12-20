package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnakesAndLadder {

	public static int dijkstra(int s, int t, int n, List<ArrayList<Integer>> adjList) {
		
		int[] distance = new int[n+1];
		for (int i=1;i<n+1;i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		boolean[] visited = new boolean[n+1];
		
		int current = s;
		distance[current] = 0;
		while (!visited[current]) {
			int dist = distance[current] + 1;
			for (Integer neighbor : adjList.get(current)) {
				if (distance[neighbor] > dist) distance[neighbor] = dist;
			}
			visited[current] = true;
			int min = Integer.MAX_VALUE;
			for (int i=1;i<n+1;i++) {
				if (visited[i] == false && distance[i] <= min) {
					min = distance[i];
					current = i;
				}
			}
		}
		return distance[t]-1;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("[\\n ,]");
		int T = scanner.nextInt();
		for (int t=0;t<T;t++) {
			int snakes = scanner.nextInt();
			int ladders = scanner.nextInt();
			List<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(101);
			for (int i=0;i<101;i++) {
				adjList.add(new ArrayList<Integer>());
			}
			for (int i=0;i<snakes;i++) {
				int ss = scanner.nextInt();
				int se = scanner.nextInt();
				adjList.get(ss).add(se);
			}
			for (int i=0;i<ladders;i++) {
				int ls = scanner.nextInt();
				int le = scanner.nextInt();
				adjList.get(ls).add(le);
			}
			for (int i=1;i<101;i++) {
				if (adjList.get(i).isEmpty()) {
					for (int j=i+1;j<i+7 && j<101;j++) {
						adjList.get(i).add(j);
					}
				}
			}
			System.out.println(dijkstra(1,100,100, adjList));
		}
		scanner.close();
	}

}

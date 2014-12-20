package round279;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		Queue<Integer> programming = new ArrayBlockingQueue<Integer>(N);
		Queue<Integer> math = new ArrayBlockingQueue<Integer>(N);
		Queue<Integer> pe = new ArrayBlockingQueue<Integer>(N);
		for (int i=1;i<=N;i++) {
			int t = scanner.nextInt();
			switch(t) {
				case 1:
					programming.add(i);
					break;
				case 2:
					math.add(i);
					break;
				case 3:
					pe.add(i);
					break;
				default:
					System.out.println("Error");
					break;
			}
		}
		int max = Math.min(programming.size(), Math.min(math.size(), pe.size()));
		System.out.println(max);
		while (!programming.isEmpty() && !math.isEmpty() && !pe.isEmpty()) {
			System.out.println(programming.remove() + " " + math.remove() + " " + pe.remove());
		}
		scanner.close();
	}

}

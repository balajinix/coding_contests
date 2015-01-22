package round286;

import java.util.Scanner;

public class C {
	private static int max;
	public C() {
		max = 0;
	}
	public static void printCount() {
		System.out.println(max);
	}
	public static void collect(int[] a, int cur, int prev, int count, int last, int left) {
		if (cur > last) {
			return;
		}
		if (cur < 0) return;
		if (a[cur] > 0) {
			count+=a[cur];
			left-=a[cur];
			if (count > max) max = count;
			//System.out.println("Collected at " + cur);
			a[cur] = 0;
		}
		if (left == 0) return;
		int len = cur - prev;
		collect(a, cur+len-1, cur, count, last, left);
		int[] b = a.clone();
		collect(b, cur+len, cur, count, last, left);
		int[] c = a.clone();
		collect(c, cur+len+1, cur, count, last, left);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();
		int[] a = new int[30001];
		int last = 0;
		for (int i=0;i<n;i++) {
			int k = s.nextInt();
			a[k]+=1;
			last = k;
		}
		s.close();
		collect(a, d, 0, 0, last, n);
		printCount();
	}

}

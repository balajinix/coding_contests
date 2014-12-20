package round2775;

// could not complete this. solution doesn't finish in 1 second

import java.util.Scanner;

public class C {
	
	public static int max;
	public static int min;
	public static boolean flag;
	
	public static void recurse(int m, int s, int S, String str) {
		if (s < 0) return;
		if (m == 0) {
			if (s==0 && str.length() > 0) {
				int val = Integer.parseInt(str);
				flag = true;
				if (val < min) min = val;
				if (val > max) max = val;
			}
			return;
		}
		for (int i=0;i<10;i++) {
			if (s < i) continue;
			String str2;
			if (str.length() == 0 && i==0) {
				str2 = "";
			} else {
				str2 = str + Integer.toString(i);
			}
			recurse(m-1,s-i,S,str2);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int s = scanner.nextInt();
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		flag = false;
		String str = "";
		recurse(m,s,s,str);
		if (flag)
			System.out.println(min + " " + max);
		else
			System.out.println("-1 -1");
	}

}

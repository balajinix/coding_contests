package round276;

/* Could not complete this problem */

import java.util.*;
import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int a = userInput.nextInt();
		int m = userInput.nextInt();
  		int r = 0;
		Vector<Integer> remList = new Vector<Integer>();
		int startIndex = -1;
		//int currentIndex = -1;
		while (a > 0) {
			r = a % m;
			for (int i=0;i<remList.size();i++) {
				System.out.print(remList.get(i) + " ");
			}
			System.out.println();
			for (int i=0;i<remList.size();i++) {
				if (remList.get(i) == r) {
					if (startIndex == -1)
						startIndex = i;
					//currentIndex = i;
					int p=i;
					int q=remList.size()-1;
					while (p>=0 && q>=0) {
						if (p == 0) {
							
						}
					}
					break;
				} else {
					startIndex = -1;
					//currentIndex = -1;
				}
			}
			if (r==0) {
				System.out.println("YES");
				return;
			} else {
				remList.add(r);
				a += r;
			}
			userInput.nextLine();
		}
		System.out.println("NO");
	}
}


package practice;

import java.util.Scanner;

public class MaximizingXOR {

	
			public static int maximalValues(int L, int R) {
				int maxVal=0;
				int xorVal=0;
				for (int i=L; i <= R; i++) {
					for (int j=L; j<= R; j++) {
						xorVal = i^j;
						if (xorVal > maxVal) {
							maxVal = xorVal;
						}
					}
				}
				return maxVal;
			}
			
			public static void main(String[] args) {
				Scanner userInput = new Scanner(System.in);
				int L = userInput.nextInt();
				int R = userInput.nextInt();
				int maxVal = maximalValues(L, R);
				System.out.println(maxVal);
			}

	
}

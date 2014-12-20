package practice;

import java.util.Scanner;

public class ServerLane {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int N = userInput.nextInt();
        int T = userInput.nextInt();
        int[] a = new int[N];
        int n=0;
        while (userInput.hasNext()) {
        	a[n] = userInput.nextInt();
        	n++;
        	if (n==N) break;
        }
        int t=0;
        int i=-1;
        int j=-1;
        int min=3;
        while (userInput.hasNext()) {
        	i = userInput.nextInt();
        	j = userInput.nextInt();
        	min=3;
        	for (int k=i;k<=j;k++) {
        		if (a[k] < min) min = a[k];
        		if (min==1) break;
        	}
        	System.out.println(min);
        	t++;
        	if (t==T) break;
        }
    }
}

package practice;


import java.util.*;

public class LCS {


	
	    public static int max(int a, int b) {
	        return ((a > b) ? a : b);
	    }
	    
	    public static int findLCS(int[][] a, int n, int m) {
	        for (int i=2;i<n+2;i++) {
	            for (int j=2;j<m+2;j++) {
	                if (a[i][0] == a[0][j]) {
	                    a[i][j] = 1 + a[i-1][j-1];
	                } else {
	                    a[i][j] = max(a[i-1][j], a[i][j-1]);
	                }
	            }
	        }
	        return a[n+1][m+1];
	    }
	    
	    public static void getLCS(int[][] a, int n, int m) {
	        int i=n+1; int j=m+1;
	        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
	        while (i>1 && j>1) {
	            if (a[i][j] == a[i-1][j]) {
	                i--; continue;
	            }
	            if (a[i][j] == a[i][j-1]) {
	                j--; continue;
	            }
	            stack.push(a[i][j]);
	            i--;j--;
	        }
	        System.out.print(stack.poll());
	        while (!stack.isEmpty()) {
	            System.out.print(" " + stack.poll());
	        }
	        System.out.println();
	    }
	    
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int m = s.nextInt();
	        int[][] a = new int[n+2][m+2];
	        for (int i=2;i<n+2;i++) {
	            a[i][0] = s.nextInt();
	        }
	        for (int j=2;j<m+2;j++) {
	            a[0][j] = s.nextInt();
	        }
	        s.close();
	        int len = findLCS(a,n,m);
	        //System.out.println(len);
	        if (len != 0) getLCS(a,n,m);
	    }
	
}

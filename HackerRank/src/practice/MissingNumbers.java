package practice;

import java.util.HashMap;
import java.util.Scanner;

public class MissingNumbers {

	public static void main (String[] args) {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(n);
	        for (int i = 0 ; i < n; i ++) {
	            int v = s.nextInt();
	            int count = map.containsKey(v) ? map.get(v) : 0;
	            map.put(v, count+1);
	        }
	        int m = s.nextInt();
	        boolean flag = false;
	        for (int i =0; i < m; i++) {
	            int v = s.nextInt();
	            int count = map.containsKey(v) ? map.get(v) : 0;
	            if (count == 0) {
	                if (flag) {
	                    System.out.print(" " + v);
	                } else {
	                    flag = true;
	                    System.out.print(v);
	                }
	            } else {
	                map.put(v, count -1);
	            }
	        }
	        if (flag) System.out.println();
	}
}


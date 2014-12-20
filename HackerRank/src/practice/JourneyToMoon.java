package practice;


import java.io.*;
//import java.util.*;

public class JourneyToMoon {

	    
	   public static void main(String[] args) throws Exception{
	        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	        String[] temp = bfr.readLine().split(" ");
	        int N = Integer.parseInt(temp[0]);
	        int I = Integer.parseInt(temp[1]);
	      
	        int[] arr = new int[N+1];
	        for (int i=1;i<N+1;i++) {
	            arr[i] = i;
	        }
	        for(int i = 0; i < I; i++){
	            temp = bfr.readLine().split(" ");
	            int a = Integer.parseInt(temp[0]);
	            int b = Integer.parseInt(temp[1]);
	          // Store a and b in an appropriate data structure of your choice
	            if (arr[a] == arr[b]) continue;
	            int comp = arr[a];
	            for (int j=0;j<N;j++) if (arr[j] == comp) arr[j] = arr[b];
	        }

	        int[] counts = new int[N+1];
	        for (int i=0;i<N;i++) {
	            counts[arr[i]]++;
	        }
	        
	        System.out.println("Output:");
	        long combinations = 0;
	        for (int i=0;i<N;i++) {
	        	System.out.println(i + " " + counts[i]);
	            if (counts[i] <= 0) continue;
	            for (int j=i+1;j<N;j++) {
	            	if (counts[j] == 0) continue;
	            	combinations += counts[i] * counts[j];
	            }
	        }

	        // Compute the final answer - the number of combinations
	       
	        System.out.println(combinations);

	    }

}

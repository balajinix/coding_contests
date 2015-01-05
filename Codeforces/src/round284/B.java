package round284;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class B {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		Map<String, String> a = new TreeMap<String, String>();
		
		for (int i=0;i<m;i++) {
			String str1 = s.next();
			String str2 = s.next();
			a.put(str1, str2);
		}
		

		String str = s.next();
		String val = a.get(str);
		System.out.print((str.length() <= val.length() ? str : val));
		for (int i=1;i<n;i++) {
			str = s.next();
			val = a.get(str);
			System.out.print(" " + (str.length() <= val.length() ? str : val));
		}
		System.out.println();
		s.close();
	}

}

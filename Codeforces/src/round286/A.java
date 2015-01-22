package round286;

import java.util.Scanner;

public class A {

	public static boolean checkPalindrome(char[] a, int l, int r) {
		while (l <= r) {
			if (a[l] != a[r]) return false;
			l++;
			r--;
		}
		return true;
	}
	
	public static String widenPalindrome(char[] a) {
		int len = a.length;
		char[] b = new char[len+1];
		int i = 0;
		int j = 0;
		for (;i<len/2;) {
			b[j] = a[i];
			j++;i++;
		}
		if (len % 2 == 0) {
			b[j] = 'x'; j++;
		} else {
			b[j] = a[i]; j++;
			b[j] = a[i]; i++; j++;
		}
		for (;i<len;) {
			b[j] = a[i];
			j++; i++;
		}
		String new_str = String.valueOf(b);
		return new_str;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();

		char[] a = str.toCharArray();
		int l = 0;
		int r = str.length() - 1;
		if (checkPalindrome(a, l, r)) {
			System.out.println(widenPalindrome(a));
			return;
		}
		
		char[] b = new char[a.length+1];
		int j = 0; int k = r+1;
		while (l <= r) {
			if (a[l] != a[r]) {
				if (checkPalindrome(a, l+1, r)) {
					b[j] = a[l]; j++;
					for (int m = l+1; m<=r;m++) {
						b[j] = a[m];j++; 
					}
					b[j] = a[l];
					String new_str = String.valueOf(b);
					System.out.println(new_str);
					return;
				}
				if (checkPalindrome(a, l, r-1)) {
					b[j] = a[r]; j++;
					for (int m = l;m<r;m++) {
						b[j] = a[m];j++;
					}
					b[j] = a[r];
					String new_str = String.valueOf(b);
					System.out.println(new_str);
					return;
				}
				break;
			} else {
				b[j] = a[l];
				j++;
				b[k] = a[r];
				k--;
			}
			l++;
			r--;
		}
		System.out.println("NA");
	}

}

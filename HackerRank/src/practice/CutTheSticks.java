package practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int n = userInput.nextInt();
		List<Integer> sticks = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			int value = userInput.nextInt();
			sticks.add(value);
		}
		Collections.sort(sticks);
		
		int len=0;
		while (sticks.size() > 0) {
			System.out.println(sticks.size());
			ListIterator<Integer> iter = sticks.listIterator();
			ListIterator<Integer> temp = sticks.listIterator();
			int cut = iter.next();
			while (temp.hasNext()) {
				len = temp.next();
				len -= cut;
				if (len == 0)
					temp.remove();
				else
					temp.set(len);
			}
		}
	}

}

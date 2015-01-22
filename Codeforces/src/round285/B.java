package round285;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		HashMap<String, String> firstName = new HashMap<String, String>();
		HashMap<String, Boolean> currentName = new HashMap<String, Boolean>();
		for (int i=0;i<T;i++) {
			String o = s.next();
			String n = s.next();
			if (firstName.containsKey(o)) {
				String f = firstName.get(o);
				firstName.put(n, f);
			} else {
				firstName.put(n, o);
			}
			currentName.put(n, true);
			currentName.put(o, false);
		}
		s.close();
		ArrayList<String> outputList = new ArrayList<String>();
		for (Map.Entry<String, String> entry : firstName.entrySet()) {
			String name = entry.getKey();
			String first = entry.getValue();
			if (currentName.get(name) == true) {
				String output = first + " " + name;
				outputList.add(output);
			}
		}
		System.out.println(outputList.size());
		for (String output : outputList) {
			System.out.println(output);
		}
	}
}

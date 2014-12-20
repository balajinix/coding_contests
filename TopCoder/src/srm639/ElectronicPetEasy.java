package srm639;

public class ElectronicPetEasy {

	String isDifficult(int st1, int p1, int t1, int st2, int p2, int t2) {
		int[] a1 = new int[t1];
		int[] a2 = new int[t2];
		
		for (int i=0, v=st1;i<t1;i++, v+=p1) {
			a1[i] = v;
		}
		for (int i=0, v=st2;i<t2;i++, v+=p2) {
			a2[i] = v;
		}
		int temp = 0;
		if (t1 > t2) temp = t2;
		else temp = t1;
		for (int i=0;i<temp;i++) {
			if (a1[i] == a2[i])
				return "Difficult";
		}
		return "Easy";
	}
}

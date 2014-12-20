package srm;

public class DivToZero {
	public static String lastTwo(int num, int factor) {
		num -= (num % 100);
		for (int i=0;i<100;i++) {
			if ((num % factor) == 0) {
				String retValue = Integer.toString(num);
				return retValue.substring(retValue.length()-2, retValue.length());
			}
			num++;
		}
		return "";
	}
	public static void main(String[] args) {
		System.out.println(lastTwo(23442, 75));
	}
}

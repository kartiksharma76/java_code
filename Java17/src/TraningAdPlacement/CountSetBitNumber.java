package TraningAdPlacement;

public class CountSetBitNumber {
	public static void main(String[] args) {
		int n = 29, count = 0;
		while (n != 0) {
			n &= (n - 1);
			count++;
		}
		System.out.println("Set bits = " + count);
	}
}

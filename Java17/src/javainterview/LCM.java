package javainterview;

public class LCM {
	public static void main(String[] args) {
		int a = 12, b = 18, lcm = Math.max(a, b);
		while (true) {
			if (lcm % a == 0 && lcm % b == 0)
				break;
			lcm++;
		}
		System.out.println(lcm);
	}
}

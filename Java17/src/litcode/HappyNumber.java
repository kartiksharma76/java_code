package litcode;

import java.util.HashSet;

public class HappyNumber {
	public static boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<>();

		while (n != 1 && !set.contains(n)) {
			set.add(n);
			int sum = 0;

			while (n > 0) {
				int digit = n % 10;
				sum += digit * digit;
				n /= 10;
			}
			n = sum;
		}
		return n == 1;
	}

	public static void main(String[] args) {
		int n = 19;

		if (isHappy(n)) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not Happy Number");
		}
	}
}

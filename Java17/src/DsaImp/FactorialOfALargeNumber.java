package DsaImp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FactorialOfALargeNumber {
	public static List<Integer> factorial(int n) {
		List<Integer> result = new ArrayList<>();
		result.add(1);

		for (int i = 2; i <= n; i++) {
			multiply(result, i);
		}

		Collections.reverse(result);
		return result;

	}

	private static void multiply(List<Integer> result, int x) {
		int carry = 0;
		for (int i = 0; i < result.size(); i++) {
			int product = result.get(i) * x + carry;
			result.set(i, product % 10);
			carry = product / 10;
		}
		while (carry > 0) {
			result.add(carry % 10);
			carry /= 10;
		}

	}

	public static void main(String[] args) {
		List<Integer> fact = factorial(10);
		for (int digit : fact) {
			System.out.print(digit);
		}
	}
}

package DsaImp;

public class ReverseInteger {
	public int reverse(int x) {
		int rev = 0;
		while (x != 0) {
			int pop = x % 10;
			x /= 10;
			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))
				return 0;
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8))
				return 0;
			rev = rev * 10 + pop;
		}
		return rev;

	}

	public static void main(String[] args) {
		ReverseInteger sol = new ReverseInteger();

		System.out.println(sol.reverse(123));
		System.out.println(sol.reverse(-123));
		System.out.println(sol.reverse(120));
		System.out.println(sol.reverse(1534236469));
		System.out.println(sol.reverse(0));
	}
}

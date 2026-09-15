package recursion;

public class CountGoodNumbers {
	static final long MOD = 1000000007;

	static long power(long x, long n) {
		if (n == 0)
			return 1;

		long half = power(x, n / 2);

		long result = (half * half) % MOD;

		if (n % 2 == 1)
			result = (result * x) % MOD;

		return result;
	}

	public static int countGoodNumbers(long n) {
		long even = (n + 1) / 2;
		long odd = n / 2;

		long ans = (power(5, even) * power(4, odd)) % MOD;

		return (int) ans;
	}

	public static void main(String[] args) {
		System.out.println(countGoodNumbers(4));
	}
}

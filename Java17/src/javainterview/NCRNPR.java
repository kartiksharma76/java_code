package javainterview;

public class NCRNPR {
	static int fact(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++)
			f *= i;
		return f;
	}

	public static void main(String[] args) {
		int n = 5, r = 2;
		int ncr = fact(n) / (fact(r) * fact(n - r));
		int npr = fact(n) / fact(n - r);
		System.out.println("NCR = " + ncr);
		System.out.println("NPR = " + npr);
	}
}

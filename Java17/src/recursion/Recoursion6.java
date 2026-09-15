package recursion;

public class Recoursion6 {
	public static int function(int n) {
		if (n == 1) {
			return 0;
		} else {
			return 1 + function(n / 2);
		}
	}

	public static void main(String[] args) {
		System.out.println(16);
	}
}

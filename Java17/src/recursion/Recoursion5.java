package recursion;

public class Recoursion5 {
	public static void function(int n) {
		if (n == 0) {
			return;
		}
		function(n / 2);
		System.out.println(n % 2);
	}

	public static void main(String[] args) {
		function(7);
	}

}

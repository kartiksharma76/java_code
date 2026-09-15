package TraningAdPlacement;

public class DefaltArgument {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a) {
		return add(a, 5); // default b = 5
	}

	public static void main(String[] args) {
		System.out.println(add(10)); // 15
		System.out.println(add(10, 7)); // 17 (if you want to pass both)
	}
}
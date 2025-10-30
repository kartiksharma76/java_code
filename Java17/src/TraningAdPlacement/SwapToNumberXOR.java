package TraningAdPlacement;

public class SwapToNumberXOR {
	public static void main(String[] args) {
		int a = 5;
		int b = 9;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a =" + a + " b =" + b);
	}
}

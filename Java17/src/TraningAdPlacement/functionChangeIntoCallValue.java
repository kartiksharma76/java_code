package TraningAdPlacement;

public class functionChangeIntoCallValue {
	static void swapValue(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		// Print inside the function
		System.out.println("Inside swapValue: x = " + a + ", y = " + b);
	}

	public static void main(String[] args) {
		int x = 10, y = 20;
		swapValue(x, y);
		System.out.println("After swapValue: x = " + x + ", y = " + y);
	}
}
package oops;

interface CalculatorUtility {

	static void message() {
		System.out.println("Static Method Inside Interface");
	}
}

public class StaticInterfaceMethodExample {

	public static void main(String[] args) {

		CalculatorUtility.message();
	}
}

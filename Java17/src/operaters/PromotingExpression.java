package operaters;

public class PromotingExpression {
	public static void main(String args[]) {

		// Declaring and initializing primitive types
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;

		// The Expression
		double result = (f * b) + (i / c) - (d * s);

		// Printing the result obtained after
		// all the promotions are done
		System.out.println("result = " + result);
	}
}

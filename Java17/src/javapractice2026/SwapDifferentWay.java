package javapractice2026;

public class SwapDifferentWay {
	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Before swapping values are..." + a + " " + b);

		// logic 1= Third variable

		/*
		 * int t = a; a=b; b = t;
		 */

		// logic 2 - without third usig + & -
	/* = a + b;//10 + 20= 30
		b = a - b;// 30 - 20 = 10
		a = a - b;//30 - 10 = 20
		*/
		// Logic3  use * and / without third variable
		// here a & b values should not be zero
		/* a  = a * b;// 10 *20 = 200
		 b = a/b;//200/20 = 10
		 a = a/b;// 200/10 = 20*/
		 
		 // logic4 - bitwise XOR(^)
		
		/*a = a^b; // a=1010 b = 10100 = 11110 = 30
		b = a^b; // 30 ^ 20 = 10 
		a = a^b; // 30 ^ 10 = 20
		*/
		
		// logic5 - Single statement
		  b = a + b-(a=b);
		  
		
		System.out.println("after swapping value..." +a+" "+ b);
	}
}

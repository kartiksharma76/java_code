package operaters;
/**
 * Initial value of a: 5
Unary plus (+a): 5
Unary minus (-a): -5
Pre-increment (++a): 6
Post-increment (a++): 6
After post-increment, a: 7
Pre-decrement (--a): 6
Post-decrement (a--): 6
After post-decrement, a: 5
flag: true
!flag: false
 */
public class UnaryOperatorsDemo {
	public static void main(String[] args) {
		int a = 5;
		boolean flag = true;

		System.out.println("Initial value of a: " + a);

		// Unary plus
		System.out.println("Unary plus (+a): " + (+a));

		// Unary minus
		System.out.println("Unary minus (-a): " + (-a));

		// Pre-increment
		System.out.println("Pre-increment (++a): " + (++a));

		// Post-increment
		System.out.println("Post-increment (a++): " + (a++));
		System.out.println("After post-increment, a: " + a);

		// Pre-decrement
		System.out.println("Pre-decrement (--a): " + (--a));

		// Post-decrement
		System.out.println("Post-decrement (a--): " + (a--));
		System.out.println("After post-decrement, a: " + a);

		// Logical NOT
		System.out.println("flag: " + flag);// true
		System.out.println("!flag: " + (!flag));//false
	}
}

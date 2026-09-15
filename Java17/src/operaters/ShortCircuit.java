package operaters;

/**
 * bitwise operaters(&,|,^) are applicable for integral type and boolean type
 * only short circuit operaters (&&,||) are applicable for boolean type only.
 */
public class ShortCircuit {
	public static void main(String[] args) {
		int a = 10;
		if (++a > 20 || ++a > 10) {
			System.out.println(true);
		}
		int b = 30;
		if (++b > 40 || ++b > 50) {
			System.out.println(true);
		}
		System.out.println(a);
		System.out.println(4 & 5);
		System.out.println(true & false);
		// System.out.println(4 && 5);
		System.out.println(true && false);
		System.out.println(false & true);

	}
}

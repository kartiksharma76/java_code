package javabasics;
/**
 * The reference variables a1 and a3 refer to the same long array object. 
 * When the [1] element is updated in the fix() method, it is updating the array referred to by a1.
 * The reference variable a2 refers to the same array object.So Output: 3+7+5+" "3+7+5 
 * Output: 15 15 Because Numeric values will be added
 */
public class PassA {
	public static void main(String[] args) {
		PassA p = new PassA();
		p.start();
	}

	void start() {
		long[] a1 = { 3, 4, 5 };
		long[] a2 = fix(a1);
		System.out.print(a1[0] + a1[1] + a1[2] + " ");
		System.out.println(a2[0] + a2[1] + a2[2]);
	}

	private long[] fix(long[] a3) {
		a3[1] = 7;
		return a3;
	}

}

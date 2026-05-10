package Javaclasses;

/**
 * If you create multiple objects of one class, you can change the attribute
 * values in one object, without affecting the attribute values in the other:
 */
public class MultipleObj {
	int x = 5;

	public static void main(String[] args) {
		MultipleObj myObj1 = new MultipleObj(); // Object 1
		MultipleObj myObj2 = new MultipleObj(); // Object 2
		myObj2.x = 25;
		System.out.println(myObj1.x); // Outputs 5
		System.out.println(myObj2.x); // Outputs 25
	}
}

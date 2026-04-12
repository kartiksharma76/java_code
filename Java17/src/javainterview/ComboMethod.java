package javainterview;

class SuperTest {
	public Object myMethod(Object... args) {
		System.out.println("SuperTest: myMethod(Object... args)");
		return null;

	}
}

class Test extends SuperTest {
	// Method1
	public Object myMethod(String... args) {
		System.out.println("Test: myMethod(String... args)");
		return null;

	}

	// Method 2
	public Object myMethod(Integer[] args) {
		System.out.println("Test: myMethod(Integer[] args)");
		return null;

	}

	// Method 3

	public Object myMethod(Object args) {
		System.out.println("Test: myMethod(Object arg)");
		return null;

	}

// Method 4 (override, not overload)	
	public String myMethod(Object[] args) {
		System.out.println("Test: myMethod(Object[] args)");
		return null;

	}
}

public class ComboMethod {
	public static void main(String[] args) {
		Test obj = new Test();

		obj.myMethod("A", "B"); // Method 1
		obj.myMethod(new Integer[] { 1, 2 }); // Method 2
		obj.myMethod(10); // Method 3
		obj.myMethod(new Object[] { 1, "A" }); // Method 4 (override)
	}
}

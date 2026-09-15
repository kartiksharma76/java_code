package controlflow;

public class Test {
	public void foo(boolean a, boolean b) {
		if (a) {
			System.out.println("A");
		} else if (a && b) {
			System.out.println("A && B");
		} else {
			if (!b) {
				System.out.println("not B");
			} else {
				System.out.println("ELSE");
			}
		}
	}

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("Case 1: a=true b=true");
		t.foo(true, true);

		System.out.println("Case 2: a=true b=false");
		t.foo(true, false);

		System.out.println("Case 3: a=false b=true");
		t.foo(false, true);

		System.out.println("Case 4: a=false b=false");
		t.foo(false, false);
	}
}

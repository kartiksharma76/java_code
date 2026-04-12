package javainterview;

class Sup {
	protected void method() {
		System.out.println("Sup class method");
	}

}

class Sub extends Sup {
	// Correct overriding
	public final void method() {
		System.out.println("Sub class method");
	}
}

public class SubClassMethod {
	public static void main(String[] args) {
		Sup obj = new Sub();
		obj.method();
	}
}

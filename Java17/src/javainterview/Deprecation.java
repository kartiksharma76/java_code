package javainterview;

public class Deprecation {
	@Deprecated
	static void oldMethod() {
		System.out.println("Deprecated Method");
	}

	public static void main(String[] args) {
		oldMethod();
	}
}

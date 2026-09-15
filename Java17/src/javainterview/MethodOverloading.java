package javainterview;

public class MethodOverloading {
	public void test(int i) {
		System.out.println(i);
	}

	public void test(float f) {
		System.out.println(f);
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.test(10);
	}
}

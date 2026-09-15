package Practicesheet;

public class MethodOverloading {
	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.add(2, 3));
		System.out.println(obj.add(2, 3, 4));
	}
}

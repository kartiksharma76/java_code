package operaters;

public class Overloading {
	public static int sum(int a, int b) {
		return (a + b);
	}

	public static int sum(int a, int b, int c) {
		return (a + b + c);

	}

	public static int sum(int a, int b, int c, int d) {
		return (a + b + c + d);

	}

	public static void main(String[] args) {
		Overloading o = new Overloading();
		System.out.println(o.sum(10, 20));
		System.out.println(o.sum(10, 20, 30));
		System.out.println(o.sum(10, 20, 30, 40));

	}
}

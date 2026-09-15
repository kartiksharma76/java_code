package javapractice2026;

public class StaticNested {
	static int x = 20;

	static class Inner {
		void show() {
			System.out.println("X = " + x);
		}
	}

	public static void main(String[] args) {
		StaticNested.Inner obj = new StaticNested.Inner();
		obj.show();
	}
}

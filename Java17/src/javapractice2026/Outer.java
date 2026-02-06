package javapractice2026;

public class Outer {
	int x = 10;

	class Inner {
		void show() {
			System.out.println("X = " + x);
		}
	}

	public static void main(String[] args) {
		Outer obj = new Outer();
		Outer.Inner in = obj.new Inner();
		in.show();
	}
}

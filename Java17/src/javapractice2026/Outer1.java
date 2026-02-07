package javapractice2026;

public class Outer1 {
	void display() {
		class LocalInner {
			void show() {
				System.out.println("Local Inner Class");
			}
		}

		LocalInner obj = new LocalInner();
		obj.show();
	}

	public static void main(String[] args) {
		new Outer1().display();
	}
}

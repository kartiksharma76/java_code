package javapractice2026;

abstract class Test {
	abstract void show();
}

class Demo {
	public static void main(String[] args) {

		Test obj = new Test() {

			@Override
			void show() {
				System.out.println("Anonymous Inner Class");

			}

		};
		obj.show();
	}
}

package javapractice2026;

enum Operation {
	ADD {
		int apply(int a, int b) {
			return a + b;
		}
	},
	SUB {
		int apply(int a, int b) {
			return a - b;
		}
	};

	abstract int apply(int a, int b);
}

public class EnumWithMethod {
	public static void main(String[] args) {
		System.out.println(Operation.ADD.apply(10, 5));
	}
}

package LambdaExpression;

public class LambdaExample {
	public static void main(String[] args) {
		Operations addition = (a, b) -> a + b;
		Operations subtraction = (a, b) -> a - b;
		Operations multiplication = (a, b) -> a * b;
		Operations division = (a, b) -> {
			if (b == 0) {
				System.out.println("can  not be driven");
				return 0;
			}

			return a / b;
		};

		System.out.println(addition.calculator(10, 20));
		System.out.println(subtraction.calculator(10, 20));

		System.out.println(multiplication.calculator(10, 20));

		System.out.println(division.calculator(10, 20));

	}
}

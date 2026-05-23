package InfosysSpringboard;

class Calculator {
	// Method to find the average of three integers
	public double findAverage(int number1, int number2, int number3) {
		double average = (number1 + number2 + number3) / 3.0;

		// Rounding off to two decimal digits
		return Math.round(average * 100.0) / 100.0;
	}
}

class Calci {
	public static void main(String args[]) {
		Calculator calculator = new Calculator();

		// Test Case 1
		double avg1 = calculator.findAverage(12, 8, 15);
		System.out.println(avg1); // Expected Output: 11.67

		// Test Case 2
		double avg2 = calculator.findAverage(10, 20, 30);
		System.out.println(avg2); // Expected Output: 20.0
	}
}
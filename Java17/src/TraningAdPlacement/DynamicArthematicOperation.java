package TraningAdPlacement;

import java.util.Scanner;

public class DynamicArthematicOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter operator (+, -, *, /):");
        String op = sc.next();

        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        double result = performResult(num1, op, num2);
        if (!Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }

    private static double performResult(double a, String op, double b) {
        if (op.equals("+")) {
            return a + b;
        } else if (op.equals("-")) {
            return a - b;
        } else if (op.equals("*")) {
            return a * b;
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Error: Division by zero");
                return Double.NaN;
            }
            return a / b;
        } else {
            System.out.println("Invalid operator or operation not supported (modulus excluded).");
            return Double.NaN;
        }
    }
}

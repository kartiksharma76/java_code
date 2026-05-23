package InfosysSpringboard;

public class Tester {
	public static void main(String[] args) {
		// Sample Input
		double a = 1, b = 4, c = 4;

		double discriminant = (b * b) - (4 * a * c);

		if (discriminant == 0) {
			double root = -b / (2 * a);
			System.out.println("The root is " + root);
		} else if (discriminant > 0) {
			double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			System.out.println("The roots are " + root1 + " and " + root2);
		} else {
			System.out.println("The equation has no real roots");
		}
	}
}

package controlflow;

public class Eligible2 {
	public static void main(String[] args) {
		eligible(8, 7.54);
	}

	public static void eligible(int regd, double CGPA) {

		if (CGPA >= 8) {
			System.out.println(regd + "is eligible for companies: google,microsoft");

		} else if (CGPA >= 7) {
			System.out.println(regd + "is eligible for companies :tutrial point,accenture");

		} else if (CGPA >= 6) {
			System.out.println(regd + "is eligible for companies: sybertech,rtcamp");

		} else if (CGPA >= 5) {
			System.out.println(regd + "is eligible for companies:patronics,beta");

		} else {
			System.out.println("improve yourself");
		}

	}
}

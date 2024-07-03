package controlflow;

public class Eligible1 {
	public static void main(String[] args) {
		int regd = 9;
		double CGPA = 8.08;
		if (CGPA >= 8) {
			System.out.println(regd + "is eligible for companies:google,microshoft,amazon,Dell,wipro");

		} else if (CGPA >= 7) {
			System.out.println(regd + "is eligible for companies:rellins,emicon ");

		} else if (CGPA >= 6) {
			System.out.println(regd + "is elligible for companies:sybertech,raymond");

		} else if (CGPA >= 5) {
			System.out.println(regd + "is elligible for companies:beta,nobroke");

		} else {
			System.out.println("improve yourself");
		}
	}

}

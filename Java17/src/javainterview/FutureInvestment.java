package javainterview;

public class FutureInvestment {
	public static void main(String[] args) {
		double p = 1000, r = 5, t = 2;
		double fv = p * Math.pow((1 + r / 100), t);
		System.out.println("Future Value = " + fv);
	}
}

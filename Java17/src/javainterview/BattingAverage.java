package javainterview;

public class BattingAverage {
	public static void main(String[] args) {
		int runs = 500, innings = 10, notOut = 2;
		double avg = runs / (double) (innings - notOut);
		System.out.println("Average = " + avg);
	}
}

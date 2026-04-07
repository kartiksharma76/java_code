package javainterview;

public class CGPA {
	public static void main(String[] args) {
		double marks[] = { 8, 7.5, 9, 6.5 };
		double sum = 0;

		for (double m : marks)
			sum += m;
		System.out.println("CGPA = " + (sum / marks.length));
	}
}

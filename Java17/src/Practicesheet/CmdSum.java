package Practicesheet;

public class CmdSum {
	public static void main(String[] args) {
		int sum = 0;
		for (String s : args) {
			sum += Integer.parseInt(s);
		}
		System.out.println("Sum = " + sum);
	}
}

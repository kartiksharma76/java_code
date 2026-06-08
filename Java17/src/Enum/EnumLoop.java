package Enum;

enum Month {
	JAN, FEB, MAR, APR
}

public class EnumLoop {
	public static void main(String[] args) {
		for (Month m : Month.values()) {
			System.out.println(m);
		}
	}
}

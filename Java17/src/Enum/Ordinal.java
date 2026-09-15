package Enum;

enum Dayss {
	MONDAY, TUESDAY, WEDNESDAY
}

public class Ordinal {
	public static void main(String[] args) {
		System.out.println(Dayss.MONDAY.ordinal());
		System.out.println(Dayss.WEDNESDAY.ordinal());
		System.out.println(Day.MONDAY.name());
	}
}

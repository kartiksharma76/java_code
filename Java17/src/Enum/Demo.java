package Enum;

enum Days {
	MONDAY, TUESDAY, WUEDNESDAY
}

public class Demo {
	public static void main(String[] args) {

		Days[] days = Days.values();
		for (Days d : days) {
			System.out.println(d);
		}
	}
}

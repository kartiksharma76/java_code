package Enum;

enum Week {
	MONDAY, TUESDAY, WEDNESDAY
}

public class EnumWithSwitch {
	public static void main(String[] args) {
		Week w = Week.TUESDAY;

		switch (w) {
		case MONDAY:
			System.out.println("Start");
			break;

		case TUESDAY:
			System.out.println("Work");
			break;

		case WEDNESDAY:
			System.out.println("Mid Week");
			break;
		}
	}
}

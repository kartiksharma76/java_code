package javapractice2026;

enum Color {
	RED, GREEN, BLUE
}

public class EnumSwitch {
	public static void main(String[] args) {
		Color c = Color.GREEN;

		switch (c) {
		case RED:
			System.out.println("Stop");
			break;
		case GREEN:
			System.out.println("Go");
			break;
		case BLUE:
			System.out.println("Cool");
			break;
		}
	}

}

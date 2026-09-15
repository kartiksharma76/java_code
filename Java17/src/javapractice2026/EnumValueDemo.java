package javapractice2026;

enum Level {
	LOW(1), MEDIUM(2), HIGH(3);

	int value;

	Level(int v) {
		value = v;
	}
}

public class EnumValueDemo {
	public static void main(String[] args) {
		Level l = Level.HIGH;
		System.out.println(l.value);
	}
}

package oops;

enum ApplicationSettings {

	INSTANCE;

	public void showMessage() {
		System.out.println("Singleton Using Enum");
	}
}

public class EnumSingletonExample {

	public static void main(String[] args) {

		ApplicationSettings settings1 = ApplicationSettings.INSTANCE;
		ApplicationSettings settings2 = ApplicationSettings.INSTANCE;

		settings1.showMessage();

		System.out.println(settings1 == settings2);
	}
}
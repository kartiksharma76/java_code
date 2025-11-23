package nqttop150;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Hello";
		String revrsed = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed :" + revrsed);
	}
}

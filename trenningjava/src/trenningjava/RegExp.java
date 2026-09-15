package trenningjava;

public class RegExp {
	public static void main(String[] args) {

		String name = "aubair";
		String cells = "7828201241";
		String email = "zubair@gmail.com";

		String nameRegex = "[A-Z]{1}[a-z}{3,}";
		String cellRgex = "[6-9]{1}[0-9]{9}";
		String emailRgex = "";

		System.out.println(name.matches(nameRegex));
		System.out.println(cells.matches(cellRgex));
		System.out.println(email.matches(emailRgex));
	}
}

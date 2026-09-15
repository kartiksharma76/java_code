package nqttop150;

import java.util.Arrays;
import java.util.Base64;

public class Encode {
	public static void main(String[] args) {
		String[] input = { "prepinsta", "course", "are", "best" };
		String[] encoded = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			encoded[i] = Base64.getEncoder().encodeToString(input[i].getBytes());

		}
		System.out.println(Arrays.toString(encoded));
	}
}

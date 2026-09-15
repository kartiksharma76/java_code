package nqttop150;

import java.util.Arrays;
import java.util.Base64;

public class DecodeA1 {
	public static void main(String[] args) {
		String[] input = { "d2U=", "c2F5", " Og==", "eWVz" }; // Already Base64 encoded

		String[] decoded = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			byte[] bytes = Base64.getDecoder().decode(input[i].trim());
			decoded[i] = new String(bytes);
		}

		System.out.println(Arrays.toString(decoded));
	}
}

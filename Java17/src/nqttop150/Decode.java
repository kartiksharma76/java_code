package nqttop150;

import java.util.Arrays;
import java.util.Base64;

public class Decode {
	public static void main(String[] args) {
		String[] encoded = { "cHJlcGluc3Rh", "Y291cnNl", "YXJl", "YmVzdA==" };
		String[] decoded = new String[encoded.length];
		for (int i = 0; i < encoded.length; i++) {
			byte[] bytes = Base64.getDecoder().decode(encoded[i]);
			decoded[i] = new String(bytes);
		}
		System.out.println(Arrays.toString(decoded));
	}
}

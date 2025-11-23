package Stream;

import java.util.Arrays;
import java.util.List;

public class CountStringCharacter {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "JDBC", "Python");
		long count = words.stream().filter(w -> w.startsWith("J")).count();
		System.out.println(count);
	}
}

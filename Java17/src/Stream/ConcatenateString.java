package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateString {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "API");
		String result = words.stream().collect(Collectors.joining());
		System.out.println(result);
	}
}

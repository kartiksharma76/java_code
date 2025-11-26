package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinWordWithComma {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "API");
		String joined = words.stream().collect(Collectors.joining(", "));
		System.out.println(joined); // Java, Stream, API
	}
}

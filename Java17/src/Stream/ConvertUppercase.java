package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUppercase {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "stream", "lambda");
		List<String> upper = words.stream().map(String::toUpperCase).collect(Collectors.toList());
		upper.forEach(System.out::println);
	}
}

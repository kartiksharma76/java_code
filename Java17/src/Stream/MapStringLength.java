package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStringLength {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "Example");
		List<Integer> length = words.stream().map(String::length).collect(Collectors.toList());
		length.forEach(System.out::println);
	}
}

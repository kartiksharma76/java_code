package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Banana", "Apple", "Orange");
		List<String> sorted = words.stream().sorted().collect(Collectors.toList());
		sorted.forEach(System.out::println);
	}
}

package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterLength {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "API", "Lambda");
		List<String> filtered = words.stream().filter(w -> w.length() > 4).collect(Collectors.toList());
		filtered.forEach(System.out::println);
	}
}

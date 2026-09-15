package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequecy {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "Java", "API");
		Map<String, Long> freq = words.stream().collect(Collectors.groupingBy(w -> w, Collectors.counting()));
		System.out.println(freq);
	}
}

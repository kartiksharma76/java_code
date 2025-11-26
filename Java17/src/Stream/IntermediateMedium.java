package Stream;

import java.util.Arrays;
import java.util.List;

public class IntermediateMedium {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Banana", "Apple", "Avocado");
		words.stream().filter(w -> w.startsWith("A")).findFirst().ifPresent(System.out::println);
	}
}

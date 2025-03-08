package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class FirstNonNullExample {
	public static void main(String[] args) {
		List<String> data = Arrays.asList(null, null, "kartik", "twinkle", null, "prince");
		Optional<String> firstnonNull = data.stream().filter(Objects::nonNull).findFirst();

		firstnonNull.ifPresentOrElse(value -> System.out.println("First non-null element: " + value),
				() -> System.out.println("No non-null elements found"));
	}
}

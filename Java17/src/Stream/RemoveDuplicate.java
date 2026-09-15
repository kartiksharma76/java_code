package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4);
		List<Integer> distint = numbers.stream().distinct().collect(Collectors.toList());
		distint.forEach(System.out::println);
	}
}

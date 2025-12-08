package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEvenOdd {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evennumbers = number.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		evennumbers.forEach(System.out::println);
	}
}

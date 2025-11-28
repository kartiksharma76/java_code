package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfSquare {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());
		squares.forEach(System.out::println);
	}
}

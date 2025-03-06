package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfelementDivisible {
//. Write a program to filter out all the elements divisible by 3 and 5 from a list of integers using Java Stream API.
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
		List<Integer> divisibleBy3And5 = numbers.stream().filter(n -> n % 2 == 0 && n % 5 == 0)
				.collect(Collectors.toList());
		System.out.println("Numbers divisible by 2 and 5: " + divisibleBy3And5);
	}
}

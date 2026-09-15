package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOdd {
//Given a list of integers, write a program to find and print the distinct odd numbers using Java Stream API.
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> distinctOddNumbers = numbers.stream().filter(n -> n % 2 != 0).distinct()
				.collect(Collectors.toList());

		System.out.println("Distinct odd numbers: " + distinctOddNumbers);
	}
}

package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GiveTheListOfInteger {
	public static void main(String[] args) {

		/*
		 * Given a List of integers, return a List which contains square of those
		 * numbers. For example, input list is [1, 2, 3, 4, 5, 6] then you should return
		 * a list containing [1, 4, 9, 16, 25, 6]
		 */
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		// Using map to compute square of each element
		List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());

		// Printing the result
		System.out.println(squaredNumbers);
	}
}

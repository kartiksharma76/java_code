package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfSquare {
//Write a program to convert a list of integers to a list of their squares using Java Stream API.
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squares = numbers.stream().map(n -> n * n).collect(Collectors.toList());
		System.out.println("Original list: " + numbers);
		System.out.println("List of squares: " + squares);
	}
}

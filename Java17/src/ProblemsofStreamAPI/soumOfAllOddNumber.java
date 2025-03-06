package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;

public class soumOfAllOddNumber {
//Given a list of integers, write a program to find and print the sum of all odd numbers using Java Stream API.
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sumOfOddNumbers = numbers.stream().filter(n -> n % 2 != 0).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
	}
}

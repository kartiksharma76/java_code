package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SecondLargest {
//Given a list of integers, write a program to find and print the second largest number using Java Stream API.
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(4, 2, 8, 6, 10);
		Optional<Integer> secondLargest = numbers.stream().sorted((num1, num2) -> num2 - num1).skip(1).findFirst();
		System.out.println("Second largest number: " + (secondLargest.isPresent() ? secondLargest.get() : "N/A"));
	}
}

package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemovedDuplicate {
//Write a program to remove all the duplicate elements from a list using Java Stream API.
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1);
		List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println("Original list: " + numbers);
		System.out.println("List with duplicates removed: " + uniqueNumbers);
	}
}

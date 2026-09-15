package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Average {
//6. Given a list of integers, write a program to calculate the average of all the numbers using Java Stream API.
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
		System.out.println("Average: " + (average.isPresent() ? average.getAsDouble() : "N/A"));
	}
}

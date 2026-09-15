package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
//2. Given a list of integers, write a program to find and print the maximum element using Java Stream API
public class MaxElement {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 8, 6, 10);
		int max = numbers.stream().mapToInt(Integer::intValue).max().orElseThrow();
		System.out.println("Max element: " + max);
	}
}

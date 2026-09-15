package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;

//Write a program to find the sum of all elements in a list using Java Stream API
public class ArraySum {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);
		int sum = number.stream().mapToInt(Integer::intValue).sum();

		System.out.println("sum:" + sum);
	}

}

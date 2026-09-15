package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;

public class ProductOfAllElement {
//Write a program to find the product of all elements in a list of integers using Java Stream API.
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int product = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println("Product of all elements: " + product);
	}
}

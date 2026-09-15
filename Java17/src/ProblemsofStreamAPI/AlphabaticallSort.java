package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlphabaticallSort {
//Write a program to sort a list of strings in alphabetical order using Java Stream API.
	public static void main(String[] args) {
		List<String> str = Arrays.asList("kartik", "Twinkle", "prince", "ritika", "riya");
		List<String> sorted = str.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
	}
}

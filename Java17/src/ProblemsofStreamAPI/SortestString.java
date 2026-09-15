package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortestString {
//Given a list of strings, write a program to find and print the shortest string using Java Stream API.
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("kartik", "Twinkle", "prince", "ritika", "riya");
		String shortestString = strings.stream().min(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println("Shortest string: " + shortestString);
	}

}

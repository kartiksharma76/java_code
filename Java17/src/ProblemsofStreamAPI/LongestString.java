package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestString {
// Write a program to find the longest string in a list of strings using Java Stream API.
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("kartik", "Twinkle", "prince", "ritika", "riya");
		Optional<String> longestString = strings.stream().max((str1, str2) -> str1.length() - str2.length());
		System.out.println("Longest string: " + (longestString.isPresent() ? longestString.get() : "N/A"));
	}
}

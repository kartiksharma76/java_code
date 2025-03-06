package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaximumLength {
//Given a list of strings, write a program to find and print the strings with the maximum length using Java Stream API
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("kartik", "Twinkle", "prince", "ritika", "riya");
		Optional<String> maxLengthString = strings.stream().max(Comparator.comparingInt(String::length));
		maxLengthString.ifPresent(s -> System.out.println("String with maximum length: " + s));
	}
}

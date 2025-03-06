package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreaterThanSpecificValueIsFive {
//Given a list of strings, write a program to find and print the strings with length greater than a specified value 5 using Java Stream API.
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("kartik", "Twinkle", "prince", "ritika", "riya");
		int minLength = 5;
		List<String> longStrings = strings.stream().filter(s -> s.length() > minLength).collect(Collectors.toList());
		System.out.println("Strings with length greater than " + minLength + ": " + longStrings);
	}
}

package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Concatination {
//Given a list of strings, write a program to concatenate all the strings using Java Stream API.
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("kartik", "Twinkle", "prince", "ritika", "riya");
		String concatenatedString = strings.stream().collect(Collectors.joining());
		System.out.println("Concatenated string: " + concatenatedString);
	}
}

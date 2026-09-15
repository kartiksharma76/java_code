package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;

public class StringContaining {
//Given a list of strings, write a program to count the number of strings containing a specific character ‘a’ using Java Stream API.
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("kartik", "Twinkle", "prince", "ritika", "riya");
		char searchChar = 'a';
		long count = strings.stream().filter(str -> str.contains(String.valueOf(searchChar))).count();
		System.out.println("Number of strings containing '" + searchChar + "': " + count);
	}
}
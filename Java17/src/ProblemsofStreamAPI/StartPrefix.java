package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartPrefix {
// Given a list of strings, write a program to find and print the strings starting with a specific prefix ‘a’ using Java Stream API.
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("kartik", "Twinkle", "prince", "ritika", "riya");
		String prefix = "k";
		List<String> stringsWithPrefix = strings.stream().filter(s -> s.startsWith(prefix))
				.collect(Collectors.toList());
		System.out.println("Strings starting with prefix '" + prefix + "': " + stringsWithPrefix);
	}
}

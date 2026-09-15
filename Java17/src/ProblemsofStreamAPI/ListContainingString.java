package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;

public class ListContainingString {
//Write a program to check if a list of strings contains a specific string using Java Stream API.
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("kartik", "Twinkle", "prince", "ritika", "riya");
		String target = "banana";
		boolean containsString = strings.stream().anyMatch(s -> s.equals(target));
		System.out.println("List contains string '" + target + "': " + containsString);
	}
}

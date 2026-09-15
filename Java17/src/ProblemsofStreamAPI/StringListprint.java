package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//5. Write a program to convert a list of strings to uppercase using Java Stream API.
public class StringListprint {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("kartik", "Twinkle", "prince", "ritika", "riya");
		List<String> list = str.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(list);
	}
}

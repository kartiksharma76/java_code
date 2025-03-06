package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseListOfString {
//Write a program to reverse a list of strings using Java Stream API.
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("kartik", "Twinkle", "prince", "ritika", "riya");
		Collections.reverse(strings);
		System.out.println("Reversed list: " + strings);
	}
}

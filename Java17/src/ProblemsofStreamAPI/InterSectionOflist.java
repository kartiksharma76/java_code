package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InterSectionOflist {
//. Write a program to find the intersection of two lists of strings using Java Stream API.
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("kartik", "Twinkle", "prince", "ritika", "riya");
		List<String> list2 = Arrays.asList("kartik", "aman", "prince", "mahesh");
		List<String> intersection = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println("Intersection of lists: " + intersection);
	}
}

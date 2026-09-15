package Java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("kartik", "ankit", "aman");
		List<String> filtered = names.stream().filter(name -> name.startsWith("K")).collect(Collectors.toList());
		System.out.println(filtered);
	}
}

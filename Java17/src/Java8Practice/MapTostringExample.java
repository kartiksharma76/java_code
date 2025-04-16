package Java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapTostringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("kartik", "ankit", "aman");
		names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(names);
	}
}

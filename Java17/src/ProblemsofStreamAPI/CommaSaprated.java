package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommaSaprated {
	public static void main(String[] args) {
		List<String> data = Arrays.asList("kartik", "kishan", "mohan", "mani");
		String collect = data.stream().collect(Collectors.joining(","));
		System.out.println(collect);
		List<Integer> data1 = Arrays.asList(1, 2, 3, 4, 5);
		String string = data1.stream().map(String::valueOf).collect(Collectors.joining(","));
		System.out.println(string);
	}
}
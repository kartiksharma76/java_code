package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageExample1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Double average = list.stream().collect(Collectors.averagingInt(Integer::intValue));
		System.out.println(average);

	}
}

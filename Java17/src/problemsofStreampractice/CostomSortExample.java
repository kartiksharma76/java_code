package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CostomSortExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 2, 6, 4, 8);
		List<Integer> collect = list.stream().sorted((a, b) -> b - a).collect(Collectors.toList());
		System.out.println(collect);
	}
}

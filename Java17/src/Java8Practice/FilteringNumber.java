package Java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilteringNumber {
	public static void main(String[] args) {
		List<Integer> even = Arrays.asList(10, 23, 45, 67, 20, 40, 80);
		List<Integer> list = even.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		list.forEach((n) -> System.out.println(n));
	}
}

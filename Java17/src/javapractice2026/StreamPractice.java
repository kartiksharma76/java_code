package javapractice2026;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPractice {
	public static void main(String[] args) {
//filter
		System.out.println("Filter:");
		List<Integer> list = Arrays.asList(10, 15, 20, 30);
		List<Integer> collect = list.stream().filter(n -> n > 15).collect(Collectors.toList());
		System.out.println(collect);

//map() -> transformation
		System.out.println("map() -> transformation:");
		list.stream().map(n -> n * 2).forEach(System.out::println);

//Chaining multiple operations
		System.out.println("Chaining multiple operations: ");
		list.stream().filter(n -> n > 15).map(n -> n * n).forEach(System.out::println);

//findFirst() & findAny()
		System.out.println("findFirst() & findAny()");
		int first = list.stream().filter(n -> n > 15).findFirst().get();
		System.out.println(first);

//anyMatch, allMatch, noneMatch
		System.out.println("anyMatch, allMatch, noneMatch");
		boolean hasEven = list.stream().anyMatch(n -> n % 2 == 0);
		boolean allPositive = list.stream().allMatch(n -> n > 0);
		boolean noneNegative = list.stream().noneMatch(n -> n < 0);

//limit() and skip()
		System.out.println("limit() and skip()");
		list.stream().limit(2).forEach(System.out::println);
		list.stream().skip(2).forEach(System.out::println);

//reduce()
		System.out.println("reduce()");
		int sum = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);

//Stream with Comparator
		System.out.println("Stream with Comparator:");
		list.stream().sorted((a, b) -> b - a).forEach(System.out::println);

//Stream on Map
		System.out.println("Stream on Map:");
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");

		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

	}
}

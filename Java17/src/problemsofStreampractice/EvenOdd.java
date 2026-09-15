package problemsofStreampractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOdd {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

		// print even
		List<Integer> even = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("print even number:" + even);

//print odd
		List<Integer> odd = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println("print odd number:" + odd);

		List<Integer> collect = list.stream().filter(i -> i > 5).collect(Collectors.toList());
		System.out.println(collect);

		List<Integer> numbersAndNegatives = list.stream().flatMap(x -> Stream.of(x, -x)).collect(Collectors.toList());
//numbersAndNegatives.forEach(x -> System.out.println(x));
		System.out.println(numbersAndNegatives);

		System.out.println("\nprint the number of multiple:");
		list.stream().filter(i -> i % 5 == 0).forEach(System.out::println);

		// length of list
		List<Integer> lengths = list.stream().map(x -> String.valueOf(Math.abs(x)).length())
				.collect(Collectors.toList());
		System.out.println(lengths);

		// reversed order
		List<Integer> reversedList = list.stream()
				.map(num -> Integer.parseInt(new StringBuilder(String.valueOf(Math.abs(num))).reverse().toString())
						* (num < 0 ? -1 : 1))
				.collect(Collectors.toList());
		Collections.reverse(reversedList);
		System.out.println(reversedList);

		// max and min
		int max = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println("maximumelement:" + max);
		int min = list.stream().min(Comparator.naturalOrder()).get();
		System.out.println("minimumelement:" + min);

		// power of 2
		List<Integer> collect2 = list.stream().map(x -> (int) Math.pow(x, 2)).collect(Collectors.toList());
		System.out.println(collect2);

		// power of 3
		List<Integer> collect3 = list.stream().map(x -> (int) Math.pow(x, 3)).collect(Collectors.toList());
		System.out.println(collect3);
	}
}

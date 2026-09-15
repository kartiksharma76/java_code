package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenList {
	public static void main(String[] args) {
		List<List<Integer>> listofLists = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
		List<Integer> flatList = listofLists.stream().flatMap(List::stream).collect(Collectors.toList());
		flatList.forEach(System.out::println);
	}
}

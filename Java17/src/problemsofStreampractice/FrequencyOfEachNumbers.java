package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
//How do you find frequency of each element in an array or a list?

public class FrequencyOfEachNumbers {
	public static void main(String[] args) {
		List<String> stationaryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
				"Note Book", "Pencil");
		Map<String, Long> stationaryListcountMap = stationaryList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(stationaryListcountMap);
	}
}

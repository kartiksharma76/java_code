package Java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyofNames {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ishita", "kartik", "kartik", "kirtan", "ishita", "kirtan", "jamal",
				"twinkle");
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
		map.forEach((name, count) -> System.out.println(name + "=>" + count));
	}
}

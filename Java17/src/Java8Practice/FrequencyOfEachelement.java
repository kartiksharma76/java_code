package Java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachelement {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Kartik","Kartik" ,"kishan", "mohan", "manish");
		Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
		collect.forEach((name, count) -> System.out.println(name + " :" + count));
	}
}

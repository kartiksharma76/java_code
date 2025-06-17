package nqttop150;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class LongSubStringWithoutRepeating {
	public static void main(String[] args) {
		String inputString = "zxyzxyz";
		Map<Character, Long> charCountMap = inputString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCountMap);
	}
}

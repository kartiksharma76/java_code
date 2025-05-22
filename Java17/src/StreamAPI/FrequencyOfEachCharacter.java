package StreamAPI;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacter {
	public static void main(String[] args) {
		String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		// Filter only uppercase A-Z and collect frequency using streams
		Map<Character, Long> frequencyMap = input.chars().mapToObj(c -> (char) c).filter(c -> c >= 'A' && c <= 'Z')
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Display frequency of A-Z, even if some are 0
		for (char c = 'A'; c <= 'Z'; c++) {
			long count = frequencyMap.getOrDefault(c, 0L);
			System.out.println(c + " = " + count);
		}
	}
}

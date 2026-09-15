package ProblemsofStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlphabitacallySort {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("kartik", "Twinkle", "prince", "ritika", "riya");
		List<String> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
	}
}
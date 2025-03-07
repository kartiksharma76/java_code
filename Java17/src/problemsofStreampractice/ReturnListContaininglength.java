package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a List of Strings, return a List containing the lengths of those
 * strings. Input: ["aman", "bimlesh", "kartik", "Twinkle"] Output: [4, 7, 6, 7]
 * 
 */
public class ReturnListContaininglength {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("aman", "bimlesh", "kartik", "twinkle");
		List<Integer> lengths = str.stream().map(String::length).collect(Collectors.toList());
		System.out.println(lengths);
	}
}

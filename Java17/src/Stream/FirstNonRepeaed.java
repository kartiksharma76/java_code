package Stream;

import java.util.Optional;

public class FirstNonRepeaed {
	public static void main(String[] args) {
		String s = "swiss";
		Optional<Character> first = s.chars().mapToObj(c -> (char) c).filter(c -> s.indexOf(c) == s.lastIndexOf(c))
				.findFirst();
		first.ifPresent(System.out::println); // w
	}
}

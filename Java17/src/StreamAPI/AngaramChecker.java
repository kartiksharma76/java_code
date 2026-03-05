package StreamAPI;

import java.util.stream.Collectors;

public class AngaramChecker {
	public static boolean isAngaram(String s1, String s2) {
		String sorted1 = s1.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
		String sorted2 = s1.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());

		return sorted1.equals(sorted2);

	}

	public static void main(String[] args) {
		System.out.println(isAngaram("LISTEN", "SILENT"));
	}
}

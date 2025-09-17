package DsaImp;

import java.util.stream.Collectors;

public class AngramCheckerJavaStream {
	public static boolean isAnagram(String s1, String s2) {
		String sorted1 = s1.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
		String sorted2 = s2.chars().sorted().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
		return sorted1.equals(sorted2);
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("lsiten", "silent"));
	}
}

package DsaImp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintAllAnagramAtogether {
	public static void printAngaramsTogether(String[] words) {
		Map<String, List<String>> angaramGroup = new HashMap<>();

		for (String word : words) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String sortedWord = new String(chars);
			angaramGroup.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
		}

		int groupNum = 1;

		for (List<String> group : angaramGroup.values()) {
			System.out.print("Group " + groupNum + " : ");
			for (String word : group) {
				System.out.print(word + " ");
			}
			System.out.println();
			groupNum++;
		}
	}

	public static void main(String[] args) {
		String[] words = { "cat", "dog", "tac", "god", "act", "good" };
		printAngaramsTogether(words);
	}
}

package sorting;

import java.util.Arrays;

public class ReorderLogFiles {

	static String[] reorderLogFiles(String[] logs) {

		Arrays.sort(logs, (a, b) -> {

			int index1 = a.indexOf(' ');
			int index2 = b.indexOf(' ');

			String id1 = a.substring(0, index1);
			String id2 = b.substring(0, index2);

			String log1 = a.substring(index1 + 1);
			String log2 = b.substring(index2 + 1);

			boolean isDigit1 = Character.isDigit(log1.charAt(0));
			boolean isDigit2 = Character.isDigit(log2.charAt(0));

			if (!isDigit1 && !isDigit2) {

				int cmp = log1.compareTo(log2);

				if (cmp != 0)
					return cmp;

				return id1.compareTo(id2);
			}

			if (!isDigit1 && isDigit2)
				return -1;

			if (isDigit1 && !isDigit2)
				return 1;

			return 0;
		});

		return logs;
	}

	public static void main(String[] args) {

		String[] logs = { "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero" };

		logs = reorderLogFiles(logs);

		for (String log : logs)
			System.out.println(log);
	}
}
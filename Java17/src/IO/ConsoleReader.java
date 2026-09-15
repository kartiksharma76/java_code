package IO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class ConsoleReader {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		System.out.println("Enter the value and type stop to exit");
		Scanner sc = null;

		try {
			// int value = System.in.read();
			sc = new Scanner(System.in);

			while (sc.hasNext()) {
				String value = sc.next();
				// String value = sc.nextLine().trim();
				if ("stop".equalsIgnoreCase(value)) {
					break;
				}
				if (value.contains(",")) {

					StringTokenizer st = new StringTokenizer(value, ",");
					while (st.hasMoreTokens()) {
						String nextToken = st.nextToken();
						// System.out.println(nextToken);
						list.add(nextToken);
					}
				} else {
					// System.out.println(value);
					list.add(value);
				}
			}

			Map<String, Long> collect = list.stream()
					.collect(Collectors.groupingBy(name -> name, Collectors.counting()));
			collect.forEach((a, b) -> System.out.println(a + " " + b));
			System.out.println(list);

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}
}
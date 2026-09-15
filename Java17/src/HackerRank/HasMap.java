package HackerRank;

/**
 * 3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry
 */
import java.util.HashMap;
import java.util.Scanner;

public class HasMap {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> phonebook = new HashMap<>();
		int n = Integer.parseInt(scanner.nextLine());

		for (int i = 0; i < n; i++) {
			String name = scanner.nextLine();
			String phone = scanner.nextLine();
			phonebook.put(name, phone);
		}
		while (scanner.hasNextLine()) {
			String query = scanner.nextLine();
			if (phonebook.containsKey(query)) {
				System.out.println(query + "=" + phonebook.get(query));
			} else {
				System.out.println("not found");
			}
		}
		scanner.close();
	}
}

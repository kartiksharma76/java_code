package companywisequestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MutualFriends {
	public static void main(String[] args) {

		Set<String> userA = new HashSet<>(Arrays.asList("Ram", "Shyam", "Amit"));
		Set<String> userB = new HashSet<>(Arrays.asList("Amit", "Shyam", "Ravi"));

		userA.retainAll(userB);

		System.out.println("Mutual Friends: " + userA);
	}
}

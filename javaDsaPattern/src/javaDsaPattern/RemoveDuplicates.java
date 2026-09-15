package javaDsaPattern;
/**
 * Explanation
 *LinkedHashSet duplicate values remove karta hai.
 *Insertion order bhi maintain karta hai.
 *Har ID ko set me add karte hain.
 *Duplicate automatically ignore ho jata hai.
 *Time Complexity: O(n)
 *
 */
import java.util.LinkedHashSet;
import java.util.Set;

//Question:
//User IDs ki list me duplicate IDs aa rahi hain.
//Duplicate remove karke unique IDs kaise rakhoge?
public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] ids = { 101, 102, 101, 103, 102, 104 };
		Set<Integer> uniqueIds = new LinkedHashSet<>();

		for (int id : ids) {
			uniqueIds.add(id);
		}
		System.out.println("Unique IDs: " + uniqueIds);
	}
}

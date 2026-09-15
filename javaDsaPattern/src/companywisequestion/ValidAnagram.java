package companywisequestion;

import java.util.Arrays;

//Question:
//Search engine me do words anagram hain ya nahi verify karna hai.
public class ValidAnagram {
	public static void main(String[] args) {
		String word1 = "listen";
		String word2 = "silent";

		char[] arr1 = word1.toCharArray();
		char[] arr2 = word2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println("Anagram: " + Arrays.equals(arr1, arr2));

	}
}
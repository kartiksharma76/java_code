package Practicesheet;

/**
 * String Programs
1. Java Program to Get a Character From the Given String
2. Java Program to Reverse a String Using Stacks
3. Java Program to Sort a String
4. Java Program to Swapping Pair of Characters
5. Java Program to Check Whether the Given String is Pangram
6. Java Program to Remove leading zeros
7. Java Program to Compare two strings
8. Java Program to Compare two strings lexicographically
9. Java Program to Insert a string into another string
10. Java Program to Splitting into a number of sub-strings
 */
import java.util.*;

public class StringProgramme {

	public static void main(String[] args) {

		String str = "JAVA PROGRAMMING";

		// 1. Get a character from given string
		System.out.println("Character at index 2: " + str.charAt(2));

		// 2. Reverse a string using Stack
		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			stack.push(ch);
		}
		String reversed = "";
		while (!stack.isEmpty()) {
			reversed += stack.pop();
		}
		System.out.println("Reversed String: " + reversed);

		// 3. Sort a string
		char[] chars = str.replace(" ", "").toCharArray();
		Arrays.sort(chars);
		System.out.println("Sorted String: " + new String(chars));

		// 4. Swapping pair of characters
		char[] pair = str.toCharArray();
		for (int i = 0; i < pair.length - 1; i += 2) {
			char temp = pair[i];
			pair[i] = pair[i + 1];
			pair[i + 1] = temp;
		}
		System.out.println("Swapped Pairs: " + new String(pair));

		// 5. Check Pangram
		String pangram = "abcdefghijklmnopqrstuvwxyz";
		boolean isPangram = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!pangram.contains(String.valueOf(ch))) {
				isPangram = false;
				break;
			}
		}
		System.out.println("Is Pangram: " + isPangram);

		// 6. Remove leading zeros
		String num = "000123450";
		String noZeros = num.replaceFirst("^0+", "");
		System.out.println("After removing zeros: " + noZeros);

		// 7. Compare two strings
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println("Equals: " + s1.equals(s2));

		// 8. Lexicographical comparison
		String a = "Apple";
		String b = "Banana";
		System.out.println("Lexicographical Compare: " + a.compareTo(b));

		// 9. Insert a string into another string
		String mainStr = "I Love Java";
		String insertStr = "Programming ";
		String result = mainStr.substring(0, 7) + insertStr + mainStr.substring(7);
		System.out.println("After Insertion: " + result);

		// 10. Splitting into substrings
		String sentence = "Java is very powerful";
		String[] words = sentence.split(" ");
		System.out.println("Splitted Strings:");
		for (String w : words) {
			System.out.println(w);
		}
	}
}

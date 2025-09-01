package NPTL25;

import java.util.Scanner;

public class W07_P1 {
	// Method to find the longest word in a given text
    public static String findLongestWord(String text) {
        String longestWord = "";

        // Split the text into words based on whitespace
        String[] words = text.split("\\s+");

        // Iterate through each word to find the longest one
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input text
        String text = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Call the method to find the longest word
        String longestWord = findLongestWord(text);

        // Print the longest word found
        System.out.println("The longest word in the text is: " + longestWord);
    }
}

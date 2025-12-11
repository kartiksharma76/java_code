package DsaImp;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {

    static void duplicateCharCount(String inputString) {
        // Creating a HashMap containing char as key and its occurrences as value
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Converting given string to char array
        char[] strArray = inputString.toCharArray();

        // Counting each char
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        System.out.println("Duplicate Characters In: " + inputString);

        // Printing only duplicates
        for (Character ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) > 1) {
                System.out.println(ch + " : " + charCountMap.get(ch));
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        duplicateCharCount("JavaJ2EE");
        duplicateCharCount("Fresh Fish");
        duplicateCharCount("Better Butter");
    }
}

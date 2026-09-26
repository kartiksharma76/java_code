package DsaQuestions.Walmart;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeating(String str) {

        Map<Character, Integer> frequency =
                new HashMap<>();

        // Step 1: Count frequency
        for (char ch : str.toCharArray()) {

            frequency.put(
                    ch,
                    frequency.getOrDefault(ch, 0) + 1
            );
        }

        // Step 2: Find first character
        for (char ch : str.toCharArray()) {

            if (frequency.get(ch) == 1) {
                return ch;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {

        String str = "swiss";

        char result =
                firstNonRepeating(str);

        if (result == '\0') {
            System.out.println(
                    "No non-repeating character found"
            );
        } else {
            System.out.println(
                    "First Non-Repeating Character = "
                            + result
            );
        }
    }
}
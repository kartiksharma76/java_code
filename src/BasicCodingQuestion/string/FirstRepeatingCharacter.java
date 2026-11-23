package BasicCodingQuestion.string;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        String str = "abcdbe";
        Set<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()){
            if (!seen.add(ch)){
                System.out.println(ch);
                break;
            }
        }
    }
}

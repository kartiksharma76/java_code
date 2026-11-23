package BasicCodingQuestion.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : s.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);
        for (char c : s.toCharArray()){
            if (map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}

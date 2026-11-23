package BasicCodingQuestion.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String s = "banana";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for (char ch : s.toCharArray()) map.put(ch,map.getOrDefault(ch,0) + 1);
        System.out.println(map);

    }
}

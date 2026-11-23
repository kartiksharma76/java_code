package BasicCodingQuestion.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        String s = "programming";
        Set<Character> set = new LinkedHashSet<>();
        for (char c : s.toCharArray()) set.add(c);
        StringBuilder sb = new StringBuilder();
        for (char c : set) sb.append(c);
        System.out.println(sb);   // progamin
    }
}

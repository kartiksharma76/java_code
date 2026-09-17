package Collections;

import java.util.HashSet;

public class HashSetToString {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("Java");
        languages.add("C++");

        System.out.println(languages);
    }
}

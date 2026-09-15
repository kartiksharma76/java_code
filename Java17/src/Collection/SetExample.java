package Collection;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<String> studentIDs = new HashSet<>();
        studentIDs.add("S101");
        studentIDs.add("S102");
        studentIDs.add("S101"); // Duplicate ignored

        System.out.println("Unique Student IDs:");
        for (String id : studentIDs) {
            System.out.println(id);
        }
    }
}
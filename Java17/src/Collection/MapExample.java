package Collection;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> rollNameMap = new HashMap<>();
        rollNameMap.put(101, "Aman");
        rollNameMap.put(102, "Riya");
        rollNameMap.put(103, "Karan");

        System.out.println("Student Roll -> Name:");
        for (Map.Entry<Integer, String> entry : rollNameMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

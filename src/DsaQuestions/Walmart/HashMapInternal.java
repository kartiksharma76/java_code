package DsaQuestions.Walmart;

import java.util.HashMap;
import java.util.Map;

public class HashMapInternal {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Kartik");
        map.put(102, "Rahul");
        map.put(103, "Aman");

        System.out.println("HashMap: " + map);

        System.out.println(
                "Value for key 102: "
                        + map.get(102)
        );

        System.out.println(
                "Contains key 101: "
                        + map.containsKey(101)
        );

        map.remove(103);

        System.out.println(
                "After removing 103: " + map
        );
    }
}

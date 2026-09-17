package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTraversal {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }
    }
}

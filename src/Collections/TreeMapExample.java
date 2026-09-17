package Collections;

import java.util.TreeMap;

public class TreeMapExample{
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");

        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println(map.higherKey(10));
        System.out.println(map.lowerKey(30));
    }
}

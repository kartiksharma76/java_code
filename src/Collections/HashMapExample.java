package Collections;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Rahul");
        map.put(102, "Aman");
        map.put(103, "Kartik");

        System.out.println(map);
        System.out.println(map.get(102));
        map.put(102, "Rohit");
        System.out.println(map);
        map.remove(101);
        System.out.println(map);
        System.out.println(map.containsKey(103));
        System.out.println(map.containsValue("Kartik"));
}
}

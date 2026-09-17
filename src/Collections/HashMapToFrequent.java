package Collections;

import java.util.HashMap;

public class HashMapToFrequent {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);
    }
}

package java8practice.Collection;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapApiPractice {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("twinkle",40000);
        map.put("prince",35000);
        map.put("kartik",40000);
        map.put("kundan",40000);
        System.out.println("Interate entries from the map:");
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entrySet.iterator();

        while (iterator.hasNext()){
            Map.Entry<String,Integer> next = iterator.next();
        }
        System.out.println("second approach: ");
        for (Map.Entry<String,Integer> entry : map.entrySet()){

        }
        System.out.println("approach third");
        BiConsumer<String,Integer> con = (k,v) -> System.out.println(k + " " + v);
        map.forEach(con);
        System.out.println("advance version approach 3");

        map.keySet().forEach(System.out::println);
        map.values().forEach(System.out::println);
    }
}

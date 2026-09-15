package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.Set;

public class MapAPIPractice {
public static void main(String[] args) {
	Map<String, Integer> map= new HashMap<>();
	map.put("twinkle",40000);
	map.put("prince",35000);
	map.put("kartik",40000);
	map.put("kunden",40000);
	System.out.println("iterate entries from the map:");
	//public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();iterate the entries
Set<Entry<String,Integer>> entrySet = map.entrySet();
   Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
   while(iterator.hasNext()) {
	   Entry<String,Integer> next = iterator.next();
	 //  System.out.println(next.getKey()+" "+next.getValue());
   }
   System.out.println("second approach:");
   for(Entry<String, Integer> entry:map.entrySet()) {
	 //  System.out.println(entry.getKey()+" "+entry.getValue());
   }
 System.out.println("approach third");
 // default void forEach(BiConsumer<? super K, ? super V> action)
 //void accept(T t, U u);
 BiConsumer<String, Integer> con= (k,v)-> System.out.println(k+" "+v);
	
 map.forEach(con);
 System.out.println("advance version approach 3");
// map.forEach(System.out::println);
// map.entrySet().forEach(System.out::println);
//
// map.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
// map.forEach((k,v)->System.out.println(k+" "+v));// advance version
 map.keySet().forEach(System.out::println);// only key
 map.values().forEach(System.out::println);// values
	}
}

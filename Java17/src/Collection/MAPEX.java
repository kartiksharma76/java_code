package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MAPEX {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");

		// entrySet+ foreach
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());

		}

		// Iterator
		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, String> e = it.next();

		
		}
		// BiConsumer
		map.forEach((k, v) -> System.out.println(k + "->" + v));
	}
}

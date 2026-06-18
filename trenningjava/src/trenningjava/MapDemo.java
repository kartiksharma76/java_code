package trenningjava;

import java.util.HashMap;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();

		map.put("scott", "tiger");
		map.put("jack", "lilly");
		map.put("polo", "lilly");
		map.put("jack", "rose");

		System.out.println("Scott: " + map.get("scott"));
		System.out.println("Polo: " + map.get("polo"));
		System.out.println("Jack: " + map.get("jack"));

		for (String key : map.keySet())
			System.out.println(key + " = " + map.get(key));
	}
}

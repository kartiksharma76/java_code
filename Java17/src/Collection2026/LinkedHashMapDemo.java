package Collection2026;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

		map.put(1, "A");
		map.put(2, "B");

		System.out.println(map);
	}
}

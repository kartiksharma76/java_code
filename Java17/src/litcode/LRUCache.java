package litcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
	private LinkedHashMap<Integer, Integer> map;
	private final int capacity;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		// The third argument 'true' is for access-order (instead of insertion-order)
		this.map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
			@Override
			protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
				return size() > LRUCache.this.capacity;
			}
		};
	}

	public int get(int key) {
		return map.getOrDefault(key, -1);
	}

	public void put(int key, int value) {
		map.put(key, value);
	}

	public static void main(String[] args) {
		// Initialize cache with capacity of 2
		LRUCache cache = new LRUCache(2);

		System.out.println("Putting (1, 10) and (2, 20)...");
		cache.put(1, 10);
		cache.put(2, 20);

		System.out.println("Get key 1: " + cache.get(1)); // returns 10 (1 is now most recently used)

		System.out.println("Putting (3, 30) - This should evict key 2...");
		cache.put(3, 30);

		System.out.println("Get key 2: " + cache.get(2)); // returns -1 (not found)
		System.out.println("Get key 1: " + cache.get(1)); // returns 10
		System.out.println("Get key 3: " + cache.get(3)); // returns 30
	}
}
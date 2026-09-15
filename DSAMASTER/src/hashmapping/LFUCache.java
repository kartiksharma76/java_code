package hashmapping;

import java.util.*;

// LFU Cache (Least Frequently Used)
public class LFUCache {
    private final int capacity;
    private int minFreq;
    private final Map<Integer, Integer> keyToVal = new HashMap<>();
    private final Map<Integer, Integer> keyToFreq = new HashMap<>();
    private final Map<Integer, LinkedHashSet<Integer>> freqToKeys = new HashMap<>();

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.minFreq = 0;
    }

    public int get(int key) {
        if (!keyToVal.containsKey(key)) return -1;
        bumpFreq(key);
        return keyToVal.get(key);
    }

    public void put(int key, int value) {
        if (capacity <= 0) return;
        if (keyToVal.containsKey(key)) {
            keyToVal.put(key, value);
            bumpFreq(key);
            return;
        }
        if (keyToVal.size() == capacity) {
            int evictKey = freqToKeys.get(minFreq).iterator().next();
            freqToKeys.get(minFreq).remove(evictKey);
            keyToVal.remove(evictKey);
            keyToFreq.remove(evictKey);
        }
        keyToVal.put(key, value);
        keyToFreq.put(key, 1);
        freqToKeys.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
        minFreq = 1;
    }

    private void bumpFreq(int key) {
        int freq = keyToFreq.get(key);
        freqToKeys.get(freq).remove(key);
        if (freqToKeys.get(freq).isEmpty()) {
            freqToKeys.remove(freq);
            if (minFreq == freq) minFreq++;
        }
        keyToFreq.put(key, freq + 1);
        freqToKeys.computeIfAbsent(freq + 1, k -> new LinkedHashSet<>()).add(key);
    }
}

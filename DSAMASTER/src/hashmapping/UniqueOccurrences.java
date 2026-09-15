package hashmapping;

import java.util.*;

// Unique Number of Occurrences
public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : arr) freq.merge(n, 1, Integer::sum);
        Set<Integer> occurrences = new HashSet<>(freq.values());
        return occurrences.size() == freq.size();
    }
}

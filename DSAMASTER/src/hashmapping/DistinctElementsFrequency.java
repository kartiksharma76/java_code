package hashmapping;

import java.util.*;

// Find distinct elements / Find the Frequency of elements
public class DistinctElementsFrequency {
    public List<Integer> distinctElements(int[] arr) {
        List<Integer> res = new ArrayList<>(new LinkedHashSet<>(boxed(arr)));
        return res;
    }
    public Map<Integer, Integer> frequency(int[] arr) {
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (int n : arr) freq.merge(n, 1, Integer::sum);
        return freq;
    }
    private List<Integer> boxed(int[] arr) {
        List<Integer> l = new ArrayList<>();
        for (int n : arr) l.add(n);
        return l;
    }
}

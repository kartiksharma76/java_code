package hashmapping;

import java.util.*;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int n : nums1) set1.add(n);
        Set<Integer> res = new HashSet<>();
        for (int n : nums2) {
            if (set1.contains(n)) res.add(n);
        }
        int[] arr = new int[res.size()];
        int i = 0;
        for (int n : res) arr[i++] = n;
        return arr;
    }
}

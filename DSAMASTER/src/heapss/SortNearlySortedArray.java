package heapss;

import java.util.*;

// Sort a K Sorted (Nearly Sorted) Array
public class SortNearlySortedArray {
    public int[] sortKSortedArray(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] res = new int[arr.length];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
            if (minHeap.size() > k) res[idx++] = minHeap.poll();
        }
        while (!minHeap.isEmpty()) res[idx++] = minHeap.poll();
        return res;
    }
}

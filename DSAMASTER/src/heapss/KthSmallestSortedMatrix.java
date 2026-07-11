package heapss;

import java.util.*;

// Kth Smallest Element in a Sorted Matrix
public class KthSmallestSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> matrix[a[0]][a[1]] - matrix[b[0]][b[1]]);
        for (int r = 0; r < Math.min(n, k); r++) minHeap.add(new int[]{r, 0});
        int result = -1;
        for (int i = 0; i < k; i++) {
            int[] cur = minHeap.poll();
            result = matrix[cur[0]][cur[1]];
            if (cur[1] + 1 < matrix[0].length) minHeap.add(new int[]{cur[0], cur[1] + 1});
        }
        return result;
    }
}

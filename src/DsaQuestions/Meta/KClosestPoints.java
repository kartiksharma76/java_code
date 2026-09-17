package DsaQuestions.Meta;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPoints {
    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(distance(b), distance(a)));

        for (int[] point : points) {

            maxHeap.offer(point);

            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        int[][] result = new int[k][2];

        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }

    private static int distance(int[] point) {

        return point[0] * point[0]
                + point[1] * point[1];
    }

    public static void main(String[] args) {
        int[][] points = {
                {1, 3},
                {-2, 2},
                {5, 8},
                {0, 1}
        };
        int k = 2;
        int[][] result = kClosest(points, k);
        System.out.println("k Closest Points:");

        for (int[] point : result) {
            System.out.println(
                    Arrays.toString(point)
            );
        }

    }
}


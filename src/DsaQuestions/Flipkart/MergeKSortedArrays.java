package DsaQuestions.Flipkart;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
    public static int[] mergeKArray(int[][] arrays) {
        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.value));
        int totalSize = 0;

        for (int i = 0; i < arrays.length; i++) {
            totalSize += arrays[i].length;
            if (arrays[i].length > 0) {
                minHeap.offer(new Node(arrays[i][0], i, 0));

            }
        }
        int[] result = new int[totalSize];
        int index = 0;
        while (!minHeap.isEmpty()) {
            Node current = minHeap.poll();
            result[index++] = current.value;
            int nextIndex = current.elementIndex + 1;

            if (nextIndex < arrays[current.arrayIndex].length) {
                minHeap.offer(new Node(arrays[current.arrayIndex][nextIndex], current.arrayIndex, nextIndex));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arrays = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[] result = mergeKArray(arrays);
        System.out.println("Merged Array: " + Arrays.toString(result));
    }

    static class Node {
        int value;
        int arrayIndex;
        int elementIndex;

        Node(int value, int arrayIndex, int elementIndex) {
            this.value = value;
            this.arrayIndex = arrayIndex;
            this.elementIndex = elementIndex;
        }
    }
}

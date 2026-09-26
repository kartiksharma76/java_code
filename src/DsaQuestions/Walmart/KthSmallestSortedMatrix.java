package DsaQuestions.Walmart;

import java.util.PriorityQueue;

public class KthSmallestSortedMatrix {

    public static int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;

        PriorityQueue<Cell> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.value, b.value));

        // First element of every row
        for (int row = 0; row < n; row++) {

            minHeap.offer(new Cell(matrix[row][0], row, 0));
        }

        // Remove smallest k-1 elements
        for (int i = 1; i < k; i++) {

            Cell current = minHeap.poll();

            int nextCol = current.col + 1;

            // Add next element from same row
            if (nextCol < n) {

                minHeap.offer(new Cell(matrix[current.row][nextCol], current.row, nextCol));
            }
        }

        return minHeap.peek().value;
    }

    public static void main(String[] args) {

        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};

        int k = 8;

        int result = kthSmallest(matrix, k);

        System.out.println("Kth Smallest Element = " + result);
    }

    static class Cell {

        int value;
        int row;
        int col;

        Cell(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }
}
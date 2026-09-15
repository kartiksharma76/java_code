package heapss;

import java.util.*;

// Implement Min/Max Heap from scratch
public class ImplementMinMaxHeap {
    public static class MinHeap {
        private final List<Integer> heap = new ArrayList<>();

        public void push(int val) {
            heap.add(val);
            int i = heap.size() - 1;
            while (i > 0) {
                int parent = (i - 1) / 2;
                if (heap.get(parent) <= heap.get(i)) break;
                swap(parent, i);
                i = parent;
            }
        }

        public int pop() {
            int top = heap.get(0);
            int last = heap.remove(heap.size() - 1);
            if (!heap.isEmpty()) {
                heap.set(0, last);
                heapifyDown(0);
            }
            return top;
        }

        public int peek() { return heap.get(0); }
        public boolean isEmpty() { return heap.isEmpty(); }

        private void heapifyDown(int i) {
            int n = heap.size();
            while (true) {
                int smallest = i, left = 2 * i + 1, right = 2 * i + 2;
                if (left < n && heap.get(left) < heap.get(smallest)) smallest = left;
                if (right < n && heap.get(right) < heap.get(smallest)) smallest = right;
                if (smallest == i) break;
                swap(i, smallest);
                i = smallest;
            }
        }
        private void swap(int i, int j) {
            int tmp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, tmp);
        }
    }

    public static class MaxHeap {
        private final List<Integer> heap = new ArrayList<>();

        public void push(int val) {
            heap.add(val);
            int i = heap.size() - 1;
            while (i > 0) {
                int parent = (i - 1) / 2;
                if (heap.get(parent) >= heap.get(i)) break;
                swap(parent, i);
                i = parent;
            }
        }

        public int pop() {
            int top = heap.get(0);
            int last = heap.remove(heap.size() - 1);
            if (!heap.isEmpty()) {
                heap.set(0, last);
                heapifyDown(0);
            }
            return top;
        }

        public int peek() { return heap.get(0); }
        public boolean isEmpty() { return heap.isEmpty(); }

        private void heapifyDown(int i) {
            int n = heap.size();
            while (true) {
                int largest = i, left = 2 * i + 1, right = 2 * i + 2;
                if (left < n && heap.get(left) > heap.get(largest)) largest = left;
                if (right < n && heap.get(right) > heap.get(largest)) largest = right;
                if (largest == i) break;
                swap(i, largest);
                i = largest;
            }
        }
        private void swap(int i, int j) {
            int tmp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, tmp);
        }
    }
}

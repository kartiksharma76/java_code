package heapss;

// Check if an array represents a min heap
public class CheckMinHeap {
    public boolean isMinHeap(int[] arr) {
        int n = arr.length;
        for (int i = 0; i <= (n - 2) / 2; i++) {
            int left = 2 * i + 1, right = 2 * i + 2;
            if (left < n && arr[i] > arr[left]) return false;
            if (right < n && arr[i] > arr[right]) return false;
        }
        return true;
    }
}

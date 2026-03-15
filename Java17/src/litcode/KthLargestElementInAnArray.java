package litcode;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    
    /**
     * Finds the kth largest element in an array.
     * Uses a min-heap (PriorityQueue) to keep track of the k largest elements.
     * 
     * @param nums The input array
     * @param k The k value (1-based indexing: 1st largest, 2nd largest, etc.)
     * @return The kth largest element
     */
    public int findKthLargest(int[] nums, int k) {  // FIXED: Method name was misspelled as "findKthLargrst"
        // Create a min-heap (smallest element at the top)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        // Process each number in the array
        for (int num : nums) {
            pq.add(num);  // Add current number to heap

            // If heap size exceeds k, remove the smallest element
            // This ensures heap always contains the k largest elements seen so far
            if (pq.size() > k)
                pq.poll();  // Removes the smallest element (min-heap property)
        }
        
        // The top of the heap is the kth largest element
        // (smallest among the k largest elements)
        return pq.peek();
    }
    
    /**
     * Alternative approach: Using max-heap
     * This is included for educational purposes
     */
    public int findKthLargestMaxHeap(int[] nums, int k) {
        // Max-heap: pass a comparator to reverse the order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        
        // Add all elements to max-heap
        for (int num : nums) {
            maxHeap.add(num);
        }
        
        // Remove (k-1) largest elements
        for (int i = 0; i < k - 1; i++) {
            maxHeap.poll();
        }
        
        // The next element is the kth largest
        return maxHeap.peek();
    }
    
    /**
     * Main method to test the Kth Largest Element functionality
     */
    public static void main(String[] args) {
        KthLargestElementInAnArray solution = new KthLargestElementInAnArray();
        
        System.out.println("KTH LARGEST ELEMENT IN AN ARRAY");
        System.out.println("================================");
        
        // Test Case 1: Basic example
        System.out.println("\nTest Case 1: Basic Example");
        System.out.println("---------------------------");
        
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        
        System.out.println("Array: [3, 2, 1, 5, 6, 4]");
        System.out.println("k = " + k1 + " (2nd largest)");
        
        int result1 = solution.findKthLargest(nums1, k1);
        System.out.println("Result: " + result1);
        System.out.println("Expected: 5");
        System.out.println("Explanation: Sorted array [1,2,3,4,5,6], 2nd largest = 5");
        
        // Test Case 2: Duplicate elements
        System.out.println("\nTest Case 2: With Duplicates");
        System.out.println("-----------------------------");
        
        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        
        System.out.println("Array: [3, 2, 3, 1, 2, 4, 5, 5, 6]");
        System.out.println("k = " + k2 + " (4th largest)");
        
        int result2 = solution.findKthLargest(nums2, k2);
        System.out.println("Result: " + result2);
        System.out.println("Expected: 4");
        System.out.println("Explanation: Sorted array [1,2,2,3,3,4,5,5,6], 4th largest = 4");
        
        // Test Case 3: k = 1 (largest element)
        System.out.println("\nTest Case 3: k = 1 (Largest Element)");
        System.out.println("-------------------------------------");
        
        int[] nums3 = {7, 10, 4, 3, 20, 15};
        int k3 = 1;
        
        System.out.println("Array: [7, 10, 4, 3, 20, 15]");
        System.out.println("k = " + k3 + " (largest)");
        
        int result3 = solution.findKthLargest(nums3, k3);
        System.out.println("Result: " + result3);
        System.out.println("Expected: 20");
        
        // Test Case 4: k = array length (smallest element)
        System.out.println("\nTest Case 4: k = n (Smallest Element)");
        System.out.println("---------------------------------------");
        
        int[] nums4 = {7, 10, 4, 3, 20, 15};
        int k4 = nums4.length;
        
        System.out.println("Array: [7, 10, 4, 3, 20, 15]");
        System.out.println("k = " + k4 + " (smallest element - 6th largest)");
        
        int result4 = solution.findKthLargest(nums4, k4);
        System.out.println("Result: " + result4);
        System.out.println("Expected: 3");
        
        // Test Case 5: Single element array
        System.out.println("\nTest Case 5: Single Element Array");
        System.out.println("----------------------------------");
        
        int[] nums5 = {42};
        int k5 = 1;
        
        System.out.println("Array: [42]");
        System.out.println("k = " + k5);
        
        int result5 = solution.findKthLargest(nums5, k5);
        System.out.println("Result: " + result5);
        System.out.println("Expected: 42");
        
        // Test Case 6: Negative numbers
        System.out.println("\nTest Case 6: With Negative Numbers");
        System.out.println("-----------------------------------");
        
        int[] nums6 = {-1, -5, -3, -2, -4};
        int k6 = 2;
        
        System.out.println("Array: [-1, -5, -3, -2, -4]");
        System.out.println("k = " + k6 + " (2nd largest)");
        
        int result6 = solution.findKthLargest(nums6, k6);
        System.out.println("Result: " + result6);
        System.out.println("Expected: -2");
        System.out.println("Explanation: Sorted array [-5,-4,-3,-2,-1], 2nd largest = -2");
        
        // Test Case 7: Compare both approaches
        System.out.println("\nTest Case 7: Comparing Min-Heap vs Max-Heap Approaches");
        System.out.println("------------------------------------------------------");
        
        int[] nums7 = {3, 2, 1, 5, 6, 4};
        int k7 = 3;
        
        System.out.println("Array: [3, 2, 1, 5, 6, 4]");
        System.out.println("k = " + k7 + " (3rd largest)");
        
        int minHeapResult = solution.findKthLargest(nums7, k7);
        int maxHeapResult = solution.findKthLargestMaxHeap(nums7, k7);
        
        System.out.println("Min-Heap Approach Result: " + minHeapResult);
        System.out.println("Max-Heap Approach Result: " + maxHeapResult);
        System.out.println("Expected: 4");
        System.out.println("Both approaches match: " + (minHeapResult == maxHeapResult));
        
        // Summary
        System.out.println("\n" + "=".repeat(60));
        System.out.println("\nSUMMARY OF RESULTS:");
        System.out.println("-------------------");
        System.out.println("Test Case 1 (2nd largest): " + result1);
        System.out.println("Test Case 2 (4th largest with duplicates): " + result2);
        System.out.println("Test Case 3 (1st largest): " + result3);
        System.out.println("Test Case 4 (Smallest): " + result4);
        System.out.println("Test Case 5 (Single element): " + result5);
        System.out.println("Test Case 6 (Negative numbers): " + result6);
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("\nHOW THE MIN-HEAP APPROACH WORKS:");
        System.out.println("--------------------------------");
        System.out.println("1. Create a min-heap (PriorityQueue)");
        System.out.println("2. Add elements one by one");
        System.out.println("3. When heap size exceeds k, remove the smallest element");
        System.out.println("4. After processing all elements, heap contains k largest elements");
        System.out.println("5. The top of the heap (smallest in heap) is the kth largest");
        
        System.out.println("\nExample with array [3,2,1,5,6,4] and k=3:");
        System.out.println("  Add 3 -> heap [3]");
        System.out.println("  Add 2 -> heap [2,3]");
        System.out.println("  Add 1 -> heap [1,3,2]");
        System.out.println("  Add 5 -> heap [2,3,5] (size>3, removed 1)");
        System.out.println("  Add 6 -> heap [3,5,6] (removed 2)");
        System.out.println("  Add 4 -> heap [4,6,5] (removed 3)");
        System.out.println("  Top of heap = 4 → 3rd largest element");
        
        System.out.println("\nTime Complexity: O(n log k)");
        System.out.println("Space Complexity: O(k)");
    }
}
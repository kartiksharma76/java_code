package DsaQuestions.uber;

import java.util.PriorityQueue;

public class MedianFinder {

    // Max-heap: smaller half
    private PriorityQueue<Integer> maxHeap;

    // Min-heap: larger half
    private PriorityQueue<Integer> minHeap;

    public MedianFinder() {

        maxHeap = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        minHeap = new PriorityQueue<>();
    }

    public static void main(String[] args) {

        MedianFinder finder = new MedianFinder();

        finder.addNum(5);
        System.out.println(finder.findMedian());

        finder.addNum(10);
        System.out.println(finder.findMedian());

        finder.addNum(1);
        System.out.println(finder.findMedian());

        finder.addNum(3);
        System.out.println(finder.findMedian());
    }

    public void addNum(int num) {

        // Add to smaller half
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {

            maxHeap.offer(num);

        } else {

            minHeap.offer(num);
        }

        // Balance heaps
        if (maxHeap.size() > minHeap.size() + 1) {

            minHeap.offer(maxHeap.poll());

        } else if (minHeap.size() > maxHeap.size()) {

            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {

        if (maxHeap.size() > minHeap.size()) {

            return maxHeap.peek();
        }

        return ((double) maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}
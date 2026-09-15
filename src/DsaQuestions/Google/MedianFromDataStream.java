package DsaQuestions.Google;

import java.util.PriorityQueue;

public class MedianFromDataStream {
    private PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public void addNum(int num) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }

        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        }

        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {

        if (maxHeap.size() == minHeap.size()) {

            return (maxHeap.peek() + minHeap.peek()) / 2.0;

        } else {

            return maxHeap.peek();
        }
    }

    public static void main(String[] args) {
        MedianFromDataStream obj = new MedianFromDataStream();
        int[] nums = {5, 15, 1, 3};

        for (int num : nums) {
            obj.addNum(num);
            System.out.println("After adding " + num + " -> Median = " + obj.findMedian());
        }
    }
}

package Heap;

import java.util.PriorityQueue;

public class MedianFinder {
	PriorityQueue<Integer> lo = new PriorityQueue<>((a, b) -> b - a); // max heap
	PriorityQueue<Integer> hi = new PriorityQueue<>(); // min heap

	public void addNum(int num) {
		lo.add(num);
		hi.add(lo.poll());
		if (lo.size() < hi.size())
			lo.add(hi.poll());
	}

	public double findMedian() {
		return lo.size() > hi.size() ? lo.peek() : (lo.peek() + hi.peek()) / 2.0;
	}

	public static void main(String[] args) {
		MedianFinder mf = new MedianFinder();
		mf.addNum(1);
		mf.addNum(2);
		System.out.println(mf.findMedian()); // 1.5
		mf.addNum(3);
		System.out.println(mf.findMedian()); // 2.0
	}
}

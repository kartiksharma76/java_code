package Heap;

public class MaxHeapTest1 {
	public static void main(String[] args) {
		MaxHeap1 heap = new MaxHeap1();
		heap.insert(1);
		heap.insert(10);
		heap.insert(100);
		heap.insert(12);
		heap.insert(13);
		heap.insert(14);
		heap.insert(1000);
		heap.insert(110);
		heap.insert(120);
		heap.insert(150);
		heap.Display();
		System.out.println("after delete:");
		heap.delete();
		heap.Display();

	}
}

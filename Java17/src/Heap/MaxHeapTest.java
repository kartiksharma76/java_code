package Heap;

public class MaxHeapTest {
	public static void main(String[] args) {
		MaxHeap heap = new MaxHeap();
		heap.insert(10);
		heap.insert(5);
		heap.insert(15);
		heap.insert(3);
		heap.insert(2);
		heap.insert(9);
		heap.Display();
		System.out.println("\nAfter deletion");
		heap.delete();
		heap.Display();
	}
}

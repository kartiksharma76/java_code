package Heap;

public class MyHeapTest {
	public static void main(String[] args) {
		MyHeap heap = new MyHeap();
		heap.insert(20);
		heap.insert(30);
		heap.insert(40);
		heap.insert(50);
		heap.insert(60);
		heap.display();
		System.out.println("\nAfter deleteion");
		heap.delete();
		heap.display();
	}
}

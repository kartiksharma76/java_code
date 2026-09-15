package RGPV;

public class HeapTest {
	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.insert(30);
		heap.insert(50);
		heap.insert(70);
		heap.insert(20);
		heap.insert(10);
		heap.insert(90);
		heap.insert(80);
		heap.display();
		System.out.println("\nAfter deleting");
		heap.delete();
		heap.display();
	}
}

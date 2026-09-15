package javapractice2026;

public class HeapTest {
	public static void main(String[] args) {
		Heap heap = new Heap();
		heap.insert(10);
		heap.insert(20);
		heap.insert(30);
		heap.insert(40);
		heap.insert(50);
		heap.display();
		System.out.println("/n after delete");
		heap.delete();
		heap.delete();
		heap.display();

	}
}

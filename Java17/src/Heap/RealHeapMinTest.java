package Heap;

public class RealHeapMinTest {
	public static void main(String[] args) {
		RealHeapMin h = new RealHeapMin();

		h.insert(5);
		h.insert(3);
		h.insert(8);
		h.insert(1);
		h.insert(4);

		h.display();

		h.delete();

		h.display();

		h.insert(2);

		h.display();

		h.delete();

		h.display();
	}
}

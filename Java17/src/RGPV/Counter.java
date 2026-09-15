package RGPV;

public class Counter {
	private int value;

	// Constructor
	public Counter(int value) {
		this.value = value;
	}

	public Counter incerent() {
		this.value++;
		return this;

	}

	public Counter decerent() {
		this.value--;
		return this;

	}

	public String toString() {
		return "counter value:" + value;

	}

	public static void main(String[] args) {
		Counter counter = new Counter(5);
		System.out.println("Initial: " + counter);

		counter.incerent(); // Mimic ++
		System.out.println("After increment: " + counter);

		counter.decerent(); // Mimic --
		System.out.println("After decrement: " + counter);
	}
}

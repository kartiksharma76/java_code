package javaDsaPattern;

import java.util.LinkedList;

public class HashChaining {

	int size = 10;
	LinkedList<Integer>[] table;

	HashChaining() {
		table = new LinkedList[size];

		for (int i = 0; i < size; i++) {
			table[i] = new LinkedList<>();
		}
	}

	// Hash Function
	int hash(int key) {
		return key % size;
	}

	// Insert
	void insert(int key) {
		int index = hash(key);
		table[index].add(key);
	}

	// Search
	boolean search(int key) {
		int index = hash(key);
		return table[index].contains(key);
	}

	// Delete
	void delete(int key) {
		int index = hash(key);
		table[index].remove(Integer.valueOf(key));
	}

	// Display
	void display() {
		for (int i = 0; i < size; i++) {
			System.out.print(i + " -> ");
			for (int value : table[i]) {
				System.out.print(value + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		HashChaining ht = new HashChaining();

		ht.insert(10);
		ht.insert(20);
		ht.insert(15);
		ht.insert(25);
		ht.insert(35);

		ht.display();

		System.out.println("Search 25: " + ht.search(25));

		ht.delete(25);

		System.out.println("After Deleting 25:");
		ht.display();
	}
}

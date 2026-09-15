package javaDsaPattern;

public class HashTable {
	int size = 10;
	int table[] = new int[size];

	public HashTable() {
		for (int i = 0; i < size; i++) {
			table[i] = -1;
		}

	}

	int hash(int key) {
		return key % size;
	}

	public void insert(int key) {
		int index = hash(key);

		while (table[index] != -1) {
			index = (index + 1) % size;
		}
		table[index] = key;
	}

	boolean search(int key) {
		int index = hash(key);
		int start = index;

		while (table[index] != -1) {
			if (table[index] == key)
				return true;

			index = (index + 1) % size;

			if (index == start)
				break;
		}
		return false;
	}

	public void display() {
		System.out.println("Hash Table :");
		for (int i = 0; i < size; i++) {
			System.out.println(i + "->" + table[i]);
		}
	}

	public static void main(String[] args) {
		HashTable ht = new HashTable();

		ht.insert(10);
		ht.insert(20);
		ht.insert(30);
		ht.insert(25);
		ht.insert(15);

		ht.display();

		System.out.println("Search 25: " + ht.search(25));
		System.out.println("Search 40: " + ht.search(40));

	}
}

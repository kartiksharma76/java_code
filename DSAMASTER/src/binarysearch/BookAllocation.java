package binarysearch;

public class BookAllocation {

	static boolean possible(int[] books, int students, int limit) {

		int count = 1;
		int pages = 0;

		for (int book : books) {

			if (pages + book > limit) {
				count++;
				pages = book;
			} else {
				pages += book;
			}
		}

		return count <= students;
	}

	public static void main(String[] args) {

		int[] books = { 12, 34, 67, 90 };
		int students = 2;

		int low = 0;
		int high = 0;

		for (int b : books) {
			low = Math.max(low, b);
			high += b;
		}

		while (low < high) {

			int mid = low + (high - low) / 2;

			if (possible(books, students, mid))
				high = mid;
			else
				low = mid + 1;
		}

		System.out.println(low);
	}
}
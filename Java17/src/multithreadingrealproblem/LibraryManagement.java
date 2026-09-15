package multithreadingrealproblem;

class Library {

	private int availableBooks = 5;

	public synchronized void issueBooks(int books) {

		System.out.println("\n" + Thread.currentThread().getName() + " wants " + books + " book(s)");

		if (availableBooks >= books) {

			availableBooks -= books;

			System.out.println("Books Issued Successfully");
			System.out.println("Available Books : " + availableBooks);

		} else {

			System.out.println("Books Not Available");
			System.out.println("Only " + availableBooks + " book(s) available.");
		}
	}

	public synchronized void returnBooks(int books) {

		availableBooks += books;

		System.out.println("\n" + Thread.currentThread().getName() + " returned " + books + " book(s)");

		System.out.println("Available Books : " + availableBooks);
	}
}

public class LibraryManagement {

	public static void main(String[] args) throws InterruptedException {

		Library library = new Library();

		Thread student1 = new Thread(() -> {

			library.issueBooks(2);

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

			library.returnBooks(2);

		}, "Student-1");

		Thread student2 = new Thread(() -> library.issueBooks(3), "Student-2");

		Thread student3 = new Thread(() -> library.issueBooks(2), "Student-3");

		student1.start();
		student2.start();
		student3.start();

		student1.join();
		student2.join();
		student3.join();

		System.out.println("\nLibrary Closed.");
	}
}
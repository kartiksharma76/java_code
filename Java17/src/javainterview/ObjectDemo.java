package javainterview;

//Book class demonstrating Object class methods

class Book implements Cloneable {

	String ISBN;
	String title;

	// Constructor
	public Book(String ISBN, String title) {
		this.ISBN = ISBN;
		this.title = title;
	}

	// Getter
	public String getISBN() {
		return ISBN;
	}

	// ================= toString() =================
	// Object ko readable format me print karne ke liye
	@Override
	public String toString() {
		return "Book Details -> ISBN: " + ISBN + ", Title: " + title;
	}

	// ================= equals() =================
	// Data ke basis pe compare karega (not memory)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true; // same object

		if (obj == null || getClass() != obj.getClass())
			return false;

		Book book = (Book) obj;

		return ISBN.equals(book.ISBN) && title.equals(book.title);
	}

	// ================= hashCode() =================
	// equals ke saath override karna zaroori hai
	@Override
	public int hashCode() {
		return ISBN.hashCode() + title.hashCode();
	}

	// ================= clone() =================
	// Object ki copy banata hai
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // shallow copy
	}

	// ================= finalize() =================
	// Deprecated hai (sirf demo ke liye)
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called for: " + this.title);
	}
}

//================= MAIN CLASS =================

public class ObjectDemo {

	public static void main(String[] args) {

		try {
			// Create objects
			Book b1 = new Book("101", "Java Basics");
			Book b2 = new Book("101", "Java Basics");

			// ========== toString() ==========
			System.out.println("toString(): " + b1);

			// ========== equals() ==========
			System.out.println("equals(): " + b1.equals(b2));

			// ========== hashCode() ==========
			System.out.println("hashCode b1: " + b1.hashCode());
			System.out.println("hashCode b2: " + b2.hashCode());

			// ========== getClass() ==========
			System.out.println("Class Name: " + b1.getClass().getSimpleName());

			// ========== clone() ==========
			Book b3 = (Book) b1.clone();
			System.out.println("Cloned Object: " + b3);

			// ========== wait/notify demo (basic) ==========
			synchronized (b1) {
				b1.notify(); // just demo (normally thread use hota hai)
			}

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// finalize kab call hoga -> guaranteed nahi
	}
}
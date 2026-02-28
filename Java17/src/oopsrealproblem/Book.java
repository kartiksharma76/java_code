package oopsrealproblem;

public class Book {
	private String isbn;
	private String title;
	private String author;
	public boolean isAvailable;

	public Book(String isbn, String title, String author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailability(boolean status) {
		this.isAvailable = status;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}
}

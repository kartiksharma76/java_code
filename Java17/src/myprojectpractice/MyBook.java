package com.jdbc.myprojectpractice;

public class MyBook {
	private String bookId;
    private String bookName;
    private String author;
    private String publicatin;
    private int cost;
    private int edition;
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublicatin() {
		return publicatin;
	}
	public void setPublicatin(String publicatin) {
		this.publicatin = publicatin;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
}

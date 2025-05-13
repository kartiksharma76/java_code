package com.jdbc.myprojectpractice;

public class BookServicePractice {
	public static void main(String[] args) {
		MyBook book = new MyBook();
		book.setBookId("201");
		book.setAuthor("AnkitVerma");
		book.setBookName("Mastering java");
		book.setPublicatin("TechBookPress");
		book.setCost(550);
		book.setEdition(1);
		// BookService.insert(book);

		book = new MyBook();
		book.setBookId("202");
		book.setAuthor("Rahul Sharma");
		book.setBookName("Deep Dive into Python");
		book.setPublicatin("CodeCraft");
		book.setCost(620);
		book.setEdition(2);
		// BookService.insert(book);

		book = new MyBook();
		book.setBookId("203");
		book.setAuthor("Sneha Mehta");
		book.setBookName("Web Development with JavaScript");
		book.setPublicatin("WebTech Publishers");
		book.setCost(480);
		book.setEdition(1);
		// BookService.insert(book);

		book = new MyBook();
		book.setBookId("204");
		book.setAuthor("Karan Patel");
		book.setBookName("Advanced SQL Queries");
		book.setPublicatin("DBPress");
		book.setCost(430);
		book.setEdition(3);
	//	BookService.insert(book);

		book = new MyBook();
		book.setBookId("205");
		book.setAuthor("Priya Nair");
		book.setBookName("Data Structures Simplified");
		book.setPublicatin("AlgoHouse");
		book.setCost(510);
		book.setEdition(2);
		// BookService.insert(book);

		book = new MyBook();
		book.setBookId("206");
		book.setAuthor("Amit Ranjan");
		book.setBookName("Machine Learning with Python");
		book.setPublicatin("AIWorld");
		book.setCost(870);
		book.setEdition(1);
		// BookService.insert(book);

		book = new MyBook();
		book.setBookId("207");
		book.setAuthor("Megha Sharma");
		book.setBookName("Cloud Computing Essentials");
		book.setPublicatin("CloudNet");
		book.setCost(720);
		book.setEdition(2);
		// BookService.insert(book);

		book = new MyBook();
		book.setBookId("208");
		book.setAuthor("Ravi Kapoor");
		book.setBookName("Cyber Security 101");
		book.setPublicatin("SecureEdge");
		book.setCost(640);
		book.setEdition(1);
	//	BookService.insert(book);

		book = new MyBook();
		book.setBookId("209");
		book.setAuthor("Neha Joshi");
		book.setBookName("Operating Systems Concepts");
		book.setPublicatin("Systematic Press");
		book.setCost(700);
		book.setEdition(4);
		// BookService.insert(book);

		book = new MyBook();
		book.setBookId("211"); // Make sure this ID is unique!
		book.setBookName("Clean Code");
		book.setAuthor("Robert C. Martin");
		book.setPublicatin("Prentice Hall");
		book.setCost(499);
		book.setEdition(1);
		// BookService.insert(book);
		// BookService.update(book);
		//BookService.deleteBook("211");
		//BookService.fetchAllBook();
		BookService.fetchBookByAuthor("Ravi Kapoor");
	}
}

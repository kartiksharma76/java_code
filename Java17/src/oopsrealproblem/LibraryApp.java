package oopsrealproblem;

public class LibraryApp {
public static void main(String[] args) {
	Library library = new Library();
	 Book book1 = new Book("101", "Java Programming", "James Gosling");
     library.addBook(book1);
     
     Member member = new Member("M1", "Kartik");
     
     Loan loan = library.issueBook("101", member);
     library.returnBook(loan, member);
	
}
}

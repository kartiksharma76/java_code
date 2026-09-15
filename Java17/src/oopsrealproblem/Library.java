package oopsrealproblem;

import java.util.ArrayList;
import java.util.List;

class Library {

    private List<Book> books = new ArrayList<>();
    private List<Loan> activeLoans = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Loan issueBook(String isbn, Member member) {

        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {

                book.setAvailability(false);

                Loan loan = new Loan(book, member);
                activeLoans.add(loan);
                member.borrowBook(loan);

                System.out.println("Book Issued Successfully");
                return loan;
            }
        }

        throw new IllegalArgumentException("Book not available");
    }

    public void returnBook(Loan loan, Member member) {
        loan.returnBook();
        activeLoans.remove(loan);
        member.returnBook(loan);

        double fine = loan.calculateFine();
        System.out.println("Book Returned. Fine: ₹" + fine);
    }
}
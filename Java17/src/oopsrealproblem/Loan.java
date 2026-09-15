package oopsrealproblem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Loan {

    private Book book;
    private Member member;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    private static final int FINE_PER_DAY = 10;

    public Loan(Book book, Member member) {
        this.book = book;
        this.member = member;
        this.issueDate = LocalDate.now();
        this.dueDate = issueDate.plusDays(7);
    }

    public void returnBook() {
        this.returnDate = LocalDate.now();
        book.setAvailability(true);
    }

    public double calculateFine() {
        if (returnDate == null || returnDate.isBefore(dueDate)) {
            return 0;
        }

        long daysLate = ChronoUnit.DAYS.between(dueDate, returnDate);
        return daysLate * FINE_PER_DAY;
    }

    public Book getBook() {
        return book;
    }
}
package oopsrealproblem;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

class Member {

    private String memberId;
    private String name;
    private List<Loan> borrowedBooks = new ArrayList<>();

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public void borrowBook(Loan loan) {
        borrowedBooks.add(loan);
    }

    public void returnBook(Loan loan) {
        borrowedBooks.remove(loan);
    }

    public String getMemberId() {
        return memberId;
    }
}
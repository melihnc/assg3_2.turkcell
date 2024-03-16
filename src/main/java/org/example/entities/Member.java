package org.example.entities;

import java.time.LocalDateTime;

public class Member extends User{
    private int memberNo;
    private LocalDateTime memberStartDate;
    private Book[] borrowedBooks;

    public Member(int id, boolean isDeleted, String email, String password, String firstName, String lastName, String nationalId,
                  int memberNo, LocalDateTime memberStartDate, Book[] borrowedBooks) {
        super(id, isDeleted, email, password, firstName, lastName, nationalId);
        this.memberNo = memberNo;
        this.memberStartDate = memberStartDate;
        this.borrowedBooks = borrowedBooks;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public LocalDateTime getMemberStartDate() {
        return memberStartDate;
    }

    public void setMemberStartDate(LocalDateTime memberStartDate) {
        this.memberStartDate = memberStartDate;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}

package org.example.business;

import org.example.entities.Book;
import org.example.entities.Member;
import org.example.entities.Staff;

public interface LibraryService {
    //üye kayıt ...  +++
    //staff kayıt ... +++
    //**********
    //ödünç alma ...
    //ceza islemi ...

    void borrowBook(Member member, Staff staff, Book book);
    void returnBook(Member member, Staff staff, Book book);

}

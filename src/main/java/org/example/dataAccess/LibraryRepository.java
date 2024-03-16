package org.example.dataAccess;

import org.example.entities.Book;
import org.example.entities.Member;
import org.example.entities.Staff;

public interface LibraryRepository {
    void addToDb(Member member, Staff staff, Book book);
}

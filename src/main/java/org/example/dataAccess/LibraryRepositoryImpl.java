package org.example.dataAccess;

import org.example.entities.Book;
import org.example.entities.Member;
import org.example.entities.Staff;

public class LibraryRepositoryImpl implements LibraryRepository {


    @Override
    public void addToDb(Member member, Staff staff, Book book) {
        System.out.println("Veri tabanına kayıt edildi.!");
    }
}

package org.example;

import org.example.business.LibraryService;
import org.example.business.LibraryServiceImpl;
import org.example.business.UserService;
import org.example.business.UserServiceImpl;
import org.example.dataAccess.LibraryRepositoryImpl;
import org.example.dataAccess.UserRepositoryImpl;
import org.example.entities.Book;
import org.example.entities.Member;
import org.example.entities.Staff;
import org.example.logging.DatabaseLogger;
import org.example.logging.FileLogger;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff(1,false,"staff@turkcell.com","12345","Ahmet","Ahmetoğlu","22244488899",1);
        Member member = new Member(1,false,"member@turkcell.com","123456",
                "Duygu","Duygukızı","111222333440",1, LocalDateTime.now(),null);
        UserService userService = new UserServiceImpl(new FileLogger(), new UserRepositoryImpl());
        userService.addUser(staff);
        userService.addUser(member);

        /*EGER UYGULAMA SIMULE EDILECEK ISE BU SATIR CALISTIRILMALI*/
            LocalDateTime date = LocalDateTime.of(2024, Month.MARCH, 1, 0, 0);


        /*EGER UYGULAMA GERCEK DUNYA SIMULE EDILECEK ISE BU SATIR CALISTIRILMALI*/
            //LocalDateTime date = LocalDateTime.now();

        Book book = new Book(1, false,"GYGY 3.0","Halit Enes Kalaycı",180,true,date,"turkcell",null);
        LibraryService libraryService = new LibraryServiceImpl(new DatabaseLogger(), new LibraryRepositoryImpl());
        libraryService.borrowBook(member,staff,book);
        libraryService.returnBook(member,staff,book);
    }
}
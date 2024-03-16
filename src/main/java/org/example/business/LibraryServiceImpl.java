package org.example.business;

import org.example.dataAccess.LibraryRepository;
import org.example.entities.Book;
import org.example.entities.Member;
import org.example.entities.Staff;
import org.example.logging.BaseLogger;

import java.time.LocalDateTime;

public class LibraryServiceImpl implements LibraryService{
    BaseLogger logger;
    LibraryRepository libraryRepository;

    public LibraryServiceImpl(BaseLogger logger, LibraryRepository libraryRepository) {
        this.logger = logger;
        this.libraryRepository = libraryRepository;
    }

    @Override
    public void borrowBook(Member member, Staff staff, Book book) {
        logger.logMessage("Kitap ödünç alma işlemi başlatılıyor..");
        book.setAvailable(false);
        //book.setDueDate(LocalDateTime.now().plusDays(5));  //GERCEK DUNYA SIMULASYONDA AKTIF EDILMELIDIR.
        logger.logMessage(member.getEmail() +" -> Kitap ödünç aldı. Kitap ismi : " + book.getName());
        libraryRepository.addToDb(member, staff, book);
    }

    @Override
    public void returnBook(Member member, Staff staff, Book book) {
        logger.logMessage("Kitap iade işlemi başlatıldı...");
        book.setAvailable(true);
        logger.logMessage(member.getEmail() +" -> Kitabı iade etti. Kitap ismi : " + book.getName());
        logger.logMessage(staff.getEmail() +" -> Kitabı teslim aldı. Kitap ismi : " + book.getName());

        LocalDateTime currentDate = LocalDateTime.now();
        if (currentDate.isAfter(book.getDueDate())){
            long daysLate = currentDate.toLocalDate().toEpochDay() -
                    book.getDueDate().toLocalDate().toEpochDay();
            if (daysLate > 5) {
                logger.logMessage("Cezai işlem uygulandı.!");
            }
        }
        libraryRepository.addToDb(member, staff, book);
    }
}

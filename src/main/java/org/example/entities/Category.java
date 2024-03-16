package org.example.entities;

public class Category extends BaseEntity{
    private String name;
    private Book[] books;

    public Category(int id, boolean isDeleted, String name, Book[] books) {
        super(id, isDeleted);
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
